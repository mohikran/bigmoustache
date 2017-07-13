package com.gtm.dao;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import com.gtm.domaine.Compte;
/**
 * 
 * Classe redéfinissant les méthodes CRUD pour les objets de type Compte dans la couche Dao. Elle hérite de GenericCrudDao.
 *
 */
@Named
@SessionScoped
public class CompteCrudDao extends GenericCrudDao<Compte> implements Serializable, IntCompteCrudDao {

	/**
	 * Reecriture de la fonction getClazz() pour retourner la classe de Compte
	 * (et pouvoir faire appel au méthode de Compte dans le generique)
	 */
	@Override
	public Class<Compte> getClazz() {
		return Compte.class;
	}

}
