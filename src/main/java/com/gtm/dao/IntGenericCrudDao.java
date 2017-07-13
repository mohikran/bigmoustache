package com.gtm.dao;

import java.util.List;
/**
 * 
 * Interface du package Dao, utilisant la genericite et contenant la
 * signature des methodes du CrudDao.
 *
 * @param <T>
 *            T pour Objet generique, en pratique les objets utilises seront de
 *            Type Compte, Client ou Conseiller
 */
public interface IntGenericCrudDao<T> {
	/**
	 * Signature de la méthode definie dans GenericCrudDao
	 */
	boolean sauverEnBase(T input);
	/**
	 * Signature de la méthode definie dans GenericCrudDao
	 */
	T lireById(int id);
	/**
	 * Signature de la méthode definie dans GenericCrudDao
	 */
	List<T> lireTous();
	/**
	 * Signature de la méthode definie dans GenericCrudDao
	 */
	boolean modifier(T input);
	/**
	 * Signature de la méthode definie dans GenericCrudDao
	 */
	boolean supprimer(int id);

}