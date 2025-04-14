package com.gowri.threads;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author NaveenWodeyar
 * @date 15-Apr-2025 12:12:22 am
 */

class MultithreadingExampleTest {

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
	    public void testThreadsExecutionTime() throws InterruptedException {
	        PrintNumbers numbersThread = new PrintNumbers();
	        PrintLetters lettersThread = new PrintLetters();

	        numbersThread.start();
	        lettersThread.start();

	        numbersThread.join();
	        lettersThread.join();

	        long time1 = numbersThread.getTimeTaken();
	        long time2 = lettersThread.getTimeTaken();

	        assertTrue(time1 > 0, "PrintNumbers thread did not record valid execution time.");
	        assertTrue(time2 > 0, "PrintLetters thread did not record valid execution time.");
	    }

	    @Test
	    public void testMemoryUsageTracking() throws InterruptedException {
	        Runtime runtime = Runtime.getRuntime();
	        long beforeMemory = runtime.totalMemory() - runtime.freeMemory();

	        PrintNumbers numbersThread = new PrintNumbers();
	        PrintLetters lettersThread = new PrintLetters();

	        numbersThread.start();
	        lettersThread.start();

	        numbersThread.join();
	        lettersThread.join();

	        long afterMemory = runtime.totalMemory() - runtime.freeMemory();
	        long memoryUsed = afterMemory - beforeMemory;

	        // Accept some memory use — should not be negative
	        assertTrue(memoryUsed >= 0, "Memory used should not be negative.");
	    }

}
