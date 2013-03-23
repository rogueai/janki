package com.rogueai.janki.core.persistence.jpa.dao.impl;

import java.util.List;

import com.rogueai.janki.core.persistence.jpa.dao.INoteDao;
import com.rogueai.janki.core.persistence.jpa.entity.Note;

/**
 * 
 * @author Massimo Zugno
 *
 */
public class NoteDao extends GenericDao<Note, Long> implements INoteDao {

	@Override
	public Note findById(Long id, boolean lock) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Note> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Note> findByExample(Note exampleInstance) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Note makePersistent(Note entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void makeTransient(Note entity) {
		// TODO Auto-generated method stub

	}

}
