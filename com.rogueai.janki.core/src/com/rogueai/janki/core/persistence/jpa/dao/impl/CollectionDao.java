package com.rogueai.janki.core.persistence.jpa.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.rogueai.janki.core.persistence.jpa.dao.ICollectionDao;
import com.rogueai.janki.core.persistence.jpa.entity.Collection;

/**
 * 
 * @author Massimo Zugno
 * 
 */
@Repository
public class CollectionDao extends GenericDao<Collection, Long> implements ICollectionDao {

	@Override
	public Collection findById(Long id, boolean lock) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Collection> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Collection> findByExample(Collection exampleInstance) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection makePersistent(Collection entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void makeTransient(Collection entity) {
		// TODO Auto-generated method stub

	}

}
