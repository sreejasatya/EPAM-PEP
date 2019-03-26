package task2;

import java.util.Scanner;

/**
 * 
 * @author Vaishnavi
 * This is the driver program that takes the input from user and calculates the simple and compound interest.
 * 
 */

public class Interest_estimator {


	public static void main(String args[]){
		int option;
		Interest interestEstimator;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter one of the given options:\n 1.Simple Interest\n 2.Compound Interest\n");
		option=sc.nextInt();
		switch(option){
			case 1: 
					interestEstimator=new Simple_Interest();
					getInput(interestEstimator,sc);
					System.out.println("Interest is given by: "+interestEstimator.interest());
					break;
			case 2:
				interestEstimator=new Compound_interest();
					getInput(interestEstimator,sc);
					System.out.println("Interest is given by: "+interestEstimator.interest());
					break;
			default:
					System.out.println("Invalid input");
				
		}
		
		sc.close();
	}
	
	static void getInput(Interest interestEstimator,Scanner sc){
		double principal,rate_of_interest,years_inp;
		System.out.println("Enter principal,rate of interest and number of years");
		principal=sc.nextDouble();
		rate_of_interest=sc.nextDouble();
		years_inp=sc.nextDouble();
		interestEstimator.principal=principal;
		interestEstimator.rate_of_interest=rate_of_interest;
		interestEstimator.years=years_inp;
	}
}