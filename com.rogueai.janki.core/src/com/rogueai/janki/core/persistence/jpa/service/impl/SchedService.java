package com.rogueai.janki.core.persistence.jpa.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rogueai.janki.core.persistence.jpa.dao.impl.RevlogDao;

/**
 * 
 * @author Massimo Zugno
 * 
 */
@Service
public class SchedService extends CardService {

	@Autowired
	private RevlogDao revlogDao;

}
