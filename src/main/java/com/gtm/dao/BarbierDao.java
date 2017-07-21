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

import com.gtm.domaine.Barbier;
import com.gtm.domaine.Horaire;


@SuppressWarnings("serial")
@Named
@SessionScoped
public class BarbierDao implements Serializable, IBarbierDao{

	public BarbierDao() {
		
	}
	
	public boolean insert(Barbier barbier_) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("bigmoustache-pu");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();

		Barbier barbiersaved = new Barbier(barbier_);
		tx.begin();
		
		Horaire horaire1 = new Horaire("8h00");
		Horaire horaire2 = new Horaire("9h00");
		Horaire horaire3 = new Horaire("10h00");
		Horaire horaire4 = new Horaire("11h00");
		
		barbiersaved.initialiserHoraire();
		barbiersaved.ajouterHoraire(horaire1);
		barbiersaved.ajouterHoraire(horaire2);
		barbiersaved.ajouterHoraire(horaire3);
		barbiersaved.ajouterHoraire(horaire4);
		
		em.persist(horaire1);
		em.persist(horaire2);
		em.persist(horaire3);
		em.persist(horaire4);
		em.persist(barbiersaved);

		tx.commit();

		em.close();
		emf.close();

		return true;
	}

	public Barbier findById(int id) {
		Long idd = new Long(id); 
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("bigmoustache-pu");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		
		tx.begin();
		
		Barbier barbier = em.find(Barbier.class, idd);
		
		tx.commit();
		
		em.close();
		emf.close();
		
		return barbier;		
	}
	
	@SuppressWarnings("unchecked")
	public ArrayList<Barbier> findAll() {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("bigmoustache-pu");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		
		tx.begin();
		
		ArrayList<Barbier> listeBarbier;
		Query query = em.createQuery("from Barbier");
		listeBarbier = (ArrayList<Barbier>) query.getResultList();
		
		tx.commit();
		
		em.close();
		emf.close();
		
		return listeBarbier;
	}
	
	public boolean delete(Barbier barbier) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("bigmoustache-pu");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		
		tx.begin();
		
		em.remove(barbier);
		
		tx.commit();
		
		em.close();
		emf.close();
		
		return true;
	}
}
