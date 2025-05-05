package com.gowri.arithmetic;

/**
 * @author NaveenWodeyar
 * @date 05-May-2025 9:34:22 pm
 */

public class TrickyArithmeticException {
    public static void main(String[] args) {
        try {
            int[] numbers = {10, 20, 30};
            int index = getIndex();  // returns 1
            int result = numbers[index] / getDenominator();  // denominator will be 0
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught an ArithmeticException: " + e.getMessage());
        }
    }

    static int getIndex() {
        return 1;  // Valid index
    }

    static int getDenominator() {
        return 10 - 5 * 2;  // 10 - 10 = 0 (division by zero)
    }
}

