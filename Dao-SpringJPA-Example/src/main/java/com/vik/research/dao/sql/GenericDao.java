package com.vik.research.dao.sql;


public interface GenericDao<T> {
	/**
	 * Method that returns the number of entries from a table that meet some
	 * criteria (where clause params)
	 * 
	 * @param params
	 *            sql parameters
	 * @return the number of records meeting the criteria
	 */
	T create(T t);

	void delete(Object id);

	T find(Object id);

	T update(T t);
}