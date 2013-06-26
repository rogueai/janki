package com.rogueai.janki.core.persistence.dao.factory;

import java.sql.SQLException;

import com.rogueai.janki.core.persistence.dao.ICardDao;
import com.rogueai.janki.core.persistence.dao.ICollectionDao;
import com.rogueai.janki.core.persistence.dao.IGraveDao;
import com.rogueai.janki.core.persistence.dao.INoteDao;
import com.rogueai.janki.core.persistence.dao.IRevlogDao;
import com.rogueai.janki.core.persistence.dao.factory.impl.JAnkiDaoFactory;

/**
 * 
 * @author matsuleode
 * 
 */
public abstract class DaoFactory {

	public static final Class<? extends DaoFactory> ORM_LITE = JAnkiDaoFactory.class;
	public static final DaoFactory INSTANCE;
	static {
		INSTANCE = instance(ORM_LITE);
	}

	/**
	 * Factory method for instantiation of concrete factories.
	 */
	private static DaoFactory instance(Class<? extends DaoFactory> factory) {
		try {
			return factory.newInstance();
		} catch (Exception ex) {
			throw new RuntimeException("Couldn't create DAOFactory: " + factory);
		}
	}

	public abstract ICardDao getCardDao() throws SQLException;

	public abstract ICollectionDao getCollectionDao() throws SQLException;

	public abstract IGraveDao getGraveDao() throws SQLException;

	public abstract INoteDao getNoteDao() throws SQLException;

	public abstract IRevlogDao getRevlogDao() throws SQLException;

}