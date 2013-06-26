package com.rogueai.janki.core.persistence.dao.impl;

import java.sql.SQLException;

import com.j256.ormlite.dao.BaseDaoImpl;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.DatabaseTableConfig;
import com.rogueai.janki.core.persistence.dao.INoteDao;
import com.rogueai.janki.core.persistence.entity.Note;

/**
 * 
 * @author matsuleode
 * 
 */
public class NoteDao extends BaseDaoImpl<Note, Long> implements INoteDao {

	public NoteDao(Class<Note> dataClass) throws SQLException {
		super(dataClass);
	}

	public NoteDao(ConnectionSource connectionSource, Class<Note> dataClass) throws SQLException {
		super(connectionSource, dataClass);
	}

	public NoteDao(ConnectionSource connectionSource, DatabaseTableConfig<Note> tableConfig) throws SQLException {
		super(connectionSource, tableConfig);
	}

}
