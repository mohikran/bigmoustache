package com.gtm.presentation;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.gtm.dao.IntClientCrudDao;
import com.gtm.domaine.Client;
import com.gtm.domaine.CompteCourant;
import com.gtm.domaine.CompteEpargne;
import com.gtm.service.IntClientCrudService;
import com.gtm.service.IntCompteCrudService;

/**
 * 
 * Classe du package presentation. Est un bean gerant les actions sur les
 * Clients depuis la partie web et appelant les classes metiers Ce bean a comme
 * parametre SessionScoped
 *
 */
@Named
@SessionScoped
public class ClientBean implements Serializable {

	private Boolean checkcourant = false;
	private Boolean checkepargne = false;
	private long soldeCourant;
	private long soldeEpargne;
	private CompteCourant compteCourant = null;
	private CompteEpargne compteEpargne = null;

	@Inject
	// IntClientCrudDao clientService;
	IntClientCrudService clientservice;
	private static final long serialVersionUID = 1L;

	@Inject
	IntCompteCrudService compteService;
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

	// Getters and setters boolean
	public boolean isCheckcourant() {
		return checkcourant;
	}
	// Getters and setters boolean

	public void setCheckcourant(boolean checkcourant) {
		this.checkcourant = checkcourant;
	}
	// Getters and setters boolean

	public boolean isCheckepargne() {
		return checkepargne;
	}
	// Getters and setters boolean

	public void setCheckepargne(boolean checkepargne) {
		this.checkepargne = checkepargne;
	}

	public long getSoldeCourant() {
		return soldeCourant;
	}

	public void setSoldeCourant(long soldeCourant) {
		this.soldeCourant = soldeCourant;
	}

	public long getSoldeEpargne() {
		return soldeEpargne;
	}

	public void setSoldeEpargne(long soldeEpargne) {
		this.soldeEpargne = soldeEpargne;
	}

	/**
	 * Permet d'instancier un client en appelant la classe Client du domaine
	 */

	public ClientBean() {
		client = new Client();
	}

	/**
	 * Methode getListeClient servant a obtenir la liste de tous les clients en
	 * appelant la couche Service. Cette methode n'a pas de parametre
	 * 
	 * @return la liste de Clients qui lui a ete retourne par la couche service
	 */
	public List<Client> getListeClient() {
		List<Client> ListeClient = null;
		ListeClient = clientservice.lireTous();
		return ListeClient;

	}

	/**
	 * Methode addClient servant a ajouter un client dans la base de donnee en
	 * appelant la couche service Cette methode n'a pas de parametre mais renvoie un client dans la couche service
	 * couche service
	 * 
	 * @return Un String renvoyant sur la page d'affichage de la liste des
	 *         clients : listeclient.xhtml
	 */
	public String addClient() {

		if (checkcourant == true) {
			compteCourant = new CompteCourant(soldeCourant);
		} else {
			compteCourant = null;
		}
		if (checkepargne == true) {
			compteEpargne = new CompteEpargne(soldeEpargne);
		} else {
			compteEpargne = null;
		}

		Client clientsaved = new Client(client.getNom(), client.getPrenom(), client.getAdresse(), client.getEmail(),
				compteCourant, compteEpargne, client.getIdConseiller());

		clientservice.sauverEnBase(clientsaved);

		return "listeclient";
	}

	/**
	 * Methode removeClient servant a supprimer un client dans la base de donnee
	 * en appelant la couche service Cette methode n'a pas de parametre, mais
	 * utilise les informations d'un Client en session, qui est envoyé dans la
	 * couche service
	 * 
	 * @return Un String renvoyant sur la page d'affichage de la liste des
	 *         clients : listeclient.xhtml
	 */

	public String removeClient() {
		System.out.println("RemoveClient bean");

		clientservice.supprimer(client.getIdClient());
		return "listeclient";
	}

	/**
	 * 
	 * @return Un String renvoyant sur la page d'affichage de la liste des
	 *         clients : listeclient.xhtml
	 */
	public String updateClient() {

		if (checkcourant == true) {
			compteService.supprimer(client.getCompteCourant().getIdCompte());
			compteCourant = null;
			Client clientsaved = new Client(client.getIdClient(), client.getNom(), client.getPrenom(),
					client.getAdresse(), client.getEmail(), compteCourant, compteEpargne, client.getIdConseiller());
			clientservice.modifier(clientsaved);

		} else if (checkepargne == true) {
			compteService.supprimer(client.getCompteEpargne().getIdCompte());

			compteCourant = client.getCompteCourant();
			compteEpargne = null;
			Client clientsaved = new Client(client.getIdClient(), client.getNom(), client.getPrenom(),
					client.getAdresse(), client.getEmail(), compteCourant, compteEpargne, client.getIdConseiller());
			clientservice.modifier(clientsaved);

		}

		else {
			clientservice.modifier(client);
		}

		return "listeclient";
	}

}
