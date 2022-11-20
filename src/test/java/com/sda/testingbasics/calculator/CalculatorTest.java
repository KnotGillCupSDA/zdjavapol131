package com.sda.testingbasics.calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void shouldAddTwoPositiveNumbers() {
		//given
		double a = 1.0;
		double b = 2.0;

		//when
		double sum = new Calculator().add(a, b);

		//then
		//if(sum == 3) -> ok (green)
		//else -> fail (red)
		assertEquals(3.0, sum, "1 + 2 should equals 3");
	}
}