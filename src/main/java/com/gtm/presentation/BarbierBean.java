package com.gtm.presentation;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.gtm.dao.IBarbierDao;
import com.gtm.domaine.Barbier;
import com.gtm.domaine.Horaire;
import com.gtm.service.BarbierService;
import com.gtm.service.IBarbierService;

@SuppressWarnings("serial")
@Named
@SessionScoped
public class BarbierBean implements Serializable {

	private Barbier barbier;
	@Inject
	private IBarbierService service;
	private String horaireRdv;

	public BarbierBean() {

	}

	@PostConstruct
	public void init() {
		barbier = new Barbier();
	}

	public void creerBarbier() {
		service.ajouter(barbier);
	}

	public String validerRdv() {
		int id = barbier.getId().intValue();
		this.barbier = null;
		Horaire horaireTemp = null;
		Barbier barbier = service.getById(id);
		for (Horaire horaire : barbier.getHoraireDisponible()) {
			if (horaire.getHoraire().equals(horaireRdv)) {
				horaireTemp = horaire;
				
			}
		}
		barbier.getHoraireDisponible().remove(horaireTemp);

		service.miseAJour(barbier);

		return "paiement";
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

	public List<String> getListeHoraire() {
		int id = barbier.getId().intValue();
		List<Horaire> listeHoraire = (List<Horaire>) service.getById(id).getHoraireDisponible();
		List<String> listeString = new ArrayList<String>();
		for (Horaire horaire : listeHoraire) {
			listeString.add(horaire.getHoraire());
		}
		Collections.sort(listeString);
		return listeString;
	}

	public List<Barbier> getListeBarbier() {
		List<Barbier> listeBarbiers = new ArrayList<Barbier>();
		listeBarbiers = service.getListe();
		return listeBarbiers;

	}

	public String getHoraireRdv() {
		return horaireRdv;
	}

	public void setHoraireRdv(String horaireRdv) {
		this.horaireRdv = horaireRdv;
	}

	public String selectionBarbier() {
		this.barbier=barbier;
		return "listeService";
	}
}
