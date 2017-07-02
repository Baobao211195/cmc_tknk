package com.tkhq.cmc.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class BaseDAO<PK extends Serializable, T> {

	private final Class<T> persistentClass;

	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	public BaseDAO() {
		this.persistentClass = (Class<T>) ((ParameterizedType) this.getClass().getGenericSuperclass())
				.getActualTypeArguments()[1];
	}

	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	/**
	 * 
	 * @param key
	 *            find object by key
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public T getByKey(PK key) {
		return (T) getSession().get(persistentClass, key);
	}

	/**
	 * 
	 * @param entity
	 *            insert entity
	 */
	public void persist(T entity) {
		getSession().persist(entity);
	}

	/**
	 * 
	 * @param entity
	 *            update object
	 */
	public void update(T entity) {
		getSession().update(entity);
	}
	
	

	/**
	 * search by criteria
	 * 
	 * @return
	 */
	protected Criteria createCriteria() {
		return getSession().createCriteria(persistentClass);
	}
	
	@SuppressWarnings("unchecked")
	public List<T> fetchAll(){
		return getSession().createCriteria(persistentClass).list();
	}
	
	public void delete(T entity){
		getSession().delete(entity);
	}
	
	public int insertBatch(List<T> lstEntity) {
		try {
			Session session = sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			for (int i = 0; i < lstEntity.size(); i++) {
				session.save(lstEntity.get(i));
				if (i % 100 == 0) { // 100, same as the JDBC batch size
					// flush a batch of inserts and release memory:
					session.flush();
					session.clear();
				}
			}
			tx.commit();
			session.close();
			return 0;
		} catch (HibernateException ex) {
			return 1;
		}

	}
	
//	public void deleteList(HashMap<T,Object> s){
//		
//		List<String> newlist = new ArrayList<String>(Arrays.asList(((String) s).split(",")));
//		
//	}
}
