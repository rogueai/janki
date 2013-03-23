package com.rogueai.janki.core.persistence.jpa.dao.impl;

import java.util.List;

import com.rogueai.janki.core.persistence.jpa.dao.IDeckDao;
import com.rogueai.janki.core.persistence.jpa.entity.Deck;

/**
 * 
 * @author Massimo Zugno
 *
 */
public class DeckDao extends GenericDao<Deck, Long> implements IDeckDao {

	@Override
	public Deck findById(Long id, boolean lock) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Deck> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Deck> findByExample(Deck exampleInstance) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Deck makePersistent(Deck entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void makeTransient(Deck entity) {
		// TODO Auto-generated method stub

	}

}
