package com.gtm.service;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.gtm.dao.IntCompteCrudDao;
import com.gtm.domaine.Compte;

@Named
@SessionScoped
public class CompteCrudService extends GenericCrudService<Compte> implements Serializable, IntCompteCrudService {
	
	@Inject
	private IntCompteCrudDao compteDao;
	
	/**
	 * Reecriture de la methode getDao() pour retourner la classe CompteCrudDao
	 * (et pouvoir faire appel aux méthodes)
	 */
	@Override
	public IntCompteCrudDao getDao(){
		return compteDao;
	}
}
