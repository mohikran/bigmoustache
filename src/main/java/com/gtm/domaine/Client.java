package com.gtm.domaine;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Client {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long idClient;
	private String nom;
	private String prenom;
	private String adresse;
	private String email;
	private CompteCourant compteCourant;
	private CompteEpargne compteEpargne;
	private long idConseiller;


	public Client(String nom, String prenom, String adresse, String email, CompteCourant compteCourant,
			CompteEpargne compteEpargne, long idConseiller) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.email = email;
		this.compteCourant = compteCourant;
		this.compteEpargne = compteEpargne;
		this.idConseiller = idConseiller;
	}


	public Client() {
		super();
	}
	
	
	public long getIdClient() {
		return idClient;
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


	public String getAdresse() {
		return adresse;
	}


	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public CompteCourant getCompteCourant() {
		return compteCourant;
	}


	public void setCompteCourant(CompteCourant compteCourant) {
		this.compteCourant = compteCourant;
	}


	public CompteEpargne getCompteEpargne() {
		return compteEpargne;
	}


	public void setCompteEpargne(CompteEpargne compteEpargne) {
		this.compteEpargne = compteEpargne;
	}


	public long getIdConseiller() {
		return idConseiller;
	}


	public void setIdConseiller(long idConseiller) {
		this.idConseiller = idConseiller;
	}
	
	
		

	
}
