package com.rogueai.janki.core.persistence.jpa.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rogueai.janki.core.persistence.jpa.dao.impl.CollectionDao;
import com.rogueai.janki.core.persistence.jpa.dao.impl.GraveDao;
import com.rogueai.janki.core.persistence.jpa.dao.impl.NoteDao;
import com.rogueai.janki.core.persistence.jpa.dao.impl.RevlogDao;

/**
 * 
 * @author Massimo Zugno
 * 
 */
@Service
public class CollectionService extends CardService {

	@Autowired
	private CollectionDao collectionDao;
	@Autowired
	private NoteDao noteDao;
	@Autowired
	private RevlogDao revlogDao;
	@Autowired
	private GraveDao graveDao;

}
