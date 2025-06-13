package com.gowri.errors;

import java.io.*;
import java.util.*;

/**
 * @author NaveenWodeyar
 * @date 13-Jun-2025 10:03:53 pm
 */

public class TrickyErrorsExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // 1. NumberFormatException: parsing invalid number
            System.out.print("Enter a number: ");
            String input = scanner.nextLine();
            int number = Integer.parseInt(input); // Throws NumberFormatException if input is not a number

            // 2. ArithmeticException: divide by zero
            int result = 100 / number; // If user enters 0, it throws ArithmeticException
            System.out.println("100 / " + number + " = " + result);

            // 3. ArrayIndexOutOfBoundsException
            int[] arr = new int[3];
            arr[5] = 10; // Invalid index access

            // 4. NullPointerException
            String str = null;
            System.out.println(str.length()); // Accessing length of null string

            // 5. FileNotFoundException: trying to read a file that doesn't exist
            File file = new File("nonexistentfile.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            System.out.println(reader.readLine());

        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds.");
        } catch (NullPointerException e) {
            System.out.println("Error: Null reference encountered.");
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        } catch (IOException e) {
            System.out.println("Error: IO Exception occurred.");
        } catch (Exception e) {
            System.out.println("General error occurred: " + e.getMessage());
        } finally {
            System.out.println("Program completed with or without errors.");
        }
    }
}
