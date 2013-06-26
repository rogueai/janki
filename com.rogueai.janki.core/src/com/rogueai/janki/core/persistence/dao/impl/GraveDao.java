package com.rogueai.janki.core.persistence.dao.impl;

import java.sql.SQLException;

import com.j256.ormlite.dao.BaseDaoImpl;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.DatabaseTableConfig;
import com.rogueai.janki.core.persistence.dao.IGraveDao;
import com.rogueai.janki.core.persistence.entity.Grave;

/**
 * 
 * @author matsuleode
 * 
 */
public class GraveDao extends BaseDaoImpl<Grave, Long> implements IGraveDao {

	public GraveDao(Class<Grave> dataClass) throws SQLException {
		super(dataClass);
	}

	public GraveDao(ConnectionSource connectionSource, Class<Grave> dataClass) throws SQLException {
		super(connectionSource, dataClass);
	}

	public GraveDao(ConnectionSource connectionSource, DatabaseTableConfig<Grave> tableConfig) throws SQLException {
		super(connectionSource, tableConfig);
	}

}
