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
import com.smbc.model.CD;
import com.smbc.model.DVD;
import com.smbc.model.Item;
import com.smbc.testingConfig.TestingConfig;

import junit.framework.TestCase;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = { PersistenceJPAConfig.class,
		TestingConfig.class }, loader = AnnotationConfigContextLoader.class)

@Transactional
public class ItemDaoImplTest extends TestCase {

	@Resource
	private ItemDao itemDao;

	@Test
	public void whenAddingABook_TheBookIsReturned() {
		assertEquals(0, itemDao.getAllBooks().size());
		Book book = new Book();
		book.setBookId(1);
		book.setTitle("Harry Potter");
		itemDao.addBook(book);
		assertEquals(1, itemDao.getAllBooks().size());
		List<Book> allBooks = itemDao.getAllBooks();
		Book returnedBook = allBooks.get(0);
		assertEquals(1, returnedBook.getBookId().intValue());
		assertEquals("Harry Potter", returnedBook.getTitle());
	}

	@Test
	public void whenAddingACD_TheCDIsReturned() {
		assertEquals(0, itemDao.getAllCDs().size());
		CD cd = new CD();
		cd.setArtist("Michael Jackson");
		cd.setMusicType("Pop");
		cd.setNumTracks(12);
		cd.setTotalDuration(66);
		itemDao.addCD(cd);
		assertEquals(1, itemDao.getAllCDs().size());
		System.out.println(cd.getCdId());
		CD cd1 = new CD();
		cd1.setArtist("Oasis");
		cd1.setMusicType("Rock");
		cd1.setNumTracks(22);
		cd1.setTotalDuration(60);
	}
	
	@Test
	public void whenAddingDVD_TheDVDisReturned() {
		DVD dvd = new DVD();
		dvd.setDirector("Spielberg");
		dvd.setDuration(20);
		dvd.setNumChapters(200);
		dvd.setVideoType("Action");
		itemDao.addDVD(dvd);
		List<DVD> allDVDS = itemDao.getAllDVDs();
		DVD returnedDVD = allDVDS.get(0);
		assertEquals("Spielberg", returnedDVD.getDirector());
	}

	@Test
	public void whenAddingGeneralItem_AListIsReturned() {
		DVD dvd = new DVD();
		dvd.setDirector("Spielberg");
		dvd.setDuration(20);
		dvd.setNumChapters(200);
		dvd.setVideoType("Action");
		itemDao.addDVD(dvd);
		CD cd = new CD();
		cd.setArtist("Michael Jackson");
		cd.setMusicType("Pop");
		cd.setNumTracks(12);
		cd.setTotalDuration(66);
		itemDao.addCD(cd);
		Book book = new Book();
		book.setBookId(3);
		book.setTitle("Harry Potter");
		itemDao.addBook(book);
		itemDao.getAllItems();
		List l = itemDao.getAllItems();
		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.toString());
		}
		

	}

	@Test
	public void whenInsertingAMappedCD_checkCorrect() {
		
		CD cd = new CD();
		cd.setItem(new Item(1, 1, "ALBUM", 1));
		cd.setArtist("OASIS");
		// cd.setCdId(1);
		cd.setMusicType("ROCK");
		cd.setNumTracks(202);
		cd.setTotalDuration(33);
		itemDao.addCD(cd);

		List<CD> getAllCDs = itemDao.getAllCDs();
		CD returnedCD = getAllCDs.get(0);
		assertEquals("ALBUM", returnedCD.getItem().getTitle());
		assertEquals("OASIS", returnedCD.getArtist());

	}

}
