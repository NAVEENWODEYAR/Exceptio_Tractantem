package com.gowri.arithmetic;

/**
 * @author NaveenWodeyar
 * @date 20-Jan-2025 9:29:02 pm
 */

public class ArithmeticExceptnExample {

	static void divisionByZero(Integer i) {
		System.out.println(i/0);
	}
	
	static void divisionByFloatingZero(Double d) {
		System.out.println(d/0.0);
	}
	
	static void moduloByZero(Integer i) {
		System.out.println(i%0);
	}
	
	public static void main(String[] args) {
		try {
			divisionByZero(1);
			divisionByFloatingZero(10.0);
			moduloByZero(1);
		} catch (Exception e) {
			System.out.println("Exceptoin occured"+e);
		}
		
	}
	
	
}
