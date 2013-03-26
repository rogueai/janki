package com.rogueai.janki.core.persistence.jpa.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.rogueai.janki.core.persistence.jpa.dao.IGraveDao;
import com.rogueai.janki.core.persistence.jpa.entity.Grave;

/**
 * 
 * @author Massimo Zugno
 * 
 */
@Repository
public class GraveDao extends GenericDao<Grave, Long> implements IGraveDao {

	@Override
	public Grave findById(Long id, boolean lock) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Grave> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Grave> findByExample(Grave exampleInstance) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Grave makePersistent(Grave entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void makeTransient(Grave entity) {
		// TODO Auto-generated method stub

	}

}
