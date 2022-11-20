package com.sda.testingbasics.personal;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonDetailsTest {

	@Test
	void shouldBePerceivedAsChild() {
		PersonDetails personDetails = new PersonDetails("Bartosz", "Wozniak", 8);
		assertTrue(personDetails.isChild());
	}

	@Test
	void shouldNotBePerceivedAsChild() {
		PersonDetails personDetails = new PersonDetails("Bartosz", "Wozniak", 11);
		assertFalse(personDetails.isChild());
	}

	@Test
	void shouldBePerceivedAsTeenager() {
		PersonDetails personDetails = new PersonDetails("Bartosz", "Wozniak", 11);
		assertTrue(personDetails.isTeenager());
	}

	@Test
	void shouldNotBePerceivedAsTeenager() {
		PersonDetails personDetails = new PersonDetails("Bartosz", "Wozniak", 8);
		assertFalse(personDetails.isTeenager());
	}
}