package com.gowri.code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * The {@code AddTwoNumbers} class reads two numbers from standard input,
 * calculates their sum, and prints the result to standard output.
 * Includes interactive console prompts for local testing visibility.
 * 
 * @author NaveenWodeyar
 * @date 14-Oct-2026 11:18:40 pm
 */
public class AddTwoNumbers {
    
    /**
     * The main execution method that prompts for input, processes the addition, 
     * and displays the output with clear console messages.
     * 
     * @param args Command-line arguments passed to the program (not used).
     * @throws IOException If an I/O error occurs while reading from standard input.
     */
    public static void main(String[] args) throws IOException {
        
        // Initialize BufferedReader for efficient input reading
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        // Console prompt so you know the program is waiting for your input
        System.out.print("Enter two numbers separated by a space: ");
        
        // Read the input line containing the numbers
        String line = reader.readLine();
        
        // Validate that the input is not null or empty
        if (line == null || line.trim().isEmpty()) {
            System.out.println("Console Message: Error - Input line is empty or null.");
            return;
        }

        // Use StringTokenizer to parse individual number tokens from the line
        StringTokenizer tokenizer = new StringTokenizer(line);
        
        // Ensure there are at least two tokens available
        if (tokenizer.countTokens() < 2) {
            System.out.println("Console Message: Error - Please provide at least two valid numbers.");
            return;
        }

        long a = Long.parseLong(tokenizer.nextToken());
        long b = Long.parseLong(tokenizer.nextToken());

        // Calculate the sum of the two numbers
        long sum = a + b;
        
        // Print the final result with a clear label
        System.out.println("Console Message: Calculation successful!");
        System.out.println("The sum of " + a + " and " + b + " is: " + sum);
    }
}