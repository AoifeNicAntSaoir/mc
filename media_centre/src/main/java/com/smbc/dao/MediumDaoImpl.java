package com.smbc.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.smbc.model.Medium;

@Repository
public class MediumDaoImpl implements MediumDao {

	@PersistenceContext
	private EntityManager manager;

	@Override
	public List<Medium> getAllMediums() {
		List<Medium> list = manager.createQuery("Select b from Medium b", Medium.class).getResultList();
		return list;
	}

	@Override
	public void addMedium(Medium medium) {
		manager.persist(medium);

	}


}