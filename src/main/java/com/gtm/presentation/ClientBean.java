package com.gtm.presentation;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.gtm.domaine.Client;
import com.gtm.service.ClientService;
import com.gtm.service.IClientService;

@Named
@SessionScoped
public class ClientBean implements Serializable {

	@Inject
	private IClientService service;
	private Client client;

//	@PostConstruct
//	public void init() {
//		client = new Client();
//	}

	public void creerClient() {
		System.out.println("Affichage client bean" + client);
		service.ajouter(client);
	}

	public IClientService getService() {
		return service;
	}

	public void setService(IClientService service) {
		this.service = service;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	public ClientBean(){
		client = new Client ();
	}
}

