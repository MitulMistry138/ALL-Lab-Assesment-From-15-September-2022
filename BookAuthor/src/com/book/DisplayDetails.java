package com.book;

public class DisplayDetails {
	
	static void displayDetails(Book b)
	{
		System.out.println("Book name is "+b.getBookName());
		System.out.println("Price of book is "+b.getPriceOfBook());
		System.out.println("Publication is "+b.getPublicationYear());
		System.out.println("Author "+b.getAuthor());
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book b1 =new Book("Shallow",150.00,1992,new Author("Mitul",23,"Male"));
		System.out.println("Details are:");
		displayDetails(b1);

	}

}
