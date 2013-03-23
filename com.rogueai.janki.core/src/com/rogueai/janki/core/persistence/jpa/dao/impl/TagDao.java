package com.rogueai.janki.core.persistence.jpa.dao.impl;

import java.util.List;

import com.rogueai.janki.core.persistence.jpa.dao.ITagDao;
import com.rogueai.janki.core.persistence.jpa.entity.Tag;

/**
 * 
 * @author Massimo Zugno
 *
 */
public class TagDao extends GenericDao<Tag, Long> implements ITagDao {

	@Override
	public Tag findById(Long id, boolean lock) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Tag> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Tag> findByExample(Tag exampleInstance) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Tag makePersistent(Tag entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void makeTransient(Tag entity) {
		// TODO Auto-generated method stub

	}

}
