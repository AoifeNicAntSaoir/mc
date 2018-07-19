package com.smbc.dto;

import com.smbc.model.Medium;

public class MediumDTO {

	private int mediumID;
	private String mediumDescription;

	public MediumDTO() {

	}

	public MediumDTO(Medium medium) {
		this.mediumDescription = medium.getMediumDesc();

	}

	public int getMediumID() {
		return mediumID;
	}

	public void setMediumID(int mediumID) {
		this.mediumID = mediumID;
	}

	public String getMediumDesc() {
		return mediumDescription;
	}

	public void setMediumDesc(String mediumDesc) {
		this.mediumDescription = mediumDesc;
	}

}
