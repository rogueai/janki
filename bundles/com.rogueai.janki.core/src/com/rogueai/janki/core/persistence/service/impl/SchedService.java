package com.rogueai.janki.core.persistence.service.impl;

import java.sql.SQLException;

import com.rogueai.janki.core.persistence.dao.IRevlogDao;
import com.rogueai.janki.core.persistence.dao.factory.DaoFactory;

/**
 * 
 * @author matsuleode
 * 
 */
public class SchedService extends CardService {

	private IRevlogDao revlogDao = DaoFactory.INSTANCE.getRevlogDao();

	public SchedService() throws SQLException {
		super();
	}

}
