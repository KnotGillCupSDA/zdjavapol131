package com.sda.testingbasics.bookstore;

import java.util.ArrayList;
import java.util.List;

public class Basket {

	private final List<Book> books;

	public Basket() {
		books = new ArrayList<>();
	}

	public int size() {
		return 0;
	}

	public void add(Book book) {
		books.add(book);
	}
}
