package task2;

/**
 * 
 * @author Vaishnavi
 * This class includes three methods for
 * addition,multiplication and division 
 * of two numbers
 *
 */
public class calculator {
 
	/**
	 * default constructor
	 */
	
	calculator(){}
	
	/**
	 * finds addition of two numbers
	 * @param number1
	 * @param number2
	 * @return integer addition of two numbers
	 */
	public int addition(int number1,int number2)
	{
		return number1+number2;
	}
	
	/**
	 * finds multiplication of two numbers
	 * @param number1
	 * @param number2
	 * @return integer multiplication of a and b
	 */
	public int multiplication(int number1,int number2)
	{
		return number1*number2;
	}
	
	/**
	 * finds division of two numbers
	 * @param number1 (dividend)
	 * @param number2 (divisor)
	 * @return double number1 divides number2
	 */
	public double division(int number1,int number2)
	{
		if(number2==0)
			throw new ArithmeticException("Divide by zero exception");
		else
			return number1/(double)number2;
	}
}