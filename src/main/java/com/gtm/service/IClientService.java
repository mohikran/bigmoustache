package com.gtm.service;

import java.util.ArrayList;

import com.gtm.domaine.Client;

public interface IClientService {

	ArrayList<Client> getListe();

	Client getById(int id);

	void ajouter(Client client);

	void supprimer(Client client);

}