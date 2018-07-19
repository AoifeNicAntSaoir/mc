package com.smbc.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.smbc.dto.BookDTO;

@Entity
@Table(schema = "APP", name = "BOOK")
public class Book implements Serializable {
	private static final long serialVersionUID = 3094757768242760520L;

	@Id
	@Column(name = "BOOKID")
	private Integer bookId;
	
	@Column(name = "TITLE")
	private String title;
	

	public Book() {
		
	}
	
	public Book(Integer bookId, String title) {
		this.bookId = bookId;
		this.title = title;
	}

	public Book(BookDTO bookDto) {
		this.bookId = bookDto.getBookID();
		this.title = bookDto.getBookTitle();
	}

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}


	
	

}
