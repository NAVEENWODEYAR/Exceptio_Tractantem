package com.gowri.criticalExceptions;

/**
 * @author NaveenWodeyar
 * @date 21-Jan-2025 10:25:17 pm
 */

public class ClassNotFoundExample {

	static void classNotFoundExample() {
		System.out.println("/n####/n");
		try {
			Class<?> forName = Class.forName("com.gowri.criticalExceptions.ClassNotFoundExample");
			System.out.println(forName);
		} catch (ClassNotFoundException e) {
			System.out.println("Exception: "+e.getLocalizedMessage());
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		System.out.println("ClassNotFoundException thrown when the JVM cannot find a class that is being referenced by the program.");
		classNotFoundExample();
	}

}
