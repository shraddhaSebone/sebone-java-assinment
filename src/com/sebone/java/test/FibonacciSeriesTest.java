/**
 * 
 */
package com.sebone.java.test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import com.sebone.java.numbers.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.sebone.java.numbers.FibonacciSeries;

/**
 * @author Shraddha Choudhary
 *
 */
class FibonacciSeriesTest {

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

	/**
	 * Test method for {@link com.sebone.java.numbers.FibonacciSeries#isfibonacci(int)}.
	 */
	@Test
	void testIsfibonacci() {
		FibonacciSeries fibonacciSeries=new FibonacciSeries(); 
		
		int arr1[] = {0, 1, 1, 2, 3};
		int arr2[] = {0};
		int arr3[] = {};
		assertArrayEquals(arr1, fibonacciSeries.isfibonacci(5));
		assertArrayEquals(arr2, fibonacciSeries.isfibonacci(1));
		assertArrayEquals(arr3, fibonacciSeries.isfibonacci(0));
	}

}
