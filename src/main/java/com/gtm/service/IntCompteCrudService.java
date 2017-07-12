package com.gtm.service;

import com.gtm.dao.IntCompteCrudDao;
import com.gtm.domaine.Compte;
/**
 * 
 * 
 * Interface heritant de IntGenericCrudService pour les objets de type Compte
 *
 */
public interface IntCompteCrudService extends IntGenericCrudService<Compte> {

	IntCompteCrudDao getDao();

}