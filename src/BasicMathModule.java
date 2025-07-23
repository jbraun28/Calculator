
public class BasicMathModule implements OperationModule{

	@Override
	public boolean supports(String operation) {
		
		return operation.equals("+") || operation.equals("-") || 
				operation.equals("/") || operation.equals("*");
	}

	@Override
	public double compute(String operation, double[] operands) {
		double x = operands[0];
		double y = operands[1];
		
		switch(operation) {
			case "+":
				return x + y;
			case "-":
				return x - y;
			case "*":
				return x * y;
			case "/":
				if (y == 0) {
					throw new ArithmeticException("Cannot divide by zero");
				}
				return x / y;
			default:
				throw new UnsupportedOperationException("Unsupported operation: " + operation);
		}
		
		
	}
}
