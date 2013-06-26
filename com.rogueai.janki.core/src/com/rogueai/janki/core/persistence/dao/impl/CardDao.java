/**
 * 
 */
package com.rogueai.janki.core.persistence.dao.impl;

import java.sql.SQLException;

import com.j256.ormlite.dao.BaseDaoImpl;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.DatabaseTableConfig;
import com.rogueai.janki.core.persistence.dao.ICardDao;
import com.rogueai.janki.core.persistence.entity.Card;

/**
 * @author matsuleode
 * 
 */
public class CardDao extends BaseDaoImpl<Card, Long> implements ICardDao {

	public CardDao(Class<Card> dataClass) throws SQLException {
		super(dataClass);
	}

	public CardDao(ConnectionSource connectionSource, Class<Card> dataClass) throws SQLException {
		super(connectionSource, dataClass);
	}

	public CardDao(ConnectionSource connectionSource, DatabaseTableConfig<Card> tableConfig) throws SQLException {
		super(connectionSource, tableConfig);
	}
	
}
