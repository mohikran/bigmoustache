package com.gtm.presentation;

import java.io.Serializable;
import java.util.List;

import com.gtm.domaine.Client;
import com.gtm.domaine.Conseiller;

public class ConseillerBean implements Serializable{

	private Conseiller conseiller;
	
	public Conseiller getConseiller() {
		return conseiller;
	}

	// Setter client
	public void setConseiller(Conseiller client) {
		this.conseiller = conseiller;
	}

	// Crée instanciation client
	public void ConseillerBeans() {
		conseiller = new Conseiller();
	}

	public List<Conseiller> getListeConseiller() {
		System.out.println("Debut de la getListeClient");
		List<Conseiller> listeConseiller = null; // Pas encore de service
		return listeConseiller;

	}

	public void addConseiller() {
		System.out.println("addConseiller bean");
		// APPEL DU SERVICE en utilisant Conseiller en parametre
	}

	public void removeConseiller() {
		System.out.println("RemoveConseiller bean");
		// APPEL DU SERVICE en utilisant Conseiller en parametre
	}
	
}
