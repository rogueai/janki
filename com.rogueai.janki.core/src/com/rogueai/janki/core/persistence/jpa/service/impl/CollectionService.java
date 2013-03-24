package com.rogueai.janki.core.persistence.jpa.service.impl;

import com.rogueai.janki.core.persistence.jpa.dao.impl.CollectionDao;
import com.rogueai.janki.core.persistence.jpa.dao.impl.GraveDao;
import com.rogueai.janki.core.persistence.jpa.dao.impl.NoteDao;
import com.rogueai.janki.core.persistence.jpa.dao.impl.RevlogDao;

/**
 * 
 * @author Massimo Zugno
 * 
 */
public class CollectionService extends CardService {

	private CollectionDao collectionDao;

	private NoteDao noteDao;

	private RevlogDao revlogDao;

	private GraveDao graveDao;

}
