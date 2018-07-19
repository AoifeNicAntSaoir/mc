package com.smbc.dto;

import com.smbc.model.VideoGame;

public class VideoGameDTO {

	private int videoGameId;
	private String company;
	private String gameType;
	private String multiplayerFlag;
	private String consoleType;

	public VideoGameDTO() {

	}

	public VideoGameDTO(VideoGame video) {
		this.videoGameId = video.getVideoGameId();
		this.company = video.getCompany();
		this.gameType = video.getGameType();
		this.multiplayerFlag = video.getMultiplayerFlag();
		this.consoleType = video.getConsoleType();
	}

	public int getVideoGameId() {
		return videoGameId;
	}

	public void setVideoGameId(int videoGameId) {
		this.videoGameId = videoGameId;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getGameType() {
		return gameType;
	}

	public void setGameType(String gameType) {
		this.gameType = gameType;
	}

	public String getMultiplayerFlag() {
		return multiplayerFlag;
	}

	public void setMultiplayerFlag(String multiplayerFlag) {
		this.multiplayerFlag = multiplayerFlag;
	}

	public String getConsoleType() {
		return consoleType;
	}

	public void setConsoleType(String consoleType) {
		this.consoleType = consoleType;
	}

}
