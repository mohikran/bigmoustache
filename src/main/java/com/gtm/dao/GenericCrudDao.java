package com.gtm.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;


public abstract class GenericCrudDao<T> implements IntGenericCrudDao<T> {
	
	abstract Class<T> getClazz();
	
	/* (non-Javadoc)
	 * @see com.gtm.dao.IntGenericCrudDao#sauverEnBase(T)
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
	
	/* (non-Javadoc)
	 * @see com.gtm.dao.IntGenericCrudDao#lireById(int)
	 */
	public T lireById(int id){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("proxybanque-pu");
		EntityManager em = emf.createEntityManager();
		
		
		T t = em.find(getClazz(), id);
	
		
		em.close();
		emf.close();
		
		return t ;
	}
	
	 /* (non-Javadoc)
	 * @see com.gtm.dao.IntGenericCrudDao#lireTous()
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
	
	/* (non-Javadoc)
	 * @see com.gtm.dao.IntGenericCrudDao#modifier(T)
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
	
	 /* (non-Javadoc)
	 * @see com.gtm.dao.IntGenericCrudDao#supprimer(int)
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

