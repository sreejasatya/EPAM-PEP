package task2;

/**
 * 
 * @author Vaishnavi
 * This program determines the compound interest for the given inputs.
 * 
 */
public class Compound_interest extends Interest {
	public double interest(){
		return principal*Math.pow((1+rate_of_interest), years)-principal;
	}
}