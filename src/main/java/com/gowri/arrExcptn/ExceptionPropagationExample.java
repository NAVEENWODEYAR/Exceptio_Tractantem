package com.gowri.arrExcptn;

/**
 * @author NaveenWodeyar
 * @date 31-Mar-2025 9:16:48 pm
 */

public class ExceptionPropagationExample {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }

    public static void method1() throws Exception {
        method2();
    }

    public static void method2() throws Exception {
        throw new Exception("Something went wrong in method2");
    }
}

