package com.gowri.arrExcptn;

/**
 * @author NaveenWodeyar
 * @date 18-Apr-2025 10:11:50 pm
 */

public class RecursiveException {
    public static void main(String[] args) {
        try {
            method();
        } catch (StackOverflowError e) {
            System.out.println("Caught StackOverflowError");
        }
    }

    static void method() {
        try {
            method();
        } catch (Exception e) {
            method(); // this keeps calling again
        }
    }
}

