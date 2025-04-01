package com.gowri.arrExcptn;

/**
 * @author NaveenWodeyar
 * @date 01-Apr-2025 9:01:21 pm
 */

public class ConstructorExceptionTest {
    public static void main(String[] args) {
        try {
            new MyClass();
        } catch (Exception e) {
            System.out.println("Caught exception: " + e);
        }
    }
}

class MyClass {
    MyClass() {
        System.out.println("Inside Constructor");
        if (true) {
            throw new RuntimeException("Exception in constructor");
        }
    }
}
