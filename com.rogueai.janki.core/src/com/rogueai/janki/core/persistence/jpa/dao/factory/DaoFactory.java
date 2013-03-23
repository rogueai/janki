package com.rogueai.janki.core.persistence.jpa.dao.factory;

import com.rogueai.janki.core.persistence.jpa.dao.factory.impl.HibernateDaoFactory;
import com.rogueai.janki.core.persistence.jpa.dao.impl.CardDao;
import com.rogueai.janki.core.persistence.jpa.dao.impl.CollectionDao;
import com.rogueai.janki.core.persistence.jpa.dao.impl.DeckDao;
import com.rogueai.janki.core.persistence.jpa.dao.impl.GraveDao;
import com.rogueai.janki.core.persistence.jpa.dao.impl.ModelDao;
import com.rogueai.janki.core.persistence.jpa.dao.impl.NoteDao;
import com.rogueai.janki.core.persistence.jpa.dao.impl.RevlogDao;
import com.rogueai.janki.core.persistence.jpa.dao.impl.SchedDao;
import com.rogueai.janki.core.persistence.jpa.dao.impl.StatDao;
import com.rogueai.janki.core.persistence.jpa.dao.impl.TagDao;

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

	public abstract DeckDao getDeckDao();

	public abstract GraveDao getGraveDao();

	public abstract ModelDao getModelDao();

	public abstract NoteDao getNoteDao();

	public abstract RevlogDao getRevlogDao();

	public abstract SchedDao getSchedDao();

	public abstract StatDao getStatDao();

	public abstract TagDao getTagDao();

}