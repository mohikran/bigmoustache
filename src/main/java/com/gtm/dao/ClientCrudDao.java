package com.gtm.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.gtm.domaine.Client;
import com.gtm.domaine.Conseiller;

@Named
@SessionScoped
public class ClientCrudDao extends GenericCrudDao<Client> implements IntClientCrudDao, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.gtm.dao.IntClientCrudDao#getClazz()
	 */
	@Override
	public Class<Client> getClazz() {
		return Client.class;
	}
	
	@Override
	public Client sauverEnBase(Client input) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("proxybanque-pu");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();

		Client clientsaved = new Client();
		clientsaved = input;
		tx.begin();
		

		em.persist(em.merge(clientsaved));

		tx.commit();

		em.close();
		emf.close();

		return input;
	}
	

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.gtm.dao.IntClientCrudDao#LireByIdConseiller(long)
	 */
	public List<Client> LireByIdConseiller(long idConseiller) {
		List<Client> maList = new ArrayList<Client>();

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("proxybanque-pu");
		EntityManager em = emf.createEntityManager();

		Query query = em.createNamedQuery("Client.LireByIdConseiller").setParameter(1, idConseiller);
		maList = query.getResultList();

		em.close();
		emf.close();
		return maList;
	}

}
