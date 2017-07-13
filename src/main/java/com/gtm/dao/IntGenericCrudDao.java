package com.gtm.dao;

import java.util.List;

public interface IntGenericCrudDao<T> {

	boolean sauverEnBase(T input);

	T lireById(int id);

	List<T> lireTous();

	boolean modifier(T input);

	boolean supprimer(int id);

}