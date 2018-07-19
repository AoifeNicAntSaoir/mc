package com.smbc.model;


import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.smbc.dto.ItemDTO;

@Entity
@Table(schema = "APP", name = "GENERALITEM")
public class Item implements Serializable {
	private static final long serialVersionUID = 3094757768242760520L;

	@Id
	@Column(name = "ITEMID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer itemID;

	@Column(name = "MEDIUMID")
	private Integer mediumId;
	
	@Column(name = "TITLE")
	private String title;
	
	@Column(name = "COPYID")
	private Integer copyID;
	
	@OneToOne(mappedBy = "item")
	private DVD dvd = new DVD();

	@OneToOne(mappedBy = "item")
	private CD cd = new CD();

	@OneToOne(mappedBy = "item")
	private Magazine magazine = new Magazine();

	@OneToOne(mappedBy = "item")
	private Newspaper newspaper = new Newspaper();

	@OneToOne(mappedBy = "item")
	private VideoGame videoGame = new VideoGame();

	public VideoGame getVideoGame() {
		return videoGame;
	}

	public void setVideoGame(VideoGame videoGame) {
		this.videoGame = videoGame;
	}

	public Newspaper getNewspaper() {
		return newspaper;
	}

	public void setNewspaper(Newspaper newspaper) {
		this.newspaper = newspaper;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "item", cascade = CascadeType.ALL)
	public CD getCd() {
		return this.cd;
	}

	public void setCd(CD cd) {
		this.cd = cd;
	}

	public Magazine getMagazine() {
		return magazine;
	}

	public void setMagazine(Magazine magazine) {
		this.magazine = magazine;
	}

	public DVD getDvd() {
		return dvd;
	}

	public void setDvd(DVD dvd) {
		this.dvd = dvd;
	}


	public Item() {

	}

	public Item(Integer itemId, Integer mediumID, String title, Integer copyID) {
		this.itemID = itemId;
		this.mediumId = mediumId;
		this.title = title;
		this.copyID = copyID;
	}

	public Item(ItemDTO itemDTO) {
		this.itemID = itemDTO.getItemID();
		this.mediumId = itemDTO.getMediumID();
		this.title = itemDTO.getTitle();
		this.copyID = itemDTO.getCopyID();
	}

	public Integer getItemID() {
		return itemID;
	}

	public void setItemID(Integer itemID) {
		this.itemID = itemID;
	}

	public Integer getMediumId() {
		return mediumId;
	}

	public void setMediumId(Integer mediumId) {
		this.mediumId = mediumId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getCopyID() {
		return copyID;
	}

	public void setCopyID(Integer copyID) {
		this.copyID = copyID;
	}

}


