package task2;
/**
 * 
 * @author Vaishnavi
 * Driver program which tests the calculator methods.
 */
public class calculatorTest {

	public static void main(String[] args)
	{
		additionTestCases();
		multiplicationTestCases();
		divisionTestCases();
	}
	
	static void additionTestCases(){
		
		calculator c = new calculator();
		
		//Test case 1:
		if(c.addition(1, 1)==2)
			System.out.println("Addition of 1 and 1 is 2");
		else
			System.out.println("wrong result for 1+1");
		//Test case 2
		if(c.addition(6, -6)==0)
			System.out.println("Addition of 6 and -6 is 0");
		else
			System.out.println("wrong result for 6+(-6)");
    
	}
	
static void multiplicationTestCases(){
		
		calculator c = new calculator();
		
		//Test case 1:
		if(c.multiplication(1, 2)==2)
			System.out.println("Multiplication of 1 and 2 is 2");
		else
			System.out.println("wrong result for 1*2");
		//Test case 2
		if(c.multiplication(6, -6)==-36)
			System.out.println("Multiplication of 6 and -6 is -36");
		else
			System.out.println("wrong result for 6*(-6)");
    
	}

static void divisionTestCases(){
	
	calculator c = new calculator();
	
	//Test case 1:
	if(c.division(15, 3)==5)
		System.out.println("Divison of 15 and 3 is 5");
	else
		System.out.println("wrong result for 15/3");
	//Test case 2
	if(c.division(6, -6)==-1)
		System.out.println("Division of 6 and -6 is -1");
	else
		System.out.println("wrong result for 6/(-6)");
	//	Test case 3
	try
	{
		double res=c.division(9,0);
		System.out.println("Divison of 9 and 0 is "+res);
	}
    catch(ArithmeticException d)
	{
		System.out.println("Divide by zero exception occured");  	
	}
}
	
}