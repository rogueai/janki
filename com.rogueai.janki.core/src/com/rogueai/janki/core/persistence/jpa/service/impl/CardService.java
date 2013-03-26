package com.rogueai.janki.core.persistence.jpa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rogueai.janki.core.persistence.jpa.dao.impl.CardDao;
import com.rogueai.janki.core.persistence.jpa.entity.Card;
import com.rogueai.janki.core.persistence.jpa.service.IService;

/**
 * 
 * @author Massimo Zugno
 *
 */
@Service
public class CardService implements IService {

	@Autowired
	protected CardDao cardDao;
	
	@Transactional
	public List<Card> findAllCards(){
		return cardDao.findAll();
	}

}
