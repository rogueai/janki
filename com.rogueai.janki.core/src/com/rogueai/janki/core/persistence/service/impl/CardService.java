package com.rogueai.janki.core.persistence.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.rogueai.janki.core.persistence.dao.impl.CardDao;
import com.rogueai.janki.core.persistence.entity.Card;
import com.rogueai.janki.core.persistence.service.IService;

/**
 * 
 * @author matsuleode
 *
 */
public class CardService implements IService {

	protected CardDao cardDao;
	
	public List<Card> findAllCards() throws SQLException{
		return cardDao.queryForAll();
	}

}
