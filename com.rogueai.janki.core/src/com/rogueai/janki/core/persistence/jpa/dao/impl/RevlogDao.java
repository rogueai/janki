package com.rogueai.janki.core.persistence.jpa.dao.impl;

import java.util.List;

import com.rogueai.janki.core.persistence.jpa.dao.IRevlogDao;
import com.rogueai.janki.core.persistence.jpa.entity.Revlog;

/**
 * 
 * @author Massimo Zugno
 * 
 */
public class RevlogDao extends GenericDao<Revlog, Long> implements IRevlogDao {

	@Override
	public Revlog findById(Long id, boolean lock) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Revlog> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Revlog> findByExample(Revlog exampleInstance) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Revlog makePersistent(Revlog entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void makeTransient(Revlog entity) {
		// TODO Auto-generated method stub

	}

}
