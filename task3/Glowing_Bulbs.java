package task3;

import java.util.*;

public class Glowing_Bulbs {
	
	static ArrayList<Integer> primes_list = new ArrayList<>( 12 );
    public static long solve(long mid) {
        int primes = primes_list.size();
        long result = 0;
        for(int i = 1; i < (1 << primes); i++) {
            long product = 1;
            int sign = -1 ;
            for(int j = 0; j < primes; j++) {
                if(((i>>j) & 1) == 1){
                    product = product * primes_list.get(j);
                    sign *= -1;
                }
            }
            result += sign*(mid/product);
        }
        return result;
    }
    
	public static void main(String[] args) {

		Scanner sc = new Scanner( System.in );
        int test = sc.nextInt();
        long answer = 0;
        int i;
        while (test > 0) {
            primes_list.clear();
            String str = sc.next();
            long k = sc.nextLong();
            for(i = 0; i < str.length(); i++) {
                if(str.charAt(i) == '1')
                    primes_list.add(i + 1);
            }
            long low = 1;
            long high = 1000000000000000L;
            long mid = 0;
            while (low <= high) {
                mid = (low + high) >> 1;
                if(solve(mid) >= k){
                    answer = mid;
                    high = mid - 1;

                }
                else  low = mid + 1;
            }

            System.out.println(answer);
            test -= 1;
        }
        sc.close();
	}
}