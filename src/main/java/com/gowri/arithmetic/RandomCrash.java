package com.gowri.arithmetic;

import java.util.Random;

/**
 * @author NaveenWodeyar
 * @date 05-May-2025 9:36:42 pm
 */

public class RandomCrash {
    public static void main(String[] args) {
        Random rand = new Random();
        int divisor = rand.nextInt(2);  // 0 or 1 randomly

        try {
            int result = 10 / divisor;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Random crash! Division by zero.");
        }
    }
}
