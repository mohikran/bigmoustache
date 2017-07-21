package com.gtm.service;

import java.io.Serializable;
import java.util.ArrayList;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.gtm.dao.BarbierDao;
import com.gtm.dao.IBarbierDao;
import com.gtm.domaine.Barbier;

@SuppressWarnings("serial")
@Named
@SessionScoped
public class BarbierService implements Serializable, IBarbierService{

	@Inject
	private IBarbierDao barbierDao;
	
	public BarbierService() {
		
	}
	
	public ArrayList<Barbier> getListe() {
		return barbierDao.findAll();
	}

	public Barbier getById(int id) {	
		return barbierDao.findById(id);
	}

	public void ajouter(Barbier barbier) {
		//BarbierDao daodur = new BarbierDao();
		//daodur.insert(barbier);
		barbierDao.insert(barbier);
	}

	public void supprimer(Barbier barbier) {
		barbierDao.delete(barbier);
	}
	
	public void miseAJour(Barbier barbier) {
		barbierDao.update(barbier);
	}

}
