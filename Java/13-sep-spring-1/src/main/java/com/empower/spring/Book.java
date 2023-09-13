package com.empower.spring;

public class Book {
	private String isbn;
	private String title;
	private Author author;
	
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

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", author=" + author + "]";
	}
	
}
