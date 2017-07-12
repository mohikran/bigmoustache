package com.gtm.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;


import com.gtm.dao.IntGenericCrudDao;

public abstract class GenericCrudService<T> implements IntGenericCrudService<T> {
	
/* (non-Javadoc)
 * @see com.gtm.service.IntGenericCrudService#getDao()
 */
public abstract IntGenericCrudDao<T> getDao();
	

	/* (non-Javadoc)
	 * @see com.gtm.service.IntGenericCrudService#sauverEnBase(T)
	 */
	public T sauverEnBase(T input){
		getDao().sauverEnBase(input);
		return input;
	}

	/* (non-Javadoc)
	 * @see com.gtm.service.IntGenericCrudService#lireById(int)
	 */
	public T lireById(int id){
		T t = getDao().lireById(id);
		return t ;
	}
	

	/* (non-Javadoc)
	 * @see com.gtm.service.IntGenericCrudService#lireTous()
	 */
	public List<T> lireTous(){
		return getDao().lireTous();
	}

	/* (non-Javadoc)
	 * @see com.gtm.service.IntGenericCrudService#modifier(T)
	 */
	public T modifier(T input){
		getDao().modifier(input);
		return input;
	}
	

	/* (non-Javadoc)
	 * @see com.gtm.service.IntGenericCrudService#supprimer(int)
	 */
	public void supprimer(int id){
		getDao().supprimer(id);
	}
}

