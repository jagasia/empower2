package com.empower.spring;

public class Book {
	private String isbn;
	private String title;
	private Author a1;
	
	public Book() {}

//	public Book(String isbn, String title, Author author) {
//		super();
//		this.isbn = isbn;
//		this.title = title;
//		this.author = author;
//	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Author getA1() {
		return a1;
	}

	public void setA1(Author author) {
		this.a1 = author;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", author=" + a1 + "]";
	}
	
}
