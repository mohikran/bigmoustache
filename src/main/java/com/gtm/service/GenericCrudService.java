package com.gtm.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;


import com.gtm.dao.IntGenericCrudDao;
/**
 * 
 * 
 * Implementation  de l'interface IntGenericCrudService pour les objets de type T
 * @param <T> T pour Objet generique, en pratique les objets utilises seront  de Type Compte, Client ou Conseiller
 *
 */
public abstract class GenericCrudService<T> implements IntGenericCrudService<T> {
	
	/**
	 * Signature de la méthode permettant d'identifier la couche DAO CRUD de T et d'utiliser ses méthodes.
	 * @return le CrudDao de de T
	 */
public abstract IntGenericCrudDao<T> getDao();
	

/**
 * Sauvegarde dans la base de donnee l'objet en parametre
 * @param input objet que l on souhaite inserer dans la BDD
 * @return un booleen pour le test de la fonction
 */
	public boolean sauverEnBase(T input){
		getDao().sauverEnBase(input);
		return true;
	}

	/**
	 * Cherche un objet dans une base de donnee a partir de son Id
	 * @param id clef primaire de l objet que l on souhaite trouver
	 * @return l'objet T chercher
	 */
	public T lireById(int id){
		T t = getDao().lireById(id);
		return t ;
	}

	
	/**
	 * Cherche une liste d'objets sans filtre
	 * @return retourne la liste d'objets
	 */
	public List<T> lireTous(){
		return getDao().lireTous();
	}
	
	/**
	 * modifie l'objet dans la database
	 * @param input objet que l on souhaite inserer dans la BDD
	 * @return un booleen pour le test de la fonction
	 */
	public boolean modifier(T input){
		getDao().modifier(input);
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
		getDao().supprimer(id);
		return true;
	}
}

