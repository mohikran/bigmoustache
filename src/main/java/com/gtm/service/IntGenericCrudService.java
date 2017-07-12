package com.gtm.service;

import java.util.List;

import com.gtm.dao.IntGenericCrudDao;

public interface IntGenericCrudService<T> {

	IntGenericCrudDao<T> getDao();

	T sauverEnBase(T input);

	T lireById(int id);

	List<T> lireTous();

	T modifier(T input);

	void supprimer(int id);

}