package com.gtm.domaine;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

public class Gerant extends Conseiller {
	
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private List<Conseiller> listConseiller = new ArrayList<Conseiller>();

	public Gerant(String nom, String prenom, String password, String login,
			List<Conseiller> listConseiller) {
		super(nom, prenom, password, login);
		this.listConseiller = listConseiller;
	}

	public Gerant() {
		super();
	}

	public List<Conseiller> getListConseiller() {
		return listConseiller;
	}

	public void setListConseiller(List<Conseiller> listConseiller) {
		this.listConseiller = listConseiller;
	}
	
	
	
	
	
	

}
