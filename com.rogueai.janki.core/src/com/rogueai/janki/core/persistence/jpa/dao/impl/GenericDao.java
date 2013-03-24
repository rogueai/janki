package com.rogueai.janki.core.persistence.jpa.dao.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.LockModeType;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Example;

import com.rogueai.janki.core.persistence.jpa.dao.IGenericDao;

/**
 * 
 * @author Massimo Zugno
 * 
 */
public abstract class GenericDao<T, ID extends Serializable> implements IGenericDao<T, ID> {

	private Class<T> _persistentClass;
	private EntityManager _entityManager;

	@SuppressWarnings("unchecked")
	public GenericDao() {
		this._persistentClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}

	public void setEntityManager(EntityManager entityManager) {
		this._entityManager = entityManager;
	}

	protected EntityManager getEntityManager() {
		if (_entityManager == null)
			throw new IllegalStateException("EntityManager has not been set on DAO before usage");
		return _entityManager;
	}

	public Class<T> getPersistentClass() {
		return _persistentClass;
	}

	public T findById(ID id, boolean lock) {
		T entity;
		if (lock)
			entity = (T) getEntityManager().find(getPersistentClass(), id, LockModeType.PESSIMISTIC_WRITE);
		else
			entity = (T) getEntityManager().find(getPersistentClass(), id);

		return entity;
	}

	public List<T> findAll() {
		return findByCriteria();
	}

	// TODO: methods below are not very generic: they still rely on hibernate
	// specific Criteria API, we should find a similar way to do it in pure
	// JPA CriteriaQuery

	@SuppressWarnings("unchecked")
	public List<T> findByExample(T exampleInstance, String[] excludeProperty) {
		Session session = (Session) getEntityManager().getDelegate();
		Criteria crit = session.createCriteria(getPersistentClass());
		Example example = Example.create(exampleInstance);
		for (String exclude : excludeProperty) {
			example.excludeProperty(exclude);
		}
		crit.add(example);
		return crit.list();
	}

	@SuppressWarnings("unchecked")
	protected List<T> findByCriteria(Criterion... criterion) {
		Session session = (Session) getEntityManager().getDelegate();
		Criteria crit = session.createCriteria(getPersistentClass());
		for (Criterion c : criterion) {
			crit.add(c);
		}
		return crit.list();
	}

	public T makePersistent(T entity) {
		getEntityManager().merge(entity);
		return entity;
	}

	public void makeTransient(T entity) {
		getEntityManager().remove(entity);
	}

	public void flush() {
		getEntityManager().flush();
	}

	public void clear() {
		getEntityManager().clear();
	}

}