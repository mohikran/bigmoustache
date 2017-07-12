package com.gtm.service;


import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.gtm.dao.IntClientCrudDao;

import com.gtm.domaine.Client;

@Named
@SessionScoped
public class ClientCrudService extends GenericCrudService<Client> implements Serializable, IntClientCrudService {
	
	@Inject
	private IntClientCrudDao clientDao;
	
	/* (non-Javadoc)
	 * @see com.gtm.service.IntClientCrudService#getDao()
	 */
	@Override
	public IntClientCrudDao getDao(){
		return clientDao;
	}
	
	/* (non-Javadoc)
	 * @see com.gtm.service.IntClientCrudService#LireByIdConseiller(long)
	 */
	public List<Client> LireByIdConseiller(long idConseiller){
		return clientDao.LireByIdConseiller(idConseiller);
	}

}
