package com.smbc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.smbc.dao.BookDao;
import com.smbc.model.Book;

@Service("bookService")
public class BookServiceImpl implements BookService {
	
	@Autowired
	private BookDao bookDAO;

	@Override
	public List<Book> getAllBooks() {
		return bookDAO.getAllBooks();
	}

	@Override
	@Transactional
	public void addBook(Book book) {
		bookDAO.addBook(book);

	}
	
	

}
