package com.gtm.presentation;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.gtm.domaine.Barbier;
import com.gtm.service.IBarbierService;

@SuppressWarnings("serial")
@Named
@SessionScoped
public class BarbierBean implements Serializable {

	private Barbier barbier;
	@Inject
	private IBarbierService service;
	
	public BarbierBean() {
		
	}
	
	@PostConstruct
	public void init() {
		barbier = new Barbier();
	}
	
	public void creerBarbier() {
		service.ajouter(barbier);
	}

	public IBarbierService getService() {
		return service;
	}

	public void setService(IBarbierService service) {
		this.service = service;
	}

	public Barbier getBarbier() {
		return barbier;
	}

	public void setBarbier(Barbier barbier) {
		this.barbier = barbier;
	}
	
}
