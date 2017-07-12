package com.gtm.dao;

import com.gtm.domaine.Conseiller;

public interface IntConseillerCrudDao extends IntGenericCrudDao<Conseiller>{

	Class<Conseiller> getClazz();

}