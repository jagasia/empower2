package com.upskillit.library.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.upskillit.library.entity.Book;
import com.upskillit.library.repository.BookRepository;

@Service
public class BookService {
	@Autowired
	private BookRepository br;
	
	public Book create(Book book) {
		return br.save(book);
	}
	public List<Book> read() {
		return br.findAll();
	}
	public Book read(Integer id) {
		Optional<Book> temp = br.findById(id);
		
		Book book=null;
		if(temp.isPresent())
		{
			book=temp.get();
		}
		return book;
	}
	public Book update(Book book) {
		Book temp = read(book.getId());
		if(temp!=null)
		{
			temp=book;
			br.save(temp);
		}
		return temp;
	}
	public Book delete(Integer id) {
		Book temp = read(id);
		if(temp!=null)
		{			
			br.delete(temp);
		}
		return temp;
	}
	
}
