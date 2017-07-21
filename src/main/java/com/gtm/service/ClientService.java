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

	public Client ajouter(Client client) {
		System.out.println("Affichage client service" + client);

		return clientDao.insert(client);
	}

	public void supprimer(Client client) {
		clientDao.delete(client);
	}

	public Client update(Client client) {
		return clientDao.update(client);
	}
	
}
