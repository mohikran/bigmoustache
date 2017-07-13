package com.gtm.dao;

import com.gtm.domaine.Compte;
/**
 * 
 * 
 * Interface heritant de IntGenericCrudDao pour les objets de type Compte
 *
 */
public interface IntCompteCrudDao extends IntGenericCrudDao<Compte>{

	Class<Compte> getClazz();

}