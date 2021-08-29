package com.bhawnagunwani;

import static org.junit.Assert.*;

import org.junit.Test;

public class MathematicsTests {
	
	Mathematics mathematics;

	public MathematicsTests() {
		mathematics = new Mathematics();
	}

	@Test
	public void additionTest() {
		System.out.println("Starting Test : " + new Object() {}.getClass().getEnclosingMethod().getName());
		assertEquals(300, mathematics.addition(100, 200));
		System.out.println("Ending Test : " + new Object() {}.getClass().getEnclosingMethod().getName());
	}
	
	@Test
	public void subtractionTest() {
		System.out.println("Starting Test : " + new Object() {}.getClass().getEnclosingMethod().getName());
		assertEquals(-100, mathematics.subtraction(100, 200));
		System.out.println("Ending Test : " + new Object() {}.getClass().getEnclosingMethod().getName());
	}
	
	@Test
	public void multiplicationTest() {
		System.out.println("Starting Test : " + new Object() {}.getClass().getEnclosingMethod().getName());
		assertEquals(200, mathematics.multiplication(100, 2));
		System.out.println("Ending Test : " + new Object() {}.getClass().getEnclosingMethod().getName());
	}

}
