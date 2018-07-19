package com.smbc.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.smbc.dto.CDDTO;

@Entity
@Table(schema = "APP", name = "CD")
public class CD implements Serializable {
	private static final long serialVersionUID = 3094757768242760520L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CDID")
	private Integer cdId;

	@Column(name = "ARTIST")
	private String artist;

	@Column(name = "MUSICTYPE")
	private String musicType;

	@Column(name = "NUMTRACKS")
	private Integer numTracks;

	@Column(name = "TOTALDURATION")
	private Integer totalDuration;

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	private Item item;



	public CD() {
		
	}

	public CD(Integer cdID, String artist, String musicType, Integer numTracks, Integer totalDuration) {
		this.cdId = cdId;
		this.artist = artist;
		this.musicType = musicType;
		this.numTracks = numTracks;
		this.totalDuration = totalDuration;
	}
	
	public CD(CDDTO cdDTO) {
		this.cdId = cdDTO.getCdId();
		this.artist = cdDTO.getArtist();
		this.musicType = cdDTO.getMusicType();
		this.numTracks = cdDTO.getNumTracks();
		this.totalDuration = cdDTO.getTotalDuration();
	}

	public Integer getCdId() {
		return cdId;
	}

	public void setCdId(Integer cdId) {
		this.cdId = cdId;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getMusicType() {
		return musicType;
	}

	public void setMusicType(String musicType) {
		this.musicType = musicType;
	}

	public Integer getNumTracks() {
		return numTracks;
	}

	public void setNumTracks(Integer numTracks) {
		this.numTracks = numTracks;
	}

	public Integer getTotalDuration() {
		return totalDuration;
	}

	public void setTotalDuration(Integer totalDuration) {
		this.totalDuration = totalDuration;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

}