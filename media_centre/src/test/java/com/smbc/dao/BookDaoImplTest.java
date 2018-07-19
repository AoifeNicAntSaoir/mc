package com.smbc.dao;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.smbc.config.PersistenceJPAConfig;
import com.smbc.model.Book;
import com.smbc.testingConfig.TestingConfig;

import junit.framework.TestCase;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = { PersistenceJPAConfig.class,
		TestingConfig.class }, loader = AnnotationConfigContextLoader.class)

@Transactional
public class BookDaoImplTest extends TestCase {

	@Resource
	private BookDao bookDao;

	@Test
	public void whenAddingABook_TheBookIsReturned() {
		assertEquals(0, bookDao.getAllBooks().size());
		Book book = new Book();
		book.setBookId(1);
		book.setTitle("Harry Potter");
		bookDao.addBook(book);
		assertEquals(1, bookDao.getAllBooks().size());
		List<Book> allBooks = bookDao.getAllBooks();
		Book returnedBook = allBooks.get(0);
		assertEquals(1, returnedBook.getBookId().intValue());
		assertEquals("Harry Potter", returnedBook.getTitle());
	}







}
