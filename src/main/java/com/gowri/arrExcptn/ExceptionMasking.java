package com.gowri.arrExcptn;

/**
 * @author NaveenWodeyar
 * @date 28-Apr-2025 12:16:35 am
 */

public class ExceptionMasking {
	    public static void main(String[] args) {
	        try {
	            throwException();
	        } catch (Exception e) {
	            System.out.println("Caught: " + e);
	        }
	    }

	    static void throwException() throws Exception {
	        try {
	            throw new Exception("Exception from try");
	        } finally {
	            throw new Exception("Exception from finally");
	        }
	    }

}
