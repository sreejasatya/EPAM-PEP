package task4;

import java.util.*;

public class Self_Drive {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),i,x,y;
        long count = 0;
        for (i = 0; i < n; i++) {
            adj.add(new TreeSet<>());
        }
        for (i = 0; i < n - 1; i++) {
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
            adj.get(x).add(y);
            adj.get(y).add(x);
        }
        HashSet<Integer> set = new HashSet<>();
        for (i = 0; i < n; ++i) {
            set.add(i);
        }
        for (i = 2; i <= n && !set.isEmpty(); i++) {
            count = count+set.size();
            HashSet<Integer> nextset = new HashSet<>();
            for (Integer ele : set) {
                if (ele + i - 1 < n && isConnected(ele + i - 1, ele, ele + i - 2)) {
                    nextset.add(ele);
                }
                if (ele > 0 && isConnected(ele - 1, ele, ele + i - 2)) {
                    nextset.add(ele - 1);
                }
            }
            set = nextset;
        }
        count = count+set.size();
        System.out.println(count);
        sc.close();
    }
    static ArrayList<TreeSet<Integer>> adj = new ArrayList<>();

    static boolean isConnected(int node, int start, int end) {
        TreeSet<Integer> neighbors = adj.get(node);
        Integer possible = neighbors.higher(start - 1);
        return possible != null && possible <= end;
    }	
}