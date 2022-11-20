package com.sda.testingbasics.personal;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

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

	@Test
	void shouldBePerceivedAsAdult() {
		PersonDetails personDetails = new PersonDetails("Bartosz", "Wozniak", 40);

		//assert with junit
		assertTrue(personDetails.isAdult());

		//assertWith assertJ
		assertThat(personDetails.isAdult()).isTrue();
	}

	@Test
	void shouldNotBePerceivedAsAdult() {
		PersonDetails personDetails = new PersonDetails("Bartosz", "Wozniak", 17);

		//assert with junit
		assertFalse(personDetails.isAdult());

		//assertWith assertJ
		assertThat(personDetails.isAdult()).isFalse();
	}
}