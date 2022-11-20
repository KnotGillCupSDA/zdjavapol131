package com.sda.testingbasics.air;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AirplaneTest {

	private Airplane airplane;

	@BeforeEach
	void setUp() {
		airplane = new Airplane();
	}

	@Test
	void shouldAscent() {
		//when
		//call ascent method
		airplane.ascent(100);

		//then
		//assert that getHeight returns expected value
		Assertions.assertEquals(100, airplane.getHeight());
	}

	@Test
	void shouldDescent() {
		//given
		Airplane airplane = new Airplane(100);

		//when
		airplane.descent(50);

		//then
		Assertions.assertEquals(50, airplane.getHeight());
	}

	@Test
	void thatWeCantGoBelowZero() {
		airplane.ascent(100);
		airplane.descent(110);
		Assertions.assertEquals(0, airplane.getHeight());
	}
}