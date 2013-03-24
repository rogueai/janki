package com.rogueai.janki.core.persistence.jpa.dao.factory.impl;

import com.rogueai.janki.core.persistence.jpa.dao.factory.DaoFactory;
import com.rogueai.janki.core.persistence.jpa.dao.impl.CardDao;
import com.rogueai.janki.core.persistence.jpa.dao.impl.CollectionDao;
import com.rogueai.janki.core.persistence.jpa.dao.impl.GenericDao;
import com.rogueai.janki.core.persistence.jpa.dao.impl.GraveDao;
import com.rogueai.janki.core.persistence.jpa.dao.impl.NoteDao;
import com.rogueai.janki.core.persistence.jpa.dao.impl.RevlogDao;
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
			dao.setEntityManager(HibernateUtil.getEntityManager());
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
	public GraveDao getGraveDao() {
		return instantiateDao(GraveDao.class);
	}

	@Override
	public NoteDao getNoteDao() {
		return instantiateDao(NoteDao.class);
	}

	@Override
	public RevlogDao getRevlogDao() {
		return instantiateDao(RevlogDao.class);
	}

	// Inline concrete DAO implementations with no business-related data access
	// methods.
	// If we use public static nested classes, we can centralize all of them in
	// one source file.

	// public static class CommentDAOHibernate
	// extends GenericHibernateDAO<Comment, Long>
	// implements CommentDAO {}

}