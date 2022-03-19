/**
 * 
 */
package com.sebone.java.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.sebone.java.numbers.PrimeNumber;

/**
 * @author Shraddha Choudhary
 *
 */
class PrimeNumberTest {

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
	 * Test method for {@link com.sebone.java.numbers.PrimeNumber#isPrime(int)}.
	 */
	@Test
	void testIsPrime1() {
		PrimeNumber primeNumber=new PrimeNumber(); 
		assertEquals(true,primeNumber.isPrime(3));
	}
	
	void testIsPrime2() {
		PrimeNumber primeNumber=new PrimeNumber(); 
		assertEquals(false,primeNumber.isPrime(0));
	}
	void testIsPrime3() {
		PrimeNumber primeNumber=new PrimeNumber(); 
		assertEquals(false,primeNumber.isPrime(-1));
	}
	 
	void testIsPrime4() {
		PrimeNumber primeNumber=new PrimeNumber(); 
		assertEquals(true,primeNumber.isPrime(47));
	}
	  
	void testIsPrime5() {
		PrimeNumber primeNumber=new PrimeNumber(); 
		assertEquals(true,primeNumber.isPrime(123));
	}
}
