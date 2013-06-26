package com.rogueai.janki.core.persistence.dao.factory.impl;

import java.sql.SQLException;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.rogueai.janki.core.persistence.dao.factory.DaoFactory;
import com.rogueai.janki.core.persistence.dao.impl.CardDao;
import com.rogueai.janki.core.persistence.dao.impl.CollectionDao;
import com.rogueai.janki.core.persistence.dao.impl.GraveDao;
import com.rogueai.janki.core.persistence.dao.impl.NoteDao;
import com.rogueai.janki.core.persistence.dao.impl.RevlogDao;
import com.rogueai.janki.core.persistence.entity.Card;
import com.rogueai.janki.core.persistence.entity.Collection;
import com.rogueai.janki.core.persistence.entity.Grave;
import com.rogueai.janki.core.persistence.entity.Note;
import com.rogueai.janki.core.persistence.entity.Revlog;

/**
 * Provides access to the various {@link Dao} implementations.
 * 
 * XXX: it seems very related to the Storage (storage.py) class in Anki, so at
 * least initially we could move here some "storage" features, like SQLite
 * initialization, etc.
 * 
 * XXX : Since in Anki logic and persistence are quite mixed, there's another
 * class that seems to bee related with Storage: AnkiDB (db.py)
 * 
 * XXX: Anki does a massive usage of SQLite specific SQL statements, like
 * PRAGMA. in order to achieve the same results in OrmLite we could use
 * {@link Dao#executeRaw(String, String...)}, but the question is: which dao are
 * we going to use for a PRAGMA statement which applies to a db, not to a table.
 * 
 * XXX: DaoManager caches every dao created, but I'd say we might add a static
 * instance for every dao, just to be sure
 * 
 * 
 * @author matsuleode
 * 
 */
public class JAnkiDaoFactory extends DaoFactory {

	/*
	 * TODO: this is getting the db from the eclipse installation folder
	 */
	private static final String DB_URL = "jdbc:sqlite:/home/zuegg/collection.anki2";

	private ConnectionSource connectionSource;

	public JAnkiDaoFactory() {
		super();
		init();
	}

	private void init() {
		try {
			if (connectionSource == null) {
				connectionSource = new JdbcConnectionSource(DB_URL);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public CardDao getCardDao() throws SQLException {
		return DaoManager.createDao(connectionSource, Card.class);
	}

	@Override
	public CollectionDao getCollectionDao() throws SQLException {
		return DaoManager.createDao(connectionSource, Collection.class);
	}

	@Override
	public GraveDao getGraveDao() throws SQLException {
		return DaoManager.createDao(connectionSource, Grave.class);
	}

	@Override
	public NoteDao getNoteDao() throws SQLException {
		return DaoManager.createDao(connectionSource, Note.class);
	}

	@Override
	public RevlogDao getRevlogDao() throws SQLException {
		return DaoManager.createDao(connectionSource, Revlog.class);
	}

}
