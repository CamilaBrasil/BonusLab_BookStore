package com.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class BookstoreApp {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		int amountBooks = 0;
		
		ArrayList<Book> books = new ArrayList<>();

		//Part 1
		
		System.out.println("Welcome to Camila's biblioteca!");
		
//		//Ask how many books they want to enter
//		System.out.println("How many books you want to enter? ");
//		amountBooks = scan.nextInt();
//		
//		//Get input for the details
//		for (int i = 0; i < amountBooks; i++) {
//			//1231231231231
//			long isbn = (Validator.getLong(scan, "Please enter an ISBN number: (It must have 13 digits)"));
//			book.setIsbn(Long.toString(isbn));
//			book.setAuthor(Validator.getString(scan, "Please enter the author: "));
//			book.setTitle(Validator.getString(scan, "Please enter the title: "));
//			book.setPrice(Validator.getDouble(scan, "Please enter the price: "));
//
//			System.out.println(book.toString());
//			
//			books.add(book);
//		}
//	
		//Print table of books at the end
//		System.out.println(books.toString());
		
		
		//Part 2
		
//TODO Comprar um livro
		
		Book novo = new Book() {
		};
		
		//Display 6 books (3 new 3 used)
		books.add(new Book("1211", "Isac Azimov", "Foundation", 35.19));
		Book new2 = null;
		Book new3 = null;
		Book used1 = null;
		Book used2 = null;
		Book used3 = null;
		
		String loopMenu;
		
		do {
			for (int i = 0; i < books.size(); i++) {
				System.out.println(i + 1 + ". " + books.get(i).toString());
			}
			//Let the user select one of the books
			int whichBook = Validator.getInt(scan, "Which book you want to purchase? ", 1, 6);
			//Re-display the information for book selected
			System.out.println(books.get(whichBook - 1).toString());
			//Ask the user if they want to buy the book
			String response = Validator.getString(scan, "Do you want to purchase this book? (y/n)");
			//Remove the book in case the user buys it
			if (response.equalsIgnoreCase("n")) {
				books.remove(whichBook - 1);
			}
			//Re-display the list
			loopMenu = Validator.getString(scan, "Would you like to see the list again? (y/n");
		} while (loopMenu.equalsIgnoreCase("y"));
		
		System.out.println("Adeus");
		scan.close();
	}

}
