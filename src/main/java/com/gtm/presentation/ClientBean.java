package com.gtm.presentation;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.gtm.dao.IntClientCrudDao;
import com.gtm.domaine.Client;
import com.gtm.service.IntClientCrudService;

@Named
@SessionScoped
public class ClientBean implements Serializable {

	@Inject
	// IntClientCrudDao clientService;
	IntClientCrudService clientservice;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// Client domaine
	private Client client;

	private classetest ctest = new classetest();

	// Getter client
	public Client getClient() {
		return client;
	}

	// Setter client
	public void setClient(Client client) {
		this.client = client;
	}

	// Cree instanciation client
	public ClientBean() {
		client = new Client();
	}

	public List<Client> getListeClient() {
		System.out.println("Debut de la getListeClient");
		List<Client> ListeClient = null;
		ListeClient = clientservice.lireTous();
		return ListeClient;

	}

	public String addClient() {
		System.out.println("addClient bean");
		clientservice.sauverEnBase(client);
		return "liste";
	}

	public String removeClient() {
		System.out.println("RemoveClient bean");
		clientservice.supprimer(client.getIdClient());
		return "liste";
	}
	public String updateClient() {
		System.out.println("RemoveClient bean");
		clientservice.modifier(client);
		return "liste";
	}
	
	
}
