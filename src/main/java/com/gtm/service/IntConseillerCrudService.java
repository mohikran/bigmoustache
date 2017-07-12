package com.gtm.service;

import com.gtm.dao.IntConseillerCrudDao;
import com.gtm.domaine.Conseiller;

public interface IntConseillerCrudService  extends IntGenericCrudService<Conseiller>{

	IntConseillerCrudDao getDao();

}