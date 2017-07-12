package com.gtm.dao;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import com.gtm.domaine.Compte;

@Named
@SessionScoped
public class CompteCrudDao extends GenericCrudDao<Compte>  implements Serializable, IntCompteCrudDao {
	
	/* (non-Javadoc)
	 * @see com.gtm.dao.IntCompteCrudDao#getClazz()
	 */
	@Override
	public Class<Compte> getClazz(){
		return Compte.class;
	}

}
