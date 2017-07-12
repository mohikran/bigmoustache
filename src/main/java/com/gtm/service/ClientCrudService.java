package com.gtm.service;

import javax.inject.Inject;

import com.gtm.dao.ClientCrudDao;
import com.gtm.dao.IntClientCrudDao;
import com.gtm.dao.IntGenericCrudDao;
import com.gtm.domaine.Client;


public class ClientCrudService extends GenericCrudService<Client> {
	
	@Inject
	private ClientCrudDao clientDao;
	
	@Override
	public ClientCrudDao getDao(){
		return clientDao;
	}

}
