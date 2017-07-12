package com.gtm.dao;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import com.gtm.domaine.Conseiller;

@Named
@SessionScoped
public class ConseillerCrudDao extends GenericCrudDao<Conseiller> implements Serializable, IntConseillerCrudDao {
	
	/* (non-Javadoc)
	 * @see com.gtm.dao.IntConseillerCrudDao#getClazz()
	 */
	@Override
	public Class<Conseiller> getClazz(){
		return Conseiller.class;
	}

}
