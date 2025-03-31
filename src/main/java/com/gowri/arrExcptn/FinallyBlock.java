package com.gowri.arrExcptn;

/**
 * @author NaveenWodeyar
 * @date 17-Mar-2025 9:36:27 am
 */

public class FinallyBlock {

	public static void main(String[] args) {
        try {
            System.out.println("In try block");
            return;
        } catch (Exception e) {
            System.out.println("In catch block");
        } finally {
            System.out.println("In finally block");
            return;
        }
	}
	
	 public static String testMethod() {
	        try {
	            System.out.println("Inside try block");
	            return "From try block";
	        } catch (Exception e) {
	            System.out.println("Inside catch block");
	            return "From catch block";
	        } finally {
	            System.out.println("Inside finally block");
	        }
	    }
	}
