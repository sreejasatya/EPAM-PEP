package task3;

import java.util.Scanner;

public class Rod_Cutting {

	/**
	 * 
	 * @param x
	 * @return number of special rods obtained
	 */
	
	public static int find_special(int x){
        int count = 0;
        while(x>0){
            x--;
            x/=2;
            count++;
            
        }
        return count;
	}
	
	public static void main(String[] args) {
		
		int x,testcases;
		Scanner sc = new Scanner(System.in);
        testcases = sc.nextInt();  
        for(int i=0;i<testcases;i++)
        {
             x= sc.nextInt();
             System.out.println(find_special(x)-1);
        }
        sc.close();
	}

}