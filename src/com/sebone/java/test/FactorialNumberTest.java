/**
 * 
 */
package com.sebone.java.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.sebone.java.numbers.FactorialNumber;

/**
 * @author Shraddha Choudhary
 *
 */
public class FactorialNumberTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link com.sebone.java.numbers.FactorialNumber#isfactorial(int)}.
	 */
	@Test
	public void testIsfactorial() {
		 FactorialNumber factorialNumber=new FactorialNumber();  
		 assertEquals(120,factorialNumber.isfactorial(5));
		 assertEquals(3628800,factorialNumber.isfactorial(10));
		 assertEquals(2,factorialNumber.isfactorial(2));
	}

}
