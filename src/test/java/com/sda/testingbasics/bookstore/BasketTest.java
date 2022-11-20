package com.sda.testingbasics.bookstore;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Collection;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BasketTest {

	private Basket basket;

	@BeforeEach
	void setUp() {
		basket = new Basket();
	}

	@Test
	void shouldBeEmpty() {
		//check if basket is empty
		int size = basket.size();
		assertEquals(0, size);
	}

	@Test
	void shouldAddBook() {
		//create new book
		Book book = new Book("Potop", "Henryk Sienkiewicz", 45.0);

		//add book to basket
		basket.add(book);

		//check if basket size is 1
		int size = basket.size();
		assertEquals(1, size, "Basket should have size 1 after adding one book");
	}

	@Test
	void shouldBePossibleToClearBasket() {
		//add 3 books
		basket.add(new Book("Potop", "Henryk Sienkiewicz", 45.0));
		basket.add(new Book("Ogniem i Mieczem", "Henryk Sienkiewicz", 40.0));
		basket.add(new Book("Pan Wołodyjowski", "Henryk Sienkiewicz", 50.0));

		//clear basket
		basket.clear();

		//verify that size is 0
		assertEquals(0, basket.size());
	}

	@Test
	void shouldReturnAllAddedBooks() {
		//add 3 books
		Book book1 = new Book("Potop", "Henryk Sienkiewicz", 45.0);
		Book book2 = new Book("Ogniem i Mieczem", "Henryk Sienkiewicz", 40.0);
		Book book3 = new Book("Pan Wołodyjowski", "Henryk Sienkiewicz", 50.0);

		basket.add(book1);
		basket.add(book2);
		basket.add(book3);

		//get all books
		Collection<Book> retrievedBooks = basket.getAll();

		//verify that 3 books are returned and these are exactly the same books as the ones that were added
		assertEquals(3, retrievedBooks.size());
		assertTrue(retrievedBooks.contains(book1));
		assertTrue(retrievedBooks.contains(book2));
		assertTrue(retrievedBooks.contains(book3));

		//it's better to use assertJ this time
		assertThat(retrievedBooks)
				.hasSize(3)
				.containsExactlyInAnyOrder(book1, book2, book3);
	}

	@Test
	void shouldCalculateBasketValue() {
		//add 3 books
		basket.add(new Book("Potop", "Henryk Sienkiewicz", 45.0));
		basket.add(new Book("Ogniem i Mieczem", "Henryk Sienkiewicz", 40.0));
		basket.add(new Book("Pan Wołodyjowski", "Henryk Sienkiewicz", 50.0));

		//get total value
		double totalValue = basket.sum();

		//verify that total value is as expected
		assertEquals(135.0, totalValue);
	}
}