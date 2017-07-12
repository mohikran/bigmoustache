package com.gtm.presentation;

import java.io.Serializable;
import java.util.List;

import com.gtm.domaine.Client;

public class ClientBean implements Serializable {

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

	// Crée instanciation client
	public ClientBean() {
		client = new Client();
	}

	public List<Client> getListeClient() {
		System.out.println("Debut de la getListeClient");
		List<Client> ListeClient = ctest.clientList(); // Pas encore de service
		return ListeClient;

	}

	public void addClient() {
		System.out.println("addClient bean");
		// APPEL DU SERVICE en utilisant client en parametre
	}

	public void removeClient() {
		System.out.println("RemoveClient bean");
		// APPEL DU SERVICE en utilisant client en parametre
	}
}
