package task2;

/**
 * 
 * @author Vaishnavi
 * This program determines the simple interest for the given inputs.
 * 
 */

public class Simple_Interest extends Interest {
	public double interest(){
		return principal*rate_of_interest*years;
	}
}