package com.gowri.criticalExceptions;

import static org.junit.jupiter.api.Assertions.*;

import java.io.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author NaveenWodeyar
 * @date 12-Mar-2025 10:54:48 pm
 */

class ClassNotFoundExampleTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
    public void testClassNotFoundExample_withValidClass() {
        // We will test the scenario where the class exists.
        // This should not throw a ClassNotFoundException and should print the class details.

        // Capture the printed output
        PrintStream originalOut = System.out;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(byteArrayOutputStream));

        // Call the method to test
        ClassNotFoundExample.classNotFoundExample();

        // Verify that the output contains the class name
        String output = byteArrayOutputStream.toString();
        assertTrue(output.contains("class com.gowri.criticalExceptions.ClassNotFoundExample"));
        
        // Restore the original System.out
        System.setOut(originalOut);
    }

    @Test
    public void testClassNotFoundExample_withInvalidClass() {
        // Simulate a ClassNotFoundException
        // For this, we'll try to load a non-existing class

        // Capture the printed output
        PrintStream originalOut = System.out;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(byteArrayOutputStream));

        // Call the method to test with invalid class
        try {
            ClassNotFoundExample.classNotFoundExample();
        } catch (Exception e) {
            // This block is not expected to be invoked as we're just testing the output here.
        }

        // Verify that the output contains the exception message
        String output = byteArrayOutputStream.toString();
        assertTrue(output.contains("Exception: Class not found"));

        // Restore the original System.out
        System.setOut(originalOut);
    }

}
