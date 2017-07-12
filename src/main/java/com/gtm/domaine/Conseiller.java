package com.gtm.domaine;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Classe domaine conseiller avec ses parametres, constructeurs getters et setters
 * Est utilise dans le Dao et appelé par Hibernate comme entite
 * 
 */
@Entity
public class Conseiller {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String nom;
	private String prenom;
	private String password,login;

	
	/**
	 * Constructeur 
	 * @param nom Nom du Conseiller
	 * @param prenom Prenom du Conseiller
	 * @param password Password du Conseiller
	 * @param login Login du Conseiller 
	 */
	public Conseiller(String nom, String prenom, String password, String login) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.password = password;
		this.login = login;
	}


	public Conseiller() {
		super();
	}
	
	
	public int getIdConseiller() {
		return id;
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


	@Override
	public String toString() {
		return "Conseiller [" + id + ", " + nom + ", " + prenom + ", " + password + ", "
				+ login + " ]";
	}


	
	
	
}
