package com.gtm.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;


import com.gtm.dao.IntGenericCrudDao;
/**
 * 
 * 
 * Implementation  de l'interface IntGenericCrudService pour les objets de type Client
 * @param <T> T pour Objet generique, en pratique les objets utilises seront  de Type Compte, Client ou Conseiller
 *
 */
public abstract class GenericCrudService<T> implements IntGenericCrudService<T> {
	
/* (non-Javadoc)
 * @see com.gtm.service.IntGenericCrudService#getDao()
 */
public abstract IntGenericCrudDao<T> getDao();
	

	/* (non-Javadoc)
	 * @see com.gtm.service.IntGenericCrudService#sauverEnBase(T)
	 */

	public boolean sauverEnBase(T input){
		getDao().sauverEnBase(input);
		return true;
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
	public boolean modifier(T input){
		getDao().modifier(input);
		return true;
	}
	

	/* (non-Javadoc)
	 * @see com.gtm.service.IntGenericCrudService#supprimer(int)
	 */
	public boolean supprimer(int id){
		getDao().supprimer(id);
		return true;
	}
}

