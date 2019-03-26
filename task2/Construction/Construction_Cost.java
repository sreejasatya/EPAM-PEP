package task2;
/**
 *  This is the driver program that tests the construction class.
 */
import java.util.Scanner;

public class Construction_Cost {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		Construction construction;
		int material;
		double area;
		System.out.println("Enter input area");
		area=sc.nextDouble();
		if(area<=0){
			System.out.println("Invalid input, Area cannot be less than or equal to zero");
			System.exit(0);
		}
		System.out.println("Enter type of the material:\n 1.Standard\n 2.Above Standard\n 3.High Standard\n 4.High standard and fully automated");
		material=sc.nextInt();
		if(material>4 || material<1){
			System.out.println("Invalid input, Wrong material chosen");
			System.exit(0);
		}
		construction=new Construction(material,area);
		System.out.println("Construction cost is given by: "+construction.getCost());
		sc.close();
	}
}