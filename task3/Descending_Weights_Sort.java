package task3;

import java.util.*;

class Mycomparator implements Comparator<Integer>{
    public int compare(Integer a, Integer b){
        return b%Descending_Weights_Sort.k-a%Descending_Weights_Sort.k;
    }
}
public class Descending_Weights_Sort {

	public static int k;	        
	public static void main(String[] args) throws Exception{
	        Scanner sc = new Scanner(System.in);
	        int n;
	        n=sc.nextInt();
	        Descending_Weights_Sort.k=sc.nextInt();
	        ArrayList<Integer> arr = new ArrayList<Integer>();
	        int i;
	        for(i=0;i<n;i++){
	            arr.add(sc.nextInt());
	        }
	      
	        Collections.sort(arr);
	        Collections.sort(arr,new Mycomparator());
	        for(int x:arr){
	            System.out.print(x+" ");
	        }
	        sc.close();
	    }
	}