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
		assertTrue(new PersonDetails("Bartosz", "Wozniak", 11).isTeenager());
		assertTrue(new PersonDetails("Bartosz", "Wozniak", 17).isTeenager());
	}

	@Test
	void shouldNotBePerceivedAsTeenager() {
		assertFalse(new PersonDetails("Bartosz", "Wozniak", 8).isTeenager());
		assertFalse(new PersonDetails("Bartosz", "Wozniak", 10).isTeenager());
		assertFalse(new PersonDetails("Bartosz", "Wozniak", 18).isTeenager());
		assertFalse(new PersonDetails("Bartosz", "Wozniak", 40).isTeenager());
	}
}