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

import com.sebone.javanumbers.SumofNumber;

/**
 * @author Shraddha Choudhary
 *
 */
public class SumofNumberTest {

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
	 * Test method for {@link com.sebone.javanumbers.SumofNumber#sumofnumber(int, int)}.
	 */
	@Test
	public void testSumofnumber() {
		SumofNumber sumofNumber = new SumofNumber(); 
		assertEquals(15,sumofNumber.sumofnumber(5));
		assertEquals(0,sumofNumber.sumofnumber(0));
		assertEquals(0,sumofNumber.sumofnumber(-4));
	}

}
