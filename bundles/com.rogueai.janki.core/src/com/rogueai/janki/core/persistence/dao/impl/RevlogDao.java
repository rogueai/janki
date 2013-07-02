package com.rogueai.janki.core.persistence.dao.impl;

import java.sql.SQLException;

import com.j256.ormlite.dao.BaseDaoImpl;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.DatabaseTableConfig;
import com.rogueai.janki.core.persistence.dao.IRevlogDao;
import com.rogueai.janki.core.persistence.entity.Revlog;

/**
 * 
 * @author matsuleode
 * 
 */
public class RevlogDao extends BaseDaoImpl<Revlog, Long> implements IRevlogDao {

	public RevlogDao(Class<Revlog> dataClass) throws SQLException {
		super(dataClass);
	}

	public RevlogDao(ConnectionSource connectionSource, Class<Revlog> dataClass) throws SQLException {
		super(connectionSource, dataClass);
	}

	public RevlogDao(ConnectionSource connectionSource, DatabaseTableConfig<Revlog> tableConfig) throws SQLException {
		super(connectionSource, tableConfig);
	}

}
