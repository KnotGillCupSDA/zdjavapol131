package com.sda.testingbasics.bookstore;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BasketTest {

	@Test
	void shouldBeEmpty() {
		// create new basket
		Basket basket = new Basket();

		//check if basket is empty
		int size = basket.size();
		assertEquals(0, size);
	}

	@Test
	void shouldAddBook() {
		//create new basket
		Basket basket = new Basket();
		//create new book
		Book book = new Book("Potop", "Henryk Sienkiewicz", 45.0);

		//add book to basket
		basket.add(book);

		//check if basket size is 1
		int size = basket.size();
		assertEquals(1, size);
	}
}