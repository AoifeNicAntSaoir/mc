package com.smbc.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.smbc.dto.DVDDTO;

@Entity
@Table(schema = "APP", name = "DVD")
public class DVD implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "DVDID")
	private Integer dvdID;

	@Column(name = "DIRECTOR")
	private String director;

	@Column(name = "VIDEOTYPE")
	private String videoType;

	@Column(name = "NUMCHAPTERS")
	private Integer numChapters;

	@Column(name = "DURATION")
	private Integer duration;

	@OneToOne
	@JoinColumn(name = "ITEMID")
	private Item item;

	public DVD() {

	}

	public DVD(String director, String videoType, Integer numChapters, Integer duration) {
		this.director = director;
		this.videoType = videoType;
		this.numChapters = numChapters;
		this.duration = duration;
	}

	public DVD(DVDDTO dvdDTO) {
		this.director = dvdDTO.getDirector();
		this.videoType = dvdDTO.getVideoType();
		this.numChapters = dvdDTO.getNumChapters();
		this.duration = dvdDTO.getDuration();
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getVideoType() {
		return videoType;
	}

	public void setVideoType(String videoType) {
		this.videoType = videoType;
	}

	public Integer getNumChapters() {
		return numChapters;
	}

	public void setNumChapters(Integer numChapters) {
		this.numChapters = numChapters;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public Integer getDvdID() {
		return dvdID;
	}

	public void setDvdID(Integer dvdID) {
		this.dvdID = dvdID;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}


}
