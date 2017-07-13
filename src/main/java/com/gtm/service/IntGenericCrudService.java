package com.gtm.service;

import java.util.List;

import com.gtm.dao.IntGenericCrudDao;

/**
 * 
 * Interface du package Service, utilisant la genericite et contenant la
 * signature des methodes du Crud Service.
 *
 * @param <T>
 *            T pour Objet generique, en pratique les objets utilises seront de
 *            Type Compte, Client ou Conseiller
 */
public interface IntGenericCrudService<T> {
	/**
	 * 
	 * @return
	 */
	IntGenericCrudDao<T> getDao();

	/**
	 * Signature de la méthode definie dans GenericCrudService
	 */
	boolean sauverEnBase(T input);
	
	/**
	 * Signature de la méthode definie dans GenericCrudService
	 */
	T lireById(int id);

	/**
	 * Signature de la méthode definie dans GenericCrudService
	 */
	List<T> lireTous();

	/**
	 * Signature de la méthode definie dans GenericCrudService
	 */
	boolean modifier(T input);

	/**
	 * Signature de la méthode definie dans GenericCrudService
	 */
	boolean supprimer(int id);

}