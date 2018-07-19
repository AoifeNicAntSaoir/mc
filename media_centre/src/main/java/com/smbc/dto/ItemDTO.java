package com.smbc.dto;

import com.smbc.model.Item;

public class ItemDTO {

	private int itemID;
	private int mediumID;
	private String title;
	private int copyID;

	public ItemDTO() {

	}

	public ItemDTO(Item item) {
		this.itemID = item.getItemID();
		this.mediumID = item.getMediumId();
		this.title = item.getTitle();
		this.copyID = item.getCopyID();
	}

	public int getItemID() {
		return itemID;
	}

	public void setItemID(int itemID) {
		this.itemID = itemID;
	}

	public int getMediumID() {
		return mediumID;
	}

	public void setMediumID(int mediumID) {
		this.mediumID = mediumID;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getCopyID() {
		return copyID;
	}

	public void setCopyID(int copyID) {
		this.copyID = copyID;
	}


}
