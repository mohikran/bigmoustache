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
	/**
	 * 
	 * Classe redéfinissant les méthodes CRUD pour les objets de type Client dans la couche Dao. Elle hérite de GenericCrudService.
	 *
	 */
	@Inject
	private IntClientCrudDao clientDao;
	
	/**
	 * Reecriture de la methode getDao() pour retourner la classe ClientCrudDao
	 * (et pouvoir faire appel aux méthodes)
	 */
	@Override
	public IntClientCrudDao getDao(){
		return clientDao;
	}
	
	/**
	 * Methode permettant de remonter toutes la liste des clients d'un conseiller
	 * @param L'id du conseiller dont on cherche les clients
	 * @return La liste de clients du conseiller
	 *
	 */
	public List<Client> LireByIdConseiller(long idConseiller){
		return clientDao.LireByIdConseiller(idConseiller);
	}

}
