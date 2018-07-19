package com.smbc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.smbc.dao.MediumDao;
import com.smbc.model.Medium;

@Service("mediumService")
public class MediumServiceImpl implements MediumService {

	@Autowired
	private MediumDao mediumDao;

	@Override
	@Transactional
	public void addMedium(Medium medium) {
		mediumDao.addMedium(medium);
	}

	@Override
	public List<Medium> getAllMediums() {
		return mediumDao.getAllMediums();
	}

}
