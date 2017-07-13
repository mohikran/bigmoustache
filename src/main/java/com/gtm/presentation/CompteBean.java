package com.gtm.presentation;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.gtm.domaine.Client;
import com.gtm.domaine.Compte;
import com.gtm.service.IntClientCrudService;
import com.gtm.service.IntCompteCrudService;

@Named
@SessionScoped
public class CompteBean implements Serializable {

	private Compte compte;
	@Inject
	IntCompteCrudService compteservice;

	//Getter Compte
	public Compte getCompte() {
		return compte;
	}

	// Setter Compte
	public void Compte(Compte compte) {
		this.compte = compte;
	}
	
	public CompteBean() {
		compte = new Compte();
	}

	
	public List<Compte> getListeCompte() {
		List<Compte> listeCompte = null;
		listeCompte = compteservice.lireTous();
		return listeCompte;

	}
	
}
