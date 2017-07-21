package com.gtm.dao;

import java.util.ArrayList;

import com.gtm.domaine.Barbier;

public interface IBarbierDao {

	boolean insert(Barbier barbier_);

	Barbier findById(int id);

	ArrayList<Barbier> findAll();

	boolean delete(Barbier barbier);
	
	boolean update(Barbier barbier);

}