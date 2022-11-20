package com.sda.testingbasics.calculator;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	private Calculator calculator;

	@BeforeAll
	static void beforeAll() {
		System.out.println("beforeAll");
	}

	@AfterAll
	static void afterAll() {
		System.out.println("afterAll");
	}

	@BeforeEach
	void setUp() {
		System.out.println("beforeEach");
		calculator = new Calculator();
	}

	@AfterEach
	void tearDown() {
		System.out.println("afterEach");
	}

	@Test
	void shouldAddTwoPositiveNumbers() {
		System.out.println("shouldAddTwoPositiveNumbers");
		System.out.println("last add result: " + calculator.getLastAddResult());
		//given
		double a = 1.0;
		double b = 2.0;

		//when
		double sum = calculator.add(a, b);

		//then
		//if(sum == 3) -> ok (green)
		//else -> fail (red)
		assertEquals(3.0, sum, "1 + 2 should equals 3");

		//the same assertion but with assertJ
		assertThat(sum)
				.as("1 + 2 should equals 3")
				.isEqualTo(3.0);
	}

	@Test
	void shouldAddTwoNegativeNumbers() {
		System.out.println("shouldAddTwoNegativeNumbers");
		System.out.println("last add result: " + calculator.getLastAddResult());

		//given
		double a = -3.0;
		double b = -5.0;

		//when
		double sum = calculator.add(a, b);

		//then
		assertEquals(-8.0, sum, "-3 + -5 should equals -8");
	}

}