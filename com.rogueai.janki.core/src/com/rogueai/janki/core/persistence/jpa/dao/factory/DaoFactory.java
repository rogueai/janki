package com.rogueai.janki.core.persistence.jpa.dao.factory;

import com.rogueai.janki.core.persistence.jpa.dao.factory.impl.HibernateDaoFactory;
import com.rogueai.janki.core.persistence.jpa.dao.impl.CardDao;
import com.rogueai.janki.core.persistence.jpa.dao.impl.CollectionDao;
import com.rogueai.janki.core.persistence.jpa.dao.impl.GraveDao;
import com.rogueai.janki.core.persistence.jpa.dao.impl.NoteDao;
import com.rogueai.janki.core.persistence.jpa.dao.impl.RevlogDao;

/**
 * 
 * @author Massimo Zugno
 * 
 */
public abstract class DaoFactory {

	public static final Class<? extends DaoFactory> HIBERNATE = HibernateDaoFactory.class;

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

	public abstract CardDao getCardDao();

	public abstract CollectionDao getCollectionDao();

	public abstract GraveDao getGraveDao();

	public abstract NoteDao getNoteDao();

	public abstract RevlogDao getRevlogDao();

}