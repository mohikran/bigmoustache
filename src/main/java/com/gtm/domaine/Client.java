package com.gtm.domaine;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Client {

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private Long id;
	
	private String nom;
	private String prenom;
	private String email;
	private String adresse;
	private String numero;
	
	public Client() {
		
	}

	public Client(String nom, String prenom, String email, String adresse, String numero) {
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.adresse = adresse;
		this.numero = numero;
	}
	
	public Client(Client client_) {
		this.nom = client_.getNom();
		this.prenom = client_.getPrenom();
		this.email = client_.getEmail();
		this.adresse = client_.getAdresse();
		this.numero = client_.getNumero();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	
}
