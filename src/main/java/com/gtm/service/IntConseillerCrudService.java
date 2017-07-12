package com.gtm.service;

import com.gtm.dao.IntConseillerCrudDao;
import com.gtm.domaine.Conseiller;
/**
 * 
 * 
 * Interface heritant de IntGenericCrudService pour les objets de type Conseiller
 *
 */
public interface IntConseillerCrudService  extends IntGenericCrudService<Conseiller>{

	IntConseillerCrudDao getDao();

}