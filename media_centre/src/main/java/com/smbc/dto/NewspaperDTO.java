package com.smbc.dto;

import java.sql.Date;

import com.smbc.model.Newspaper;

public class NewspaperDTO {
	private int newspaperId;
	private Date newsDate;
	private String relPeriod;
	private String newsType;

	public NewspaperDTO() {

	}

	public NewspaperDTO(Newspaper newspaper) {
		this.newspaperId = newspaper.getNewspaperId();
		this.newsDate = newspaper.getNewsDate();
		this.relPeriod = newspaper.getRelPeriod();
		this.newsType = newspaper.getNewsType();

	}

	public int getNewspaperId() {
		return newspaperId;
	}

	public void setNewspaperId(int newspaperId) {
		this.newspaperId = newspaperId;
	}

	public Date getNewsDate() {
		return newsDate;
	}

	public void setNewsDate(Date newsDate) {
		this.newsDate = newsDate;
	}

	public String getRelPeriod() {
		return relPeriod;
	}

	public void setRelPeriod(String relPeriod) {
		this.relPeriod = relPeriod;
	}

	public String getNewsType() {
		return newsType;
	}

	public void setNewsType(String newsType) {
		this.newsType = newsType;
	}

}
