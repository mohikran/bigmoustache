package com.gtm.dao;

import com.gtm.domaine.Compte;

public interface IntCompteCrudDao extends IntGenericCrudDao<Compte>{

	Class<Compte> getClazz();

}