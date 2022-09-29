package com.book;

public class Book {
	
	private String bookName;
	private double priceOfBook;
	private int publicationYear;
	private Author author;
	
	// creating a default constructor
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	// end of defualt constructor
		
	// creating parametrized constructor
	public Book(String bookName, double priceOfBook, int publicationYear, Author author) {
		super();
		this.bookName = bookName;
		this.priceOfBook = priceOfBook;
		this.publicationYear = publicationYear;
		this.author = author;
	}
	// end of parameterized constructor
	
	// using getter setter method
	
	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public double getPriceOfBook() {
		return priceOfBook;
	}

	public void setPriceOfBook(double priceOfBook) {
		this.priceOfBook = priceOfBook;
	}

	public int getPublicationYear() {
		return publicationYear;
	}

	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	// end of getter and setter
	
	//creating toString method
	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", priceOfBook=" + priceOfBook + ", publicationYear=" + publicationYear
				+ ", author=" + author + "]";
	}

	
	
	
	
	
}
