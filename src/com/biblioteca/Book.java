package com.biblioteca;

public class Book {

	private String isbn;
	private String author;
	private String title;
	private double price;

	public Book() {
		super();
	}

	public Book(String isbn, String author, String title, double price) {
		super();
		this.isbn = isbn;
		this.author = author;
		this.title = title;
		this.price = price;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public String toString(Book book) {

		return isbn + "\t" + "Author: " + author + "\tTitle: " + title + "\tPrice: $" + price;
	}

}
