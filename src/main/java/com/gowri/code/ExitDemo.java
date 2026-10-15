package com.gowri.code;

/**
 * Demonstrates the difference between System.exit(0) and System.exit(1)
 * using command-line arguments.
 * /**
 * @author NaveenWodeyar
 * @date 15-Oct-2026 11:09:26 pm
 */
public class ExitDemo {

    public static void main(String[] args) {
        
        // Scenario 1: No arguments passed
        if (args.length == 0) {
            System.out.println("Console Message: Error - No arguments provided.");
            System.out.println("Exiting with status 1 (Indicates Failure/Error).");
            System.exit(1); // Stops execution and returns code 1 to the OS
        }

        String command = args[0];

        // Scenario 2: Valid input/operation
        if (command.equalsIgnoreCase("start")) {
            System.out.println("Console Message: Task executed successfully!");
            System.out.println("Exiting with status 0 (Indicates Normal Success).");
            System.exit(0); // Stops execution and returns code 0 to the OS
        } 
        // Scenario 3: Invalid input/operation
        else {
            System.out.println("Console Message: Error - Unknown command '" + command + "'.");
            System.out.println("Exiting with status 1 (Indicates Failure/Error).");
            System.exit(1); // Stops execution and returns code 1 to the OS
        }
    }
}