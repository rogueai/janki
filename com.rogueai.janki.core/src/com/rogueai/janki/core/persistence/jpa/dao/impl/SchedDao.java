package com.rogueai.janki.core.persistence.jpa.dao.impl;

import java.util.List;

import com.rogueai.janki.core.persistence.jpa.dao.ISchedDao;
import com.rogueai.janki.core.persistence.jpa.entity.Sched;

/**
 * 
 * @author Massimo Zugno
 * 
 */
public class SchedDao extends GenericDao<Sched, Long> implements ISchedDao {

	@Override
	public Sched findById(Long id, boolean lock) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Sched> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Sched> findByExample(Sched exampleInstance) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Sched makePersistent(Sched entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void makeTransient(Sched entity) {
		// TODO Auto-generated method stub

	}

}
