package com.gtm.dao;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.gtm.domaine.Conseiller;

@Named
@SessionScoped
public class ConseillerCrudDao extends GenericCrudDao<Conseiller> implements Serializable, IntConseillerCrudDao {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.gtm.dao.IntConseillerCrudDao#getClazz()
	 */
	@Override
	public Class<Conseiller> getClazz() {
		return Conseiller.class;
	}

	@Override
	public Conseiller sauverEnBase(Conseiller input) {

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

		return input;
	}
}
