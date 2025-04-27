package com.gowri.arrExcptn;

/**
 * @author NaveenWodeyar
 * @date 28-Apr-2025 12:17:23 am
 */

public class NestedTryCatch {
	    public static void main(String[] args) {
	        try {
	            int a = 5 / 0;
	        } catch (ArithmeticException e) {
	            try {
	                String s = null;
	                s.length();  // NullPointerException
	            } catch (NullPointerException ne) {
	                System.out.println("Handled NullPointer in catch block");
	            }
	        } finally {
	            System.out.println("Finally always runs!");
	        }
	    }

}
