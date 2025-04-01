package com.gowri.arrExcptn;

/**
 * @author NaveenWodeyar
 * @date 01-Apr-2025 9:02:44 pm
 */

public class RuntimeExceptionTest {
    public static void main(String[] args) {
        try {
            method1();
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e);
        }
    }

    static void method1() {
        try {
            method2();
        } catch (Exception e) {
            throw new RuntimeException("Wrapped in RuntimeException", e);
        }
    }

    static void method2() throws Exception {
        throw new Exception("Checked exception in method2");
    }
}
