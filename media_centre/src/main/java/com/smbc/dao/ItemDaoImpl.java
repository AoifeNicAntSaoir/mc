package com.smbc.dao;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.smbc.model.Book;
import com.smbc.model.CD;
import com.smbc.model.DVD;
import com.smbc.model.Item;
import com.smbc.model.Magazine;
import com.smbc.model.Newspaper;
import com.smbc.model.VideoGame;

@Repository
public class ItemDaoImpl implements ItemDao {

	@PersistenceContext
	private EntityManager manager;

	@Override
	public void addItem(Item item) {
		// ItemDTO itemDTO = new ItemDTO(item);
		manager.persist(item);
	}

	@Override
	public void addBook(Book book) {
		// BookDTO bookDTO = new BookDTO(book);
		manager.persist(book);
	}

	@Override
	public void addCD(CD cd) {
		// CDDTO cdDTO = new CDDTO(cd);
		manager.persist(cd);

	}

	@Override
	public void addDVD(DVD dvd) {
		// DVDDTO dvdDTO = new DVDDTO(dvd);
		manager.persist(dvd);
	}

	@Override
	public void addVideoGame(VideoGame videoGame) {
		// VideoGameDTO vidoGameDTO = new VideoGameDTO(videoGame);
		manager.persist(videoGame);
	}

	@Override
	public void addNewspaper(Newspaper newspaper) {
		// NewspaperDTO newspaperDTO = new NewspaperDTO(newspaper);
		manager.persist(newspaper);
	}

	@Override
	public void addMagazine(Magazine magazine) {
		// MagazineDTO magazineDTO = new MagazineDTO(magazine);
		manager.persist(magazine);
	}

	@Override
	public List<Book> getAllBooks() {
		List<Book> list = manager.createQuery("Select b from Book b", Book.class).getResultList();
		return list;
	}

	@Override
	public List<CD> getAllCDs() {
		List<CD> list = manager.createQuery("Select b from CD b", CD.class).getResultList();
		return list;
	}

	@Override
	public List<DVD> getAllDVDs() {
		List<DVD> list = manager.createQuery("Select b from DVD b", DVD.class).getResultList();
		return list;
	}

	@Override
	public List<VideoGame> getAllVideoGames() {
		List<VideoGame> list = manager.createQuery("Select b from VideoGame b", VideoGame.class).getResultList();
		return list;
	}

	@Override
	public List<Newspaper> getAllNewspapers() {
		List<Newspaper> list = manager.createQuery("Select b from Newspaper b", Newspaper.class).getResultList();
		return list;
	}

	@Override
	public List<Magazine> getAllMagazines() {
		List<Magazine> list = manager.createQuery("Select b from Magazine b", Magazine.class).getResultList();
		return list;
	}

	@Override
	public List getAllItems() {
		List list = getAllBooks();
		list.addAll(getAllCDs());
		list.addAll(getAllDVDs());
		list.addAll(getAllVideoGames());
		list.addAll(getAllNewspapers());
		list.addAll(getAllMagazines());
		return list;
	}

}