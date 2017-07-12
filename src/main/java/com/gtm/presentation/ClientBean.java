package com.gtm.presentation;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.gtm.dao.IntClientCrudDao;
import com.gtm.domaine.Client;
import com.gtm.service.IntClientCrudService;

/**
 * 
 * Classe du package presentation. Est un bean gerant les actions sur les
 * Clients depuis la partie web et appelant les classes metiers
 * Ce bean a comme parametre SessionScoped
 *
 */
@Named
@SessionScoped
public class ClientBean implements Serializable {

	@Inject
	// IntClientCrudDao clientService;
	IntClientCrudService clientservice;
	private static final long serialVersionUID = 1L;

	// Client domaine
	private Client client;


	// Getter client
	public Client getClient() {
		return client;
	}

	// Setter client
	public void setClient(Client client) {
		this.client = client;
	}
/**
 * Permet d'instancier un client en appelant la classe Client du domaine
 */
	
	public ClientBean() {
		client = new Client();
	}
/**
 * Methode getListeClient servant a obtenir la liste de tous les clients en appelant la couche Service.
 * Cette methode n'a pas de parametre
 * @return la liste de Clients qui lui a ete retourne par la couche service
 */
	public List<Client> getListeClient() {
		List<Client> ListeClient = null;
		ListeClient = clientservice.lireTous();
		return ListeClient;

	}
/**
 * Methode addClient servant a ajouter un client dans la base de donnee en appelant la couche service
 * Cette methode n'a pas de parametre, mais utilise les informations d'un Client en session, qui est envoyé dans la couche service
 * @return Un String renvoyant sur la page d'affichage de la liste des clients : listeclient.xhtml
 */
	public String addClient() {
		System.out.println("addClient bean");
		clientservice.sauverEnBase(client);
		return "listeclient";
	}

	/**
	 * Methode removeClient servant a supprimer un client dans la base de donnee en appelant la couche service
	 * Cette methode n'a pas de parametre, mais utilise les informations d'un Client en session, qui est envoyé dans la couche service
	 * @return Un String renvoyant sur la page d'affichage de la liste des clients : listeclient.xhtml
	 */
	
	public String removeClient() {
		System.out.println("RemoveClient bean");
		clientservice.supprimer(client.getIdClient());
		return "listeclient";
	}
/**
 * 
 * @return Un String renvoyant sur la page d'affichage de la liste des clients : listeclient.xhtml
 */
	public String updateClient() {
		System.out.println("RemoveClient bean");
		clientservice.modifier(client);
		return "listeclient";
	}

}
