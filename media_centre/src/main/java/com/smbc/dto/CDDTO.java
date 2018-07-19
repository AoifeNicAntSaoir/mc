package com.smbc.dto;

import com.smbc.model.CD;

public class CDDTO {

	private int cdId;
	private String artist;
	private String musicType;
	private int totalDuration;
	private int numTracks;
	private int itemID;


	public CDDTO() {

	}

	public CDDTO(CD cd) {
		this.cdId = cd.getCdId();
		this.numTracks = cd.getNumTracks();
		this.artist = cd.getArtist();
		this.musicType = cd.getMusicType();
		this.totalDuration = cd.getTotalDuration();
		this.itemID = cd.getItem().getItemID();

	}

	public int getItemID() {
		return itemID;
	}

	public void setItemID(int itemID) {
		this.itemID = itemID;
	}

	public int getCdId() {
		return cdId;
	}

	public void setCdId(int cdId) {
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

	public int getTotalDuration() {
		return totalDuration;
	}

	public void setTotalDuration(int totalDuration) {
		this.totalDuration = totalDuration;
	}

	public int getNumTracks() {
		return numTracks;
	}

	public void setNumTracks(int numTracks) {
		this.numTracks = numTracks;
	}


}
