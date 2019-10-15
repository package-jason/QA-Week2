package com.nationwide.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import calculator.Calculator;

public class CalculatorTest {
	@Test
	public void multiplicationTest() {
		Calculator calc = new Calculator();
		assertEquals("Multiply Failed", 8, calc.multiply(2,4));
		// assertequals compares values. Comparing 8 with 2*4
		
	}
	@Test
	public void addTest() {
		Calculator calc = new Calculator();
		assertEquals("Add failed", 15, calc.add(7,8));
	}
}