package com.smbc.dto;

import com.smbc.model.DVD;

public class DVDDTO {
	private int dvdId;
	private String director;
	private String videoType;
	private int numChapters;
	private int duration;

	public DVDDTO() {

	}

	public DVDDTO(DVD dvd) {
		this.dvdId = dvd.getDvdID();
		this.director = dvd.getDirector();
		this.videoType = dvd.getVideoType();
		this.numChapters = dvd.getNumChapters();
		this.duration = dvd.getDuration();

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

	public int getNumChapters() {
		return numChapters;
	}

	public void setNumChapters(int numChapters) {
		this.numChapters = numChapters;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

}
