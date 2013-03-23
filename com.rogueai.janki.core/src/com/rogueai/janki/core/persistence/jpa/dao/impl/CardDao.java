/**
 * 
 */
package com.rogueai.janki.core.persistence.jpa.dao.impl;

import java.util.List;

import com.rogueai.janki.core.persistence.jpa.dao.ICardDao;
import com.rogueai.janki.core.persistence.jpa.entity.Card;

/**
 * @author Massimo Zugno
 * 
 */
public class CardDao extends GenericDao<Card, Long> implements ICardDao {

	@Override
	public Card findById(Long id, boolean lock) {
		// TODO Auto-generated method stub
		return null;
	} 

	@Override
	public List<Card> findAll() {
		return findByCriteria();
	}

	@Override
	public List<Card> findByExample(Card exampleInstance) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Card makePersistent(Card entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void makeTransient(Card entity) {
		// TODO Auto-generated method stub

	}

}
