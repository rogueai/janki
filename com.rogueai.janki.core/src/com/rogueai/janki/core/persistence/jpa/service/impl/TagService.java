package com.rogueai.janki.core.persistence.jpa.service.impl;

import org.springframework.stereotype.Service;

import com.rogueai.janki.core.persistence.jpa.dao.impl.NoteDao;
import com.rogueai.janki.core.persistence.jpa.service.IService;

/**
 * 
 * @author Massimo Zugno
 *
 */
@Service
public class TagService implements IService {

	private NoteDao noteDao;
	
}
