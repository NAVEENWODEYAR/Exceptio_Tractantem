package com.gowri.arithmetic;

/**

@author NaveenWodeyar
@date 28-Aug-2026 10:58:03 pm
*/

public class InfiniteLoopDemo {

static {

    /*
     * A while loop executes repeatedly as long as
     * its condition remains true.
     */

    int count = 1;

    while (count <= 5) {

        // Print the current value.
        System.out.println("Count: " + count);

        // Increment the value.
        count++;
    }

    /*
     * The loop stops when count becomes 6 because
     * the condition "count <= 5" becomes false.
     */
}

public static void main(String[] args) {

    /*
     * This for loop prints numbers from 0 to 4.
     * It executes exactly 5 times.
     */

    for (int i = 0; i < 5; i++) {

        System.out.println("i: " + i);
    }
}


}