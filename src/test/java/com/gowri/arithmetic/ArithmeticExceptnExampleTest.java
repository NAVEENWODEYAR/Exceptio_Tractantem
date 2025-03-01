package com.gowri.arithmetic;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author NaveenWodeyar
 * @date 01-Mar-2025 11:55:41 am
 */

class ArithmeticExceptnExampleTest {

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
	void test() {
		fail("Not yet implemented");
	}
	
	@Test
    void testDivisionByZero() {
        ArithmeticExceptnExample arithmeticExample = new ArithmeticExceptnExample();
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            arithmeticExample.divisionByZero(1);
        });
        assertEquals("/ by zero", exception.getMessage());
    }

    @Test
    void testDivisionByFloatingZero() {
        ArithmeticExceptnExample arithmeticExample = new ArithmeticExceptnExample();
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            arithmeticExample.divisionByFloatingZero(10.0);
        });
        assertEquals("Infinity", exception.getMessage()); // This is because dividing by 0.0 results in Infinity
    }

    @Test
    void testModuloByZero() {
        ArithmeticExceptnExample arithmeticExample = new ArithmeticExceptnExample();
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            arithmeticExample.moduloByZero(1);
        });
        assertEquals("/ by zero", exception.getMessage());
    }

}
