package com.gtm.service;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.gtm.dao.IntConseillerCrudDao;
import com.gtm.domaine.Conseiller;

@Named
@SessionScoped
public class ConseillerCrudService extends GenericCrudService<Conseiller> implements Serializable, IntConseillerCrudService{
	
	@Inject
	private IntConseillerCrudDao conseillerDao;
	
	/* (non-Javadoc)
	 * @see com.gtm.service.IntConseillerCrudService#getDao()
	 */
	@Override
	public IntConseillerCrudDao getDao(){
		return conseillerDao;
	}

}
