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

import com.smbc.dto.MagazineDTO;

@Entity
@Table(schema = "APP", name = "MAGAZINE")
public class Magazine implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MAGAZINEID")
	private Integer magazineId;

	@Column(name = "DATA")
	private String data;

	@Column(name = "MAGAZINETYPE")
	private String magazineType;

	@Column(name = "RELPERIOD")
	private String relPeriod;

	@OneToOne
	@JoinColumn(name = "ITEMID")
	private Item item;

	public Magazine() {

	}

	public Magazine(MagazineDTO magazineDTO) {
		this.magazineId = magazineDTO.getMagazineId();
		this.data = magazineDTO.getData();
		this.magazineType = magazineDTO.getMagazineType();
		this.relPeriod = magazineDTO.getRelPeriod();
	}

	public Integer getMagazineId() {
		return magazineId;
	}

	public void setMagazineId(Integer magazineId) {
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

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

}
