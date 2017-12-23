package com.test.jenkins;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.Test;

public class TestCalculate {
	Calculate calculate;

	@Before
	public void setUp() {
		calculate = new Calculate();
	}

	@Test
	public void testSum_Positive() {
		assertEquals("Expected value is not same",10L, calculate.sum(5, 5));
	}
	
	@Test
	public void testSum_Negative(){
		assertNotEquals("Expected value is same", 11L, calculate.sum(5, 5));
	}

}