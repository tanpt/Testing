package com.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculateTest {

	Calculate calculation = new Calculate();
	int sum = calculation.sum(2, 5);
	int testSum = 7;
	
	@Test
	public void testSum() {
		System.out.println("@Test sum(): " + sum + " = " + testSum);
		assertEquals(sum, testSum);
	}
	
	@Test
	public void testPTB2() {
		assertNull(calculation.PTB2(1, 2, 3));
		assertArrayEquals(calculation.PTB2(1, -2, 1), new double[] {1, 1}, 0.00001);
		assertArrayEquals(calculation.PTB2(4, 3, -1), new double[] {-1, 0.25}, 0.00001);
	}

}
