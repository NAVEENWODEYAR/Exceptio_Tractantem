package com.gowri.arrExcptn;

/**
 * @author NaveenWodeyar
 * @date 19-May-2025 10:10:30 pm
 */

public class ExceptionTest {
    public static void main(String[] args) {
        System.out.println(testMethod());
    }

    public static int testMethod() {
        try {
            throw new RuntimeException("Exception in try");
        } catch (RuntimeException e) {
            System.out.println("Caught: " + e.getMessage());
            return 1;
        } finally {
            System.out.println("In finally block");
            return 2;
        }
    }
}

