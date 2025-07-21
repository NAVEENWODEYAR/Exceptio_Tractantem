package com.gowri.excptn;

import java.io.*;

/**
 * @author NaveenWodeyar
 * @date 21-Jul-2025 11:06:55 pm
 */

//Parent class with a method that throws a checked exception
class Parent {
 void readFile() throws IOException {
     System.out.println("Parent: Reading file...");
     // Simulating file reading
     FileReader fr = new FileReader("nonexistent.txt");
     fr.read();
     fr.close();
 }

 void calculate() {
     System.out.println("Parent: Calculating...");
     int result = 10 / 2;  // No exception
     System.out.println("Result: " + result);
 }
}

//Child class overriding methods
class Child extends Parent {

 // Overriding method with narrower checked exception (valid)
 @Override
 void readFile() throws FileNotFoundException {
     System.out.println("Child: Reading file...");
     // Throws FileNotFoundException (subclass of IOException)
     FileReader fr = new FileReader("nonexistent.txt");
     fr.read();
     fr.close();
 }

 // Overriding method throwing unchecked exception (valid)
 @Override
 void calculate() {
     System.out.println("Child: Calculating...");
     int result = 10 / 0;  // Will throw ArithmeticException (unchecked)
     System.out.println("Result: " + result);
 }
}

//Main class to test the program
public class ExceptionOverridingExample {
 public static void main(String[] args) {
     Parent obj = new Child();

     // Handle checked exception from readFile
     try {
         obj.readFile();
     } catch (IOException e) {
         System.out.println("Caught IOException: " + e);
     }

     // Handle unchecked exception from calculate
     try {
         obj.calculate();
     } catch (ArithmeticException e) {
         System.out.println("Caught ArithmeticException: " + e);
     }

     System.out.println("Program finished.");
 }
}
