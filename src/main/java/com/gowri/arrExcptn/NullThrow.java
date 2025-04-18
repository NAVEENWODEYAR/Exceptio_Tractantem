package com.gowri.arrExcptn;

/**
 * @author NaveenWodeyar
 * @date 18-Apr-2025 10:10:52 pm
 */

public class NullThrow {
    public static void main(String[] args) {
        try {
            throw null;
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException");
        }
    }
}

