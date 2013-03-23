package com.rogueai.janki.core.persistence.jpa.dao.impl;

import java.util.List;

import com.rogueai.janki.core.persistence.jpa.dao.IStatDao;
import com.rogueai.janki.core.persistence.jpa.entity.Stat;

/**
 * 
 * @author Massimo Zugno
 *
 */
public class StatDao extends GenericDao<Stat, Long> implements IStatDao {

	@Override
	public Stat findById(Long id, boolean lock) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Stat> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Stat> findByExample(Stat exampleInstance) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Stat makePersistent(Stat entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void makeTransient(Stat entity) {
		// TODO Auto-generated method stub

	}

}
