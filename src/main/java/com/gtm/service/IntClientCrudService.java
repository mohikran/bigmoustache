package com.gtm.service;

import java.util.List;

import com.gtm.dao.IntClientCrudDao;
import com.gtm.domaine.Client;

public interface IntClientCrudService {

	IntClientCrudDao getDao();

	List<Client> LireByIdConseiller(long idConseiller);

}