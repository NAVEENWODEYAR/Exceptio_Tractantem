package com.gowri.criticalExceptions;

/**
 * @author NaveenWodeyar
 * @date 21-Jan-2025 10:04:18 pm
 */

public class OutOfMemoryExample {

	static void outOfMemory() {
		try {
			Integer[] intArr = new Integer[Integer.MAX_VALUE];
		} catch (OutOfMemoryError e) {
			System.out.println("Exceptoin: "+e.getCause());
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println("OutOfMemoryError is thrown when the Java Virtual Machine (JVM) runs out of memory");
		outOfMemory();
		Integer[] intArr = new Integer[Integer.MAX_VALUE];
		System.out.println(intArr);
	}

}
