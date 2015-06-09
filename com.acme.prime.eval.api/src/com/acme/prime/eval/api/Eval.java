package com.acme.prime.eval.api;

/**
 * 
 */
public interface Eval {
	
	/**
	 * Evaluate an expression and return the result.
	 */
	double eval(String expression) throws Exception;
	
}
