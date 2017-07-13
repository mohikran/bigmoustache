package com.gtm.service;

import java.util.List;

import com.gtm.dao.IntGenericCrudDao;
/**
 * 
 * Interface du package Service, utilisant la genericite et contenant la signature des methodes du Crud Service. 
 *
 * @param <T> T pour Objet generique, en pratique les objets utilises seront  de Type Compte, Client ou Conseiller
 */
public interface IntGenericCrudService<T> {
/**
 * 
 * @return
 */
	IntGenericCrudDao<T> getDao();
/**
 * Sauvegarde dans la base de donnee l'objet en parametre
 * @param input objet que l on souhaite inserer dans la BDD
 * @return renvoie l objet que l on souhaite sauvegarder
 */
	boolean sauverEnBase(T input);
/**
 * Cherche un objet dans une base de donnee a partir de son Id
 * @param id clef primaire de l objet que l on souhaite trouver
 * @return renvoie l objet que l on souhaite sauvegarder
 */
	T lireById(int id);
/**
 * Cherche une liste d'objets sans filtre
 * @return retourne la liste d'objets
 */
	List<T> lireTous();

	boolean modifier(T input);

	boolean supprimer(int id);

}