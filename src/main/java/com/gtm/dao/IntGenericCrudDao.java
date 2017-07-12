package com.gtm.dao;

import java.util.List;

public interface IntGenericCrudDao<T> {

	T sauverEnBase(T input);

	T lireById(int id);

	List<T> lireTous();

	T modifier(T input);

	void supprimer(int id);

}