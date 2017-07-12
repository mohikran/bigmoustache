package com.gtm.domaine;

import java.util.ArrayList;
import java.util.List;

public class Gerant extends Conseiller {
	
	private List<Conseiller> listConseiller = new ArrayList<Conseiller>();

	public Gerant(String nom, String prenom, String password, String login, ArrayList<Client> listeClients,
			List<Conseiller> listConseiller) {
		super(nom, prenom, password, login, listeClients);
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
