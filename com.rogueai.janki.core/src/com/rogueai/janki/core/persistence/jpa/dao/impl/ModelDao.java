package com.rogueai.janki.core.persistence.jpa.dao.impl;

import java.util.List;

import com.rogueai.janki.core.persistence.jpa.dao.IModelDao;
import com.rogueai.janki.core.persistence.jpa.entity.Model;

/**
 * 
 * @author Massimo Zugno
 * 
 */
public class ModelDao extends GenericDao<Model, Long> implements IModelDao {

	@Override
	public Model findById(Long id, boolean lock) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Model> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Model> findByExample(Model exampleInstance) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Model makePersistent(Model entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void makeTransient(Model entity) {
		// TODO Auto-generated method stub

	}

}
