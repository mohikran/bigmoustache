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
	
	/* (non-Javadoc)
	 * @see com.gtm.service.IntCompteCrudService#getDao()
	 */
	@Override
	public IntCompteCrudDao getDao(){
		return compteDao;
	}
}
