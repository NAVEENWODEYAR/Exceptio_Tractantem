package com.gowri.excptn;

import java.util.Scanner;

/**
 * @author NaveenWodeyar
 * @date 12-May-2025 8:24:25 pm
 */

public class ArithmeticGeometric {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter total number of terms: ");
            int n = sc.nextInt();
            int ap = 2, gp = 3;
            for (int i = 1; i <= n; i++) {
                if (i <= n / 2) {
                    System.out.print(ap + " ");
                    ap += 3;
                } else {
                    System.out.print(gp + " ");
                    gp *= 2;
                }
            }
        } catch (Exception e) {
            System.out.println("Error: Invalid input.");
        }
    }
}

