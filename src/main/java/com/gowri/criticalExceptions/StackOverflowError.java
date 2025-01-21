package com.gowri.criticalExceptions;

/**
 * @author NaveenWodeyar
 * @date 21-Jan-2025 10:11:42 pm
 */

public class StackOverflowError {

	static void recursiveMethod() {
		System.out.println("recursiveMethod()");
		recursiveMethod();
	}
	
	public static void main(String[] args) {
		System.out.println("StackOverflowError occurs when the stack, which is used for method calls and local variables, overflows due to deep or infinite recursion.");
		try {
			recursiveMethod();
		} catch (Exception e) {
			System.out.println("Exception: "+e.getMessage());
		}
	}

}
