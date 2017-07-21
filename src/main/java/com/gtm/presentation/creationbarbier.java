package com.gtm.presentation;

import javax.inject.Inject;

import com.gtm.domaine.Barbier;
import com.gtm.service.BarbierService;

public class creationbarbier {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	

	final Barbier barbier, barbier2, barbier3;
//	barbier = new Barbier();
//	barbier2 = new Barbier();
	barbier3 = new Barbier();
//
//	
//	barbier.setNom("Jean");
//	barbier.setPrenom("Dindon");
//	barbier.setPhoto("dindon");
//	barbier.setNumero("56895");
//	
//	
//	barbier2.setNom("Hubert");
//	barbier2.setPrenom("Romuald");
//	barbier2.setPhoto("mouton");
//	barbier2.setNumero("12345");
	
	barbier3.setNom("Smith");
	barbier3.setPrenom("John");
	barbier3.setPhoto("anglais");
	barbier3.setNumero("0607080905");
	
	
	BarbierService barbserv= new BarbierService();
	
	
	barbserv.ajouter(barbier3);
	//barbserv.ajouter(barbier2);
	
	

	}
}
