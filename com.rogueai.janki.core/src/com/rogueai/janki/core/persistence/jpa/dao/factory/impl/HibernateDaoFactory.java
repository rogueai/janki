package com.rogueai.janki.core.persistence.jpa.dao.factory.impl;

import com.rogueai.janki.core.persistence.jpa.dao.factory.DaoFactory;
import com.rogueai.janki.core.persistence.jpa.dao.impl.CardDao;
import com.rogueai.janki.core.persistence.jpa.dao.impl.CollectionDao;
import com.rogueai.janki.core.persistence.jpa.dao.impl.DeckDao;
import com.rogueai.janki.core.persistence.jpa.dao.impl.GenericDao;
import com.rogueai.janki.core.persistence.jpa.dao.impl.GraveDao;
import com.rogueai.janki.core.persistence.jpa.dao.impl.ModelDao;
import com.rogueai.janki.core.persistence.jpa.dao.impl.NoteDao;
import com.rogueai.janki.core.persistence.jpa.dao.impl.RevlogDao;
import com.rogueai.janki.core.persistence.jpa.dao.impl.SchedDao;
import com.rogueai.janki.core.persistence.jpa.dao.impl.StatDao;
import com.rogueai.janki.core.persistence.jpa.dao.impl.TagDao;
import com.rogueai.janki.core.persistence.util.HibernateUtil;

/**
 * 
 * @author Massimo Zugno
 * 
 */
public class HibernateDaoFactory extends DaoFactory {

	private <DAO extends GenericDao<?, Long>> DAO instantiateDao(Class<DAO> daoClass) {
		try {
			DAO dao = daoClass.newInstance();
			dao.setEntityManager(HibernateUtil.getSesssionFactory());
			return dao;
		} catch (Exception ex) {
			throw new RuntimeException("Can not instantiate DAO: " + daoClass, ex);
		}
	}

	@Override
	public CardDao getCardDao() {
		return instantiateDao(CardDao.class);
	}

	@Override
	public CollectionDao getCollectionDao() {
		return instantiateDao(CollectionDao.class);
	}

	@Override
	public DeckDao getDeckDao() {
		return instantiateDao(DeckDao.class);
	}

	@Override
	public GraveDao getGraveDao() {
		return instantiateDao(GraveDao.class);
	}

	@Override
	public ModelDao getModelDao() {
		return instantiateDao(ModelDao.class);
	}

	@Override
	public NoteDao getNoteDao() {
		return instantiateDao(NoteDao.class);
	}

	@Override
	public RevlogDao getRevlogDao() {
		return instantiateDao(RevlogDao.class);
	}

	@Override
	public SchedDao getSchedDao() {
		return instantiateDao(SchedDao.class);
	}

	@Override
	public StatDao getStatDao() {
		return instantiateDao(StatDao.class);
	}

	@Override
	public TagDao getTagDao() {
		return instantiateDao(TagDao.class);
	}

	// Inline concrete DAO implementations with no business-related data access
	// methods.
	// If we use public static nested classes, we can centralize all of them in
	// one source file.

	// public static class CommentDAOHibernate
	// extends GenericHibernateDAO<Comment, Long>
	// implements CommentDAO {}

}