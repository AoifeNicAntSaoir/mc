package com.smbc.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.smbc.dto.NewspaperDTO;

@Entity
@Table(schema = "APP", name = "NEWSPAPER")
public class Newspaper implements Serializable {

	@Id
	@Column(name = "NEWSPAPERID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer newspaperId;

	@Column(name = "NEWSDATE")
	private Date newsDate;

	@Column(name = "RELPERIOD")
	private String relPeriod;

	@Column(name = "NEWSTYPE")
	private String newsType;

	@OneToOne
	@JoinColumn(name = "ITEMID")
	private Item item;

	public Newspaper() {

	}

	public Newspaper(Integer newspaperId, Date newsDate, String relPeriod, String newsType) {
		this.newspaperId = newspaperId;
		this.newsDate = newsDate;
		this.relPeriod = relPeriod;
		this.newsType = newsType;
	}

	public Newspaper(NewspaperDTO newspaperDTO) {
		this.newspaperId = newspaperDTO.getNewspaperId();
		this.newsDate = newspaperDTO.getNewsDate();
		this.relPeriod = newspaperDTO.getRelPeriod();
		this.newsType = newspaperDTO.getNewsType();
	}

	public Integer getNewspaperId() {
		return newspaperId;
	}

	public void setNewspaperId(Integer newspaperId) {
		this.newspaperId = newspaperId;
	}

	public Date getNewsDate() {
		return newsDate;
	}

	public void setNewsDate(Date newsDate) {
		this.newsDate = newsDate;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
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
