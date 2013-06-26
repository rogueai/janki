package com.rogueai.janki.core.persistence.service.impl;

import java.sql.SQLException;

import com.rogueai.janki.core.persistence.dao.factory.DaoFactory;
import com.rogueai.janki.core.persistence.dao.impl.CollectionDao;
import com.rogueai.janki.core.persistence.dao.impl.GraveDao;
import com.rogueai.janki.core.persistence.dao.impl.NoteDao;
import com.rogueai.janki.core.persistence.dao.impl.RevlogDao;

/**
 * 
 * @author matsuleode
 * 
 */
public class CollectionService extends CardService {

	private CollectionDao collectionDao;

	private NoteDao noteDao;

	private RevlogDao revlogDao;

	private GraveDao graveDao;

	public CollectionService() throws SQLException {
		super();
	}

	protected CollectionDao getCollectionDao() {
		return collectionDao;
	}

	protected NoteDao getNoteDao() {
		return noteDao;
	}

	protected RevlogDao getRevlogDao() {
		return revlogDao;
	}

	protected GraveDao getGraveDao() {
		return graveDao;
	}

}
