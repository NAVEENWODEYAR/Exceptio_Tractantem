package com.gowri.excptn;

import java.util.Scanner;

/**
 * @author NaveenWodeyar
 * @date 12-May-2025 8:22:58 pm
 */

public class FibonacciSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter number of terms: ");
            int n = sc.nextInt();
            int a = 0, b = 1, fib;
            for (int i = 1; i <= n; i++) {
                if (i % 2 != 0) System.out.print((i * i) + " ");
                else {
                    System.out.print(a + " ");
                    fib = a + b;
                    a = b;
                    b = fib;
                }
            }
        } catch (Exception e) {
            System.out.println("Please enter a valid integer.");
        }
    }
}

