package com.rogueai.janki.core.persistence.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.rogueai.janki.core.persistence.dao.ICardDao;
import com.rogueai.janki.core.persistence.dao.factory.DaoFactory;
import com.rogueai.janki.core.persistence.entity.Card;
import com.rogueai.janki.core.persistence.service.IService;

/**
 * 
 * @author matsuleode
 * 
 */
public class CardService extends AbstractService implements IService {

	protected ICardDao cardDao = DaoFactory.INSTANCE.getCardDao();

	public CardService() throws SQLException {
		super();
	}

	protected ICardDao getCardDao() {
		return cardDao;
	}

	public List<Card> findAllCards() throws SQLException {
		return getCardDao().queryForAll();
	}
}
