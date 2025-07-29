package com.example.calculator;

/**
 * An interface that defines a module capable of performing
 * specific types of math operations.
 */
public interface OperationModule {
	
	/**
	 * Checks whether the module supports the given operation.
	 * 
	 * @param operation - operation name e.g., +, sin, cos, etc.
	 * @return boolean - true if module can handle it, false otherwise
	 */
	boolean supports (String operation);
	
	/**
	 * Computes the results of the given operation using
	 * given operands
	 * 
	 * @param operation - operation to perform
	 * @param operands - operands required for the computation
	 * @return result of computation
	 * 
	 * @throws UnsupportedOperationException if the operation is not supported
     * @throws IllegalArgumentException if the operands are invalid
	 */
	double compute (String operation, double[] operands);
	

}
