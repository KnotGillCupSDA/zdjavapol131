package com.sda.testingbasics.bookstore;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Basket {

	private final List<Book> books;

	public Basket() {
		books = new ArrayList<>();
	}

	public void clear() {
		books.clear();
	}

	public int size() {
		return books.size();
	}

	public void add(Book book) {
		books.add(book);
	}

	public Collection<Book> getAll() {
		return new ArrayList<>(books);
	}

	public double sum() {
		double sum = 0;

		for(Book book : books) {
			double price = book.getPrice();
			sum = sum + price;
		}

		return sum;
	}
}
