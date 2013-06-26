package com.rogueai.janki.core.persistence.dao.factory;

import java.sql.SQLException;

import com.rogueai.janki.core.persistence.dao.factory.impl.JAnkiDaoFactory;
import com.rogueai.janki.core.persistence.dao.impl.CardDao;
import com.rogueai.janki.core.persistence.dao.impl.CollectionDao;
import com.rogueai.janki.core.persistence.dao.impl.GraveDao;
import com.rogueai.janki.core.persistence.dao.impl.NoteDao;
import com.rogueai.janki.core.persistence.dao.impl.RevlogDao;

/**
 * 
 * @author matsuleode
 * 
 */
public abstract class DaoFactory {

	public static final Class<? extends DaoFactory> ORM_LITE = JAnkiDaoFactory.class;

	/**
	 * Factory method for instantiation of concrete factories.
	 */
	public static DaoFactory instance(Class<? extends DaoFactory> factory) {
		try {
			return factory.newInstance();
		} catch (Exception ex) {
			throw new RuntimeException("Couldn't create DAOFactory: " + factory);
		}
	}

	public abstract CardDao getCardDao() throws SQLException;

	public abstract CollectionDao getCollectionDao() throws SQLException;

	public abstract GraveDao getGraveDao() throws SQLException;

	public abstract NoteDao getNoteDao() throws SQLException;

	public abstract RevlogDao getRevlogDao() throws SQLException;

}