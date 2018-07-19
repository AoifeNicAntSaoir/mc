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

import com.smbc.dto.VideoGameDTO;

@Entity
@Table(schema = "APP", name = "VIDEOGAME")
public class VideoGame implements Serializable {

	@Id
	@Column(name = "VIDEOGAMEID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer videoGameId;

	@Column(name = "COMPANY")
	private String company;

	@Column(name = "GAMETYPE")
	private String gameType;

	@Column(name = "MULTIPLAYERFLAG")
	private String multiplayerFlag;

	@Column(name = "CONSOLETYPE")
	private String consoleType;

	@OneToOne
	@JoinColumn(name = "ITEMID")
	private Item item;

	public VideoGame() {
		
	}

	public VideoGame(Integer videoGameId, String company, String gameType, String multiplayerFlag, String consoleType) {
		this.videoGameId = videoGameId;
		this.company = company;
		this.gameType = gameType;
		this.multiplayerFlag = multiplayerFlag;
		this.consoleType = consoleType;
	}

	public VideoGame(VideoGameDTO videoGameDTO) {
		this.videoGameId = videoGameDTO.getVideoGameId();
		this.company = videoGameDTO.getCompany();
		this.gameType = videoGameDTO.getGameType();
		this.multiplayerFlag = videoGameDTO.getMultiplayerFlag();
		this.consoleType = videoGameDTO.getConsoleType();
	}

	public Integer getVideoGameId() {
		return videoGameId;
	}

	public void setVideoGameId(Integer videoGameId) {
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

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

}
