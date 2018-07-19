package com.smbc.dto;

import com.smbc.model.Magazine;

public class MagazineDTO {

	private int magazineId;
	private String data;
	private String magazineType;
	private String relPeriod;

	public MagazineDTO() {

	}

	public MagazineDTO(int magazineId, String data, String magazineType, String relPeriod) {
		this.magazineId = magazineId;
		this.data = data;
		this.magazineType = magazineType;
		this.relPeriod = relPeriod;
	}

	public MagazineDTO(Magazine magazine) {
		this.magazineId = magazine.getMagazineId();
		this.data = magazine.getData();
		this.magazineType = magazine.getMagazineType();
		this.relPeriod = magazine.getRelPeriod();
	}

	public int getMagazineId() {
		return magazineId;
	}

	public void setMagazineId(int magazineId) {
		this.magazineId = magazineId;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getMagazineType() {
		return magazineType;
	}

	public void setMagazineType(String magazineType) {
		this.magazineType = magazineType;
	}

	public String getRelPeriod() {
		return relPeriod;
	}

	public void setRelPeriod(String relPeriod) {
		this.relPeriod = relPeriod;
	}


}
