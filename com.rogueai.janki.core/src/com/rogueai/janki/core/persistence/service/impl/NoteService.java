package com.rogueai.janki.core.persistence.service.impl;

import java.sql.SQLException;

import com.rogueai.janki.core.persistence.dao.INoteDao;
import com.rogueai.janki.core.persistence.dao.factory.DaoFactory;

/**
 * 
 * @author matsuleode
 * 
 */
public class NoteService extends CardService {

	private INoteDao noteDao = DaoFactory.INSTANCE.getNoteDao();

	public NoteService() throws SQLException {
		super();
	}

	protected INoteDao getNoteDao() {
		return noteDao;
	}

}
