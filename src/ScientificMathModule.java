
public class ScientificMathModule implements OperationModule{
	
	
	@Override
	public boolean supports(String operation) {
		return operation.equals("sin") ||  operation.equals("cos")
				|| operation.equals("sqrt");
	}

	@Override
	public double compute(String operation, double[] operands) {
		switch (operation) {
			case "sin": 
				return Math.sin(operands[0]);
			case "cos": 
				return Math.cos(operands[0]);
			case "sqrt": 
				return Math.sqrt(operands[0]);
			default:
				throw new UnsupportedOperationException("Unsupported operation: " + operation);
		}
		
	}


}
