package com.smbc.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.smbc.dto.MediumDTO;

@Entity
@Table(schema = "APP", name = "MEDIUM")
public class Medium implements Serializable {
	private static final long serialVersionUID = 3094757768242760520L;

	@Id
	@Column(name = "MEDIUMID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer mediumId;

	@Column(name = "MEDIUMDESCRIPTION")
	private String mediumDescription;

	public Medium() {

	}

	public Medium(String mediumDesc) {
		this.mediumDescription = mediumDesc;
	}

	public Medium(MediumDTO medium) {
		this.mediumDescription = medium.getMediumDesc();
	}

	public Integer getMediumId() {
		return mediumId;
	}

	public void setMediumId(Integer mediumId) {
		this.mediumId = mediumId;
	}

	public String getMediumDesc() {
		return mediumDescription;
	}

	public void setMediumDesc(String mediumDesc) {
		this.mediumDescription = mediumDesc;
	}

}
