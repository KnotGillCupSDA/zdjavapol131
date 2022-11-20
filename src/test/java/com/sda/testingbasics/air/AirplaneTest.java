package com.sda.testingbasics.air;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AirplaneTest {

	@Test
	void shouldAscent() {
		//given
		//create Airplane
		Airplane airplane = new Airplane();

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
}