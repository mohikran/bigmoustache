package com.gtm.presentation;

import java.util.ArrayList;
import java.util.List;

import com.gtm.domaine.Client;
import com.gtm.domaine.CompteCourant;
import com.gtm.domaine.CompteEpargne;


public class classetest {

	public List<Client> clientList() {
		System.out.println("Debut personnelist Service");
//String nom, String prenom, String adresse, String email, CompteCourant compteCourant,
		//CompteEpargne compteEpargne, long idConseiller
		ArrayList<Client> listeClient = new ArrayList<Client>();
		Client client1 = new Client("Alexandre","Piccini","Lyon","mail@moi",null,null, 47);
		Client client2 = new Client("Jean","Michel","Lyon","mail@moi",null,null, 47);
		Client client3 = new Client("Charles","Edouard","Lyon","mail@moi",null,null, 47);


		listeClient.add(client1);
		listeClient.add(client2);
		listeClient.add(client3);
		System.out.println("Fin methodeService" + listeClient);


		return listeClient;

	}
	
	
}
