package com.smbc.service;

import java.util.List;

import com.smbc.model.Medium;

public interface MediumService {
	public void addMedium(Medium medium);

	public List<Medium> getAllMediums();
}
