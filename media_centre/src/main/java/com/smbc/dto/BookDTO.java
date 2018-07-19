package com.smbc.dto;

import com.smbc.model.Book;

public class BookDTO {
	private int bookID;
	private String bookTitle;

	public BookDTO() {

	}


	public BookDTO(Book book) {
		this.bookID = book.getBookId();
		this.bookTitle = book.getTitle();
	}

	public int getBookID() {
		return bookID;
	}

	public void setBookID(int bookID) {
		this.bookID = bookID;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

}
