package com.gtm.presentation;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.gtm.domaine.Client;
import com.gtm.domaine.Conseiller;
import com.gtm.service.IntClientCrudService;
import com.gtm.service.IntConseillerCrudService;
@Named
@SessionScoped
public class ConseillerBean implements Serializable{

	
	@Inject
	IntConseillerCrudService conseillerService;

	
	private Conseiller conseiller;
	
	public Conseiller getConseiller() {
		return conseiller;
	}

	// Setter conseiller
	public void setConseiller(Conseiller conseiller) {
		this.conseiller = conseiller;
	}

	// Crée instanciation conseiller
	public ConseillerBean() {
		conseiller = new Conseiller();
	}

	public List<Conseiller> getListeConseiller() {
		System.out.println("Debut de la getListeClient");
		List<Conseiller> listeConseiller = conseillerService.lireTous(); // Pas encore de service
		return listeConseiller;

	}

	public String addConseiller() {
		System.out.println("addConseiller bean");
		conseillerService.sauverEnBase(conseiller);
		return "listeconseiller";
	}

	public void removeConseiller() {
		System.out.println("RemoveConseiller bean");
		conseillerService.supprimer(conseiller.getIdConseiller());
	}
	
}
