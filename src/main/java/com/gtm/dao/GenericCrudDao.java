package com.gtm.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
/**
 * 
 * 
 * Implementation  de l'interface IntGenericCrudDoa pour les objets de type T
 * @param <T> T pour Objet generique, en pratique les objets utilises seront  de Type Compte, Client ou Conseiller
 *
 */
public abstract class GenericCrudDao<T> implements IntGenericCrudDao<T> {
	/**
	 * Signature de la méthode permettant d'identifier la classe de T et d'utiliser ses méthodes.
	 * @return la classe de T
	 */
	abstract Class<T> getClazz();
	
	/**
	 * Sauvegarde dans la base de donnee l'objet en parametre
	 * @param input objet que l on souhaite inserer dans la BDD
	 * @return un booleen pour le test de la fonction
	 */
	public boolean sauverEnBase(T input){
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("proxybanque-pu");
		EntityManager em = emf.createEntityManager();

		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		em.persist(input);
		
		tx.commit();
		
		em.close();
		emf.close();
		
		return true;
	}
	
	/**
	 * Cherche un objet dans une base de donnee a partir de son Id
	 * @param id clef primaire de l objet que l on souhaite trouver
	 * @return l'objet T chercher
	 */
	public T lireById(int id){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("proxybanque-pu");
		EntityManager em = emf.createEntityManager();
		
		
		T t = em.find(getClazz(), id);
	
		
		em.close();
		emf.close();
		
		return t ;
	}
	
	/**
	 * Cherche une liste d'objets sans filtre
	 * @return retourne la liste d'objets
	 */
	public List<T> lireTous(){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("proxybanque-pu");
		EntityManager em = emf.createEntityManager();
			
		
		CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
		cq.select(cq.from(getClazz()));
		List<T> maList 	= em.createQuery(cq).getResultList();
		
		
		em.close();
		emf.close();
		
		return maList;
	}
	
	/**
	 * modifie l'objet dans la database
	 * @param input objet que l on souhaite inserer dans la BDD
	 * @return un booleen pour le test de la fonction
	 */
	public boolean modifier(T input){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("proxybanque-pu");
		EntityManager em = emf.createEntityManager();
			
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		em.merge(input);
		
		tx.commit();
		
		em.close();
		emf.close();
		
		return true;
	}
	
	/**
	 * supprime l'objet dans la database
	 * 
	 * @param input
	 *            objet que l on souhaite inserer dans la BDD
	 * @return un booleen pour le test de la fonction
	 */
	public boolean supprimer(int id){
		 EntityManagerFactory emf = Persistence.createEntityManagerFactory("proxybanque-pu");
		 EntityManager em = emf.createEntityManager();
				
		 T t = em.find(getClazz(), id);
		 
		 EntityTransaction tx = em.getTransaction();
		 tx.begin();
		 
		 em.remove(em.merge(t));
		 
		 tx.commit();
			
		 em.close();
		 emf.close();
		 
		 return true;
	}
}

