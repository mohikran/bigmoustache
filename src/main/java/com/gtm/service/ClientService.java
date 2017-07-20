package com.gtm.service;

import java.io.Serializable;
import java.util.ArrayList;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.gtm.dao.IClientDao;
import com.gtm.domaine.Client;

@SuppressWarnings("serial")
@Named
@SessionScoped
public class ClientService implements Serializable, IClientService {

	@Inject
	private IClientDao clientDao;
	
	public ClientService() {
		
	}
	
	public ArrayList<Client> getListe() {
		return clientDao.findAll();
	}

	public Client getById(int id) {
		return clientDao.findById(id);
	}

	public void ajouter(Client client) {
		clientDao.insert(client);
	}

	public void supprimer(Client client) {
		clientDao.delete(client);
	}
	
}
