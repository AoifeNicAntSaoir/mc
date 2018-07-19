package com.smbc.service;

import java.util.List;

import com.smbc.model.Book;
import com.smbc.model.CD;
import com.smbc.model.DVD;
import com.smbc.model.Item;
import com.smbc.model.Magazine;
import com.smbc.model.Newspaper;
import com.smbc.model.VideoGame;

public interface ItemService {

	public void addItem(Item item);

	public void addBook(Book book);

	public void addCD(CD cd);

	public void addDVD(DVD dvd);

	public void addVideoGame(VideoGame videoGame);

	public void addNewspaper(Newspaper newspaper);

	public void addMagazine(Magazine magazine);

	public List<Book> getAllBooks();


}
