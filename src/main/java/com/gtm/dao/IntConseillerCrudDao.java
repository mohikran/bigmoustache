package com.gtm.dao;

import com.gtm.domaine.Conseiller;
/**
 * 
 * 
 * Interface heritant de IntGenericCrudDao pour les objets de type Conseiller
 *
 */
public interface IntConseillerCrudDao extends IntGenericCrudDao<Conseiller>{

	Class<Conseiller> getClazz();

}