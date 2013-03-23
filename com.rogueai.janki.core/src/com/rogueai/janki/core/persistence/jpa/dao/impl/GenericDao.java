package com.rogueai.janki.core.persistence.jpa.dao.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.LockOptions;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
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
	private SessionFactory _entityManager;

	@SuppressWarnings("unchecked")
	public GenericDao() {
		this._persistentClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}

	public void setEntityManager(SessionFactory entityManager) {
		this._entityManager = entityManager;
	}

	protected SessionFactory getEntityManager() {
		if (_entityManager == null)
			throw new IllegalStateException("EntityManager has not been set on DAO before usage");
		return _entityManager;
	}

	public Class<T> getPersistentClass() {
		return _persistentClass;
	}

	@SuppressWarnings("unchecked")
	public T findById(ID id, boolean lock) {
		T entity;
		if (lock)
			entity = (T) getEntityManager().getCurrentSession().load(getPersistentClass(), id, LockOptions.UPGRADE);
		else
			entity = (T) getEntityManager().getCurrentSession().load(getPersistentClass(), id);

		return entity;
	}

	public List<T> findAll() {
		return findByCriteria();
	}

	@SuppressWarnings("unchecked")
	public List<T> findByExample(T exampleInstance, String[] excludeProperty) {
		Session session = getEntityManager().getCurrentSession();
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
		Session session = getEntityManager().getCurrentSession();
		Criteria crit = session.createCriteria(getPersistentClass());
		for (Criterion c : criterion) {
			crit.add(c);
		}
		return crit.list();
	}

	public T makePersistent(T entity) {
		getEntityManager().getCurrentSession().saveOrUpdate(entity);
		return entity;
	}

	public void makeTransient(T entity) {
		getEntityManager().getCurrentSession().delete(entity);
	}

	public void flush() {
		getEntityManager().getCurrentSession().flush();
	}

	public void clear() {
		getEntityManager().getCurrentSession().clear();
	}

}