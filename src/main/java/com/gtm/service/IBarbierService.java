package com.gtm.service;

import java.util.ArrayList;

import com.gtm.domaine.Barbier;

public interface IBarbierService {

	ArrayList<Barbier> getListe();

	Barbier getById(int id);

	void ajouter(Barbier barbier);

	void supprimer(Barbier barbier);

}