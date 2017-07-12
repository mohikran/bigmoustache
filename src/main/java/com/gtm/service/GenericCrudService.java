package com.gtm.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;


import com.gtm.dao.IntGenericCrudDao;

public abstract class GenericCrudService<T> {
	
public abstract IntGenericCrudDao<T> getDao();
	

	public T sauverEnBase(T input){
		getDao().sauverEnBase(input);
		return input;
	}

	public T lireById(int id){
		T t = getDao().lireById(id);
		return t ;
	}
	

	public List<T> lireTous(){
		return getDao().lireTous();
	}

	public T modifier(T input){
		getDao().modifier(input);
		return input;
	}
	

	public void supprimer(int id){
		getDao().supprimer(id);
	}
}

