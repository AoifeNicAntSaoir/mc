package com.smbc.service;

import java.util.List;

import com.smbc.model.Book;

public interface BookService {
	
	public List<Book> getAllBooks();

	public void addBook(Book book);

}
