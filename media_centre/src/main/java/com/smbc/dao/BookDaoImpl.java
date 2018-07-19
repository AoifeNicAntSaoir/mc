package com.smbc.dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.smbc.model.Book;


@Repository
public class BookDaoImpl implements BookDao {
	
	@PersistenceContext
	private EntityManager manager;

	@Override
	public List<Book> getAllBooks() {
		List<Book> list = manager.createQuery("Select b from Book b", Book.class).getResultList();
		return list;
	}

	/*
	 * @Override public void addBook(BookDTO book) { Book bookEntity = new
	 * Book(book); manager.persist(bookEntity);
	 * 
	 * }
	 */
	@Override
	public void addBook(Book b) {
		manager.persist(b);

	}


 
   
}