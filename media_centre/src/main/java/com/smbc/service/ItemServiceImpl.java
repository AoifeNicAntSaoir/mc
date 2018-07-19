package com.smbc.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.smbc.dao.ItemDao;
import com.smbc.model.Book;
import com.smbc.model.CD;
import com.smbc.model.DVD;
import com.smbc.model.Item;
import com.smbc.model.Magazine;
import com.smbc.model.Newspaper;
import com.smbc.model.VideoGame;

@Service("itemService")
public class ItemServiceImpl implements ItemService {

	@Autowired
	private ItemDao itemDao;

	@Override
	@Transactional
	public void addItem(Item item) {
		itemDao.addItem(item);
	}

	@Override
	public void addBook(Book book) {
		itemDao.addBook(book);
	}

	@Override
	public void addCD(CD cd) {
		itemDao.addCD(cd);
	}

	@Override
	public void addDVD(DVD dvd) {
		itemDao.addDVD(dvd);
	}

	@Override
	public void addVideoGame(VideoGame videoGame) {
		itemDao.addVideoGame(videoGame);
	}

	@Override
	public void addNewspaper(Newspaper newspaper) {
		itemDao.addNewspaper(newspaper);
	}

	@Override
	public void addMagazine(Magazine magazine) {
		itemDao.addMagazine(magazine);
	}

	@Override
	public List<Book> getAllBooks() {
		return itemDao.getAllBooks();
	}

}
