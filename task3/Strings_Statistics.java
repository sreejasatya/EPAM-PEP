package task3;

import java.util.*;

public class Strings_Statistics {

	static int find_power(int x, int y, int mod) {
        if (y == 0)
            return 1;
        int pow = find_power(x, y / 2, mod);
        pow = (int) ((long) pow * pow % mod);
        if (y % 2 == 1)
            pow = (int) ((long) pow * x % mod);
        return pow;
    }
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n,a,mod,k,v;
        n= sc.nextInt();
        a = sc.nextInt();
        mod = sc.nextInt();
        arr = new int[n];
        int sum = 0;
        for (k = 1; k < n; k++)
            {for (v = 2; v < 1 << n - k + 1; v += 2)
            {
                sum = (sum + simplify(k, v, n, a, mod)) % mod;
            }
            }
        System.out.println(sum);
        sc.close();
    }
    static int simplify(int k, int v, int n, int a, int mod) {
        Arrays.fill(arr, -1);
        int b_cnt = 0, cnt = n;
        for (int i = 1; i < n; i++)
            if ((v & 1 << i) > 0) {
                for (int j = i; j < i + k; j++)
                    if (join(j, j - i))
                        cnt--;
                b_cnt++;
            }
        int sum = find_power(a, cnt, mod);
        return b_cnt % 2 == 1 ? sum : (mod - sum) % mod;
    }
    static int[] arr;
    static int find(int i) {
        return arr[i] < 0 ? i : (arr[i] = find(arr[i]));
    }
    static boolean join(int i, int j) {
        i = find(i);
        j = find(j);
        if (i == j)
            return false;
        if (arr[i] > arr[j])
            arr[i] = j;
        else {
            if (arr[i] == arr[j])
                arr[i]--;
            arr[j] = i;
        }
        return true;
    }
    
}