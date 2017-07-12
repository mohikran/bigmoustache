package com.gtm.service;

import java.util.List;

import com.gtm.dao.IntClientCrudDao;
import com.gtm.domaine.Client;
/**
 * 
 * 
 * Interface heritant de IntGenericCrudService pour les objets de type Client
 *
 */
public interface IntClientCrudService extends IntGenericCrudService<Client>{

	IntClientCrudDao getDao();
/**
 * Signature de methode renvoyant une liste de clients appartenant à un conseiller
 * @param idConseiller le numero du conseiller servant à filtrer la liste de client
 * @return liste de clients appartenant à un conseiller
 */
	List<Client> LireByIdConseiller(long idConseiller);

}