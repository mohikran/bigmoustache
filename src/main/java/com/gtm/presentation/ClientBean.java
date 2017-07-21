package com.gtm.presentation;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.gtm.domaine.Client;
import com.gtm.service.IClientService;

@SuppressWarnings("serial")
@Named
@SessionScoped
public class ClientBean implements Serializable {

	private Client client;
	@Inject
	private IClientService service;

	public ClientBean() {
		// client = new Client ();
		System.out.println("\n\n BLABLA \n\n");
	}

	@PostConstruct
	public void init() {
		client = new Client();
	}

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

}
