package com.gtm.domaine;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Conseiller {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idConseiller;
	private String nom;
	private String prenom;
	private String password,login;
	private ArrayList<Client> listeClients;
	
	
	public Conseiller(String nom, String prenom, String password, String login, ArrayList<Client> listeClients) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.password = password;
		this.login = login;
		this.listeClients = listeClients;
	}


	public Conseiller() {
		super();
	}
	
	
	public int getIdConseiller() {
		return idConseiller;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public ArrayList<Client> getListeClients() {
		return listeClients;
	}


	public void setListeClients(ArrayList<Client> listeClients) {
		this.listeClients = listeClients;
	}
	
	
	
}
