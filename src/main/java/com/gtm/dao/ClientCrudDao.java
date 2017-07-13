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
/**
 * 
 * Classe redéfinissant les méthodes CRUD pour les objets de type Client dans la couche Dao. Elle hérite de GenericCrudDao.
 *
 */

@Named
@SessionScoped
public class ClientCrudDao extends GenericCrudDao<Client> implements IntClientCrudDao, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Reecriture de la methode getClazz() pour retourner la classe de Client
	 * (et pouvoir faire appel au méthode de Client dans le generique)
	 */
	@Override
	public Class<Client> getClazz() {
		return Client.class;
	}

	/**
	 * Reecriture de la methode sauverEnBase() definie dans GenericCrudDao pour
	 * pouvoir sauver plusieur client (clientsaved est un nouveau client sinon
	 * on ne peut sauvegarder qu'un client par session)
	 *
	 */

	@Override
	public boolean sauverEnBase(Client input) {

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

		return true;
	}

	/**
	 * Methode permettant de remonter toutes la liste des clients d'un conseiller
	 * @param L'id du conseiller dont on cherche les clients
	 * @return La liste de clients du conseiller
	 *
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
