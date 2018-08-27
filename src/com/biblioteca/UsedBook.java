package com.biblioteca;

public class UsedBook extends Book {
	
	private String wear;

	
	
//	public UsedBook(String isbn, String author, String title, double price) {
//		super(isbn, author, title, price);
//	}

	public UsedBook(String isbn, String author, String title, double price, String wear) {
		super(isbn, author, title, price);
		this.wear = wear;
	}

	@Override
	public void setIsbn (String isbn) {
		super.setIsbn(isbn);
	}
	
	@Override
	public String getIsbn () {
		return super.getIsbn();
	}
	
	@Override
	public void setAuthor (String author) {
		super.setAuthor(author);
	}
	
	@Override
	public String getAuthor () {
		return super.getAuthor();
	}
	
	@Override
	public void setTitle (String title) {
		super.setTitle(title);
	}
	
	@Override
	public String getTitle () {
		return super.getTitle();
	}
	
	@Override
	public void setPrice (double price) {
		super.setPrice(price);
	}
	
	@Override
	public double getPrice () {
		return super.getPrice();
	}
	
	public void setWear (String wear) {
		this.wear = wear;
	}
	
	public String getWear () {
		return wear;
	}
	
	@Override
	public String toString () {
		return super.toString() + "\tWear: " + wear;
	}
}
