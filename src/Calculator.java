
public class Calculator {

	public Calculator() {
		// TODO Auto-generated constructor stub
			
	}
	
	
	/**
	 * Adds two numbers together.
	 * 
	 * @param x - first number to add
	 * @param y - second number to add
	 * @return sum of the two numbers
	 */
	public static double add(double x, double y) {
		return x + y;
	} 
	
	/**
	 * Subtracts two numbers.
	 * 
	 * @param x - number to subtract from
	 * @param y - number to subtract
	 * @return difference of the two numbers
	 */
	public static double subtract(double x, double y) {
		return x - y;
	}
	
	/**
	 * 
	 * @param x - first number to multiply
	 * @param y - second number to multiply
	 * @return product of the two numbers
	 */
	public static double multiply(double x, double y) {
		return x * y;
	}
	
	
	/**
	 * 
	 * @param x - number to divide
	 * @param y - number to divide by
	 * @return quotient of the two numbers
	 */
	public static double divide(double x, double y) {
		
		if (y == 0) {
			throw new ArithmeticException("Cannot divide by zero");
		}
		
		return x / y;
	}
	
}
