package com.rogueai.janki.core.persistence.dao.impl;

import java.sql.SQLException;

import com.j256.ormlite.dao.BaseDaoImpl;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.DatabaseTableConfig;
import com.rogueai.janki.core.persistence.dao.ICollectionDao;
import com.rogueai.janki.core.persistence.entity.Collection;

/**
 * 
 * @author matsuleode
 * 
 */
public class CollectionDao extends BaseDaoImpl<Collection, Long> implements ICollectionDao {

	public CollectionDao(Class<Collection> dataClass) throws SQLException {
		super(dataClass);
	}

	public CollectionDao(ConnectionSource connectionSource, Class<Collection> dataClass) throws SQLException {
		super(connectionSource, dataClass);
	}

	public CollectionDao(ConnectionSource connectionSource, DatabaseTableConfig<Collection> tableConfig) throws SQLException {
		super(connectionSource, tableConfig);
	}

}
