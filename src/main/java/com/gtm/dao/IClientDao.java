package com.gtm.dao;

import java.util.ArrayList;

import com.gtm.domaine.Client;

public interface IClientDao {

	boolean insert(Client client_);

	Client findById(int id);

	ArrayList<Client> findAll();

	boolean delete(Client client);
	
	Client update(Client input);

}