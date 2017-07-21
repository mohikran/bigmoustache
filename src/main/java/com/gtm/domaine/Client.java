package com.gtm.domaine;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Client {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty
	@Length(min = 2, max = 50)
	@Pattern(regexp = "([A-Za-z éèà]+)", message = "ne doit contenir que des lettres, tirets ou espaces")
	private String nom;
	
	@NotEmpty
	@Length(min = 2, max = 50)
	@Pattern(regexp = "([A-Za-z éèà]+)", message = "ne doit contenir que des lettres, tirets ou espaces")
	private String prenom;
	
	@NotEmpty
	@Email
	@Length(min = 5, max = 50)
	private String email;
	
	@NotEmpty
	@Length(min = 5, max = 200)
	private String adresse;
	
	@NotEmpty
	@Length(min = 10, max = 15)
	@Pattern(regexp = "(\\d+)|([\\d ])", message = "doit être un numéro de téléphone" )
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
	
	
	
	public Client(Long id, String nom, String prenom, String email, String adresse, String numero) {
		super();
		this.id = id;
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
