package com.gowri.errors;

/**
 * @author NaveenWodeyar
 * @date 07-May-2025 9:01:25 pm
 */

public class StackOverflowErrorEx {

    public static void main(String[] args) {
        try {
            throw new StackOverflowError("Stack overflow");
        } catch (Exception e) {
            System.out.println("Caught Exception");
        } catch (Error e) {
            System.out.println("Caught Error: " + e.getMessage());
        }
    }
}
