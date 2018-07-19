package com.smbc.dao;

import java.util.List;

import com.smbc.model.Medium;

public interface MediumDao {

	public List<Medium> getAllMediums();

	public void addMedium(Medium medium);

}
