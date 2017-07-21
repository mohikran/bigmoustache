package com.gtm.dao;

import java.io.Serializable;
import java.util.ArrayList;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.gtm.domaine.Client;

@SuppressWarnings("serial")
@Named
@SessionScoped
public class ClientDao implements Serializable, IClientDao {

	public ClientDao() {

	}

	public boolean insert(Client client_) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("bigmoustache-pu");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();

		Client clientsaved = new Client(client_);
		tx.begin();

		em.persist(clientsaved);

		tx.commit();

		em.close();
		emf.close();

		return true;
	}

	public Client findById(int id) {
		Long idd = new Long(id);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("bigmoustache-pu");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();

		tx.begin();

		Client client = em.find(Client.class, idd);

		tx.commit();

		em.close();
		emf.close();

		return client;
	}

	@SuppressWarnings("unchecked")
	public ArrayList<Client> findAll() {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("bigmoustache-pu");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();

		tx.begin();

		ArrayList<Client> listeClient;
		Query query = em.createQuery("from Client");
		listeClient = (ArrayList<Client>) query.getResultList();

		tx.commit();

		em.close();
		emf.close();

		return listeClient;
	}

	public boolean delete(Client client) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("bigmoustache-pu");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();

		tx.begin();

		em.remove(client);

		tx.commit();

		em.close();
		emf.close();

		return true;
	}

	public Client update(Client input) {
		Client output = null;

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("bigmoustache-pu");
		EntityManager em = emf.createEntityManager();

		EntityTransaction tx = em.getTransaction();
		tx.begin();
		output = em.merge(input);
		tx.commit();

		em.close();
		emf.close();

		return output;
	}

	

}
