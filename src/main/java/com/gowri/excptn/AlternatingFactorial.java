package com.gowri.excptn;

import java.util.Scanner;

/**
 * @author NaveenWodeyar
 * @date 12-May-2025 8:21:56 pm
 */

public class AlternatingFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter n: ");
            int n = sc.nextInt();
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                int fact = 1;
                for (int j = 1; j <= i; j++) fact *= j;
                sum += (i % 2 == 0) ? -fact : fact;
            }
            System.out.println("Result: " + sum);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter an integer.");
        }
    }
}

