package com.gowri.arithmetic;

/**
 * @author NaveenWodeyar
 * @date 28-Aug-2026 10:58:03 pm
 */

public class InfiniteLoopDemo {


    static void main() {

        /*
         * An infinite loop is a loop that never ends
         * because its condition always remains true.
         */

        int count = 1;

        while (true) {

            // Print the current value.
            System.out.println("Count: " + count);

            // Increment the value.
            count++;

            /*
             * The condition of the while loop is always true,
             * so the loop continues forever.
             *
             * To stop the program manually:
             * Press Ctrl + C in the terminal.
             */
        }
}
    
    public static void main(String[] args) {

        // The condition "i >= 0" is always true
        // because i keeps increasing.
        for (int i = 0; i >= 0; i++) {
            System.out.println(i);
        }
        
    }
}
