package com.gowri.arrExcptn;

/**
 * @author NaveenWodeyar
 * @date 01-Apr-2025 9:01:57 pm
 */

public class ChainedExceptionTest {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            System.out.println("Caught in main: " + e);
            System.out.println("Cause: " + e.getCause());
        }
    }

    static void method1() throws Exception {
        try {
            method2();
        } catch (NullPointerException e) {
            throw new Exception("Exception in method1", e);  // Chaining
        }
    }

    static void method2() {
        String str = null;
        System.out.println(str.length());  // Will throw NullPointerException
    }
}

