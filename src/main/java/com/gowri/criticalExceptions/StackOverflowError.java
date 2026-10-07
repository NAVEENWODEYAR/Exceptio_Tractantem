package com.gowri.criticalExceptions;

/**

* Demonstrates StackOverflowError caused by infinite recursion.
*
* @author NaveenWodeyar
* @date 21-Jan-2025
  */
  public class StackOverflowError {

  /**

  * Calls itself repeatedly, causing infinite recursion.
  *
  * @throws StackOverflowError when the stack memory is exhausted
    */
    static void recursiveMethod() {
    System.out.println("recursiveMethod()");

    // Recursive call without a termination condition.
    recursiveMethod();
    }

  /**

  * Main method to demonstrate StackOverflowError.
  *
  * @param args command-line arguments
    */
    public static void main(String[] args) {

    System.out.println(
    "StackOverflowError occurs when the stack overflows "
    + "due to deep or infinite recursion."
    );

    try {
    recursiveMethod();
    } catch (Exception e) {
    // StackOverflowError is an Error, not an Exception.
    System.out.println("StackOverflowError occurred: " + e);
    }
    }
    }
