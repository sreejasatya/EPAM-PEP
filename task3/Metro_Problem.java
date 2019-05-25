package task3;

import java.util.*;

public class Metro_Problem {

	static Scanner in=new Scanner(System.in);

	public static void main(String[] args) {
	        Metro solver_class = new Metro();
	        solver_class.solve();
	    }
	    public static class Metro {
	    	 class pair_2 {
	             int node;
	             long dis;

	             public pair_2(int node, long dis) {
	                 this.node = node;
	                 this.dis = dis;
	             }
	         }
	         class pair {
	             int u;
	             long w;
	             long t;

	             public pair(int u, long w, long t) {
	                 this.u = u;
	                 this.w = w;
	                 this.t = t;
	             }
	         }

	        public void solve() {
	            int n = in.nextInt();
	            int m = in.nextInt();
	            ArrayList<pair> arrayList[] = new ArrayList[n + 1];
	            for (int i = 0; i <= n; i++)
	            	{
	            	arrayList[i] = new ArrayList();
	            	}
	            for (int i = 0; i < m; i++) {
	                int s = in.nextInt();
	                long t = in.nextLong();
	                int arr[] = new int[s];
	                for (int j = 0; j < s; j++) 
	                	arr[j] = in.nextInt();
	                for (int j = 0; j < s - 1; j++) {
	                    int we = in.nextInt();
	                    arrayList[arr[j]].add(new pair(arr[j + 1], we,t));
	                    t += we;
	                }
	            }
	            int st = in.nextInt();
	            int end = in.nextInt();
	            long dis[] = new long[n + 1];
	            Arrays.fill(dis, Long.MAX_VALUE / 2);
	            dis[st] = 0;
	            PriorityQueue<pair_2> p_q = new PriorityQueue<>(10,new Comparator<pair_2>() {
	                public int compare(pair_2 o1, pair_2 o2) {
	                    return Long.compare(o1.dis, o2.dis);
	                }
	            });
	            p_q.add(new pair_2(st, dis[st]));
	            boolean visited[] = new boolean[n + 1];
	            visited[st] = true;
	            while (!p_q.isEmpty()) {
	                pair_2 p = p_q.poll();
	                if (p.node == end) {
	                    System.out.println(dis[p.node]);
	                    return;
	                }
	                for (pair p_p : arrayList[p.node]) {
	                    if (dis[p.node] <= p_p.t && dis[p_p.u] > dis[p.node] + p_p.w) {
	                        dis[p_p.u] = dis[p.node] + p_p.w;
	                        p_q.add(new pair_2(p_p.u, dis[p_p.u]));
	                    }
	                }
	            }
	            System.out.println(-1);
	        }
	    }
	}