package com.gtm.service;

import com.gtm.dao.IntCompteCrudDao;
import com.gtm.domaine.Compte;

public interface IntCompteCrudService extends IntGenericCrudService<Compte> {

	IntCompteCrudDao getDao();

}