package com.gtm.dao;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.gtm.domaine.Conseiller;
/**
 * 
 * Classe redéfinissant les méthodes CRUD pour les objets de type Conseiller dans la couche Dao. Elle hérite de GenericCrudDao.
 *
 */
@Named
@SessionScoped
public class ConseillerCrudDao extends GenericCrudDao<Conseiller> implements Serializable, IntConseillerCrudDao {

	/**
	 * Reecriture de la fonction getClazz() pour retourner la classe de
	 * Conseiller (et pouvoir faire appel au méthode de Conseiller dans le
	 * generique)
	 */
	@Override
	public Class<Conseiller> getClazz() {
		return Conseiller.class;
	}

	/**
	 * Reecriture de la methode sauverEnBase() definie dans GenericCrudDao pour
	 * pouvoir sauver plusieurs conseillers (conseillersaved est un nouveau
	 * conseiller sinon on ne peut sauvegarder qu'un conseiller par session)
	 *
	 */
	@Override
	public boolean sauverEnBase(Conseiller input) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("proxybanque-pu");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();

		Conseiller conseillersaved = new Conseiller();
		conseillersaved = input;
		tx.begin();

		em.persist(em.merge(conseillersaved));

		tx.commit();

		em.close();
		emf.close();

		return true;
	}
}
