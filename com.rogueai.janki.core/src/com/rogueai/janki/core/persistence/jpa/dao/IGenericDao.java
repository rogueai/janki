package com.rogueai.janki.core.persistence.jpa.dao;

import java.io.Serializable;
import java.util.List;

/**
 * @author Massimo Zugno
 *
 * @param <T>
 * @param <ID>
 */
public interface IGenericDao<T, ID extends Serializable> {

	T findById(ID id, boolean lock);

	List<T> findAll();

	List<T> findByExample(T exampleInstance);

	T makePersistent(T entity);

	void makeTransient(T entity);
}