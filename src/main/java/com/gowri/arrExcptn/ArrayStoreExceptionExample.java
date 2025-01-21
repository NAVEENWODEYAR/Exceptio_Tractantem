package com.gowri.arrExcptn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author NaveenWodeyar
 * @date 21-Jan-2025 12:03:08 am
 */
public class ArrayStoreExceptionExample {

	static void arrStoreExcptn() {
		try {
			Object[] obj = new String[10];
			 obj[0] = new Integer(1);
			 System.out.println(obj);
		} catch (Exception e) {
			System.out.println("/nArrayStoreException is thrown when an attempt is made to store an element of an incompatible type into an array."
					+ " /nThis exception occurs at runtime and is a subclass of java.lang.RuntimeException"+e);
		}
	}
	
	public static void main(String[] args) {
		final Logger log =LoggerFactory.getLogger(ArrayStoreExceptionExample.class);
		log.info("ArrayStoreException");
		arrStoreExcptn();
	}
}
