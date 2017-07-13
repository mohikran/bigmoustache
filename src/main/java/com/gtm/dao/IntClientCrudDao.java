package com.gtm.dao;

import java.util.List;

import com.gtm.domaine.Client;
/**
 * 
 * 
 * Interface heritant de IntGenericCrudDao pour les objets de type Client
 *
 */
public interface IntClientCrudDao extends IntGenericCrudDao<Client> {

	Class<Client> getClazz();

	List<Client> LireByIdConseiller(long idConseiller);

}