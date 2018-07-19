package com.smbc.dao;

import java.util.List;

import com.smbc.model.Book;
 
/**
 * Defines DAO operations for the contact model.
 * @author www.codejava.net
 *
 */
public interface BookDao {
     
    public List<Book> getAllBooks();

	//public void addBook(BookDTO b);
	
	public void addBook(Book b);

	// public void addCD(CD cd);

     

}