package com.rogueai.janki.core.persistence.service.impl;

import java.sql.SQLException;

import com.rogueai.janki.core.persistence.dao.factory.DaoFactory;
import com.rogueai.janki.core.persistence.dao.impl.NoteDao;
import com.rogueai.janki.core.persistence.service.IService;

/**
 * 
 * @author matsuleode
 *
 */
public class TagService extends NoteService implements IService {

	public TagService() throws SQLException {
		super();
	}
	
}
