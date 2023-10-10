package com.upskillit.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.upskillit.library.entity.Book;
import com.upskillit.library.service.BookService;

@RestController
@CrossOrigin("*")
@RequestMapping("/book")
public class BookController {
	@Autowired
	private BookService bs;
	
	@PostMapping
	public Book addBook(@RequestBody Book book){
		return bs.create(book);
	}
	
	@PutMapping
	public Book updateBook(@RequestBody Book book) {
		return bs.update(book);
	}
	
	@GetMapping("/{id}")
	public Book findBookById(@PathVariable("id")Integer id) {
		return bs.read(id);
	}
	
	@GetMapping
	public List<Book> retrieveAllBooks() {
		return bs.read();
	}
	
	@DeleteMapping("/{id}")
	public Book deleteBook(@PathVariable("id")Integer id) {
		return bs.delete(id);
	}
	
}
