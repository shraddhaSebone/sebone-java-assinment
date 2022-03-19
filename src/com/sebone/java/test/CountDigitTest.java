package com.sebone.java.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.sebone.java.numbers.CountDigit;

class CountDigitTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testCount() {
		CountDigit countDigit=new CountDigit(); 
		assertEquals(3,countDigit.count(123));
		assertEquals(1,countDigit.count(0));
		assertEquals(3,countDigit.count(-123));
	}


}
