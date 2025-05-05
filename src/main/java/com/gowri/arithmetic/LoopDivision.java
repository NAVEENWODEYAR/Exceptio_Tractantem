package com.gowri.arithmetic;

/**
 * @author NaveenWodeyar
 * @date 05-May-2025 9:35:37 pm
 */

public class LoopDivision {
    public static void main(String[] args) {
        int[] values = {5, 4, 3, 2, 1, 0};

        for (int i = 5; i >= 0; i--) {
            try {
                int result = 100 / values[i];  // Will crash when i = 5 (values[5] = 0)
                System.out.println("100 / " + values[i] + " = " + result);
            } catch (ArithmeticException e) {
                System.out.println("Caught ArithmeticException at index " + i + ": " + e.getMessage());
            }
        }
    }
}

