package com.gowri.criticalExceptions;

/**
 * @author NaveenWodeyar
 * @date 21-Jan-2025 10:29:23 pm
 */

public class NoClassDefFoundErrorExample {

	static void noClassFoundEx() {
		try {
            ClassNotFoundExample myClass = new ClassNotFoundExample(); // MyClass might be missing at runtime
            System.out.println(myClass);
		} catch (Error e) {
            System.out.println("Exception : " + e.getMessage());
        }
	}
	
	public static void main(String[] args) {
		System.out.println(" occurs when the JVM tries to load a class but cannot find its definition, often because the class was available at compile-time but is missing at runtime.");
		noClassFoundEx();
	}

}
