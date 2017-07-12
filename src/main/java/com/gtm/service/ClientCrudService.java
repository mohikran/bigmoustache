package com.gtm.service;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

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
	
	public List<Client> LireByIdConseiller(long idConseiller){
		return clientDao.LireByIdConseiller(idConseiller);
		}

}
