package com.gtm.domaine;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Barbier {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String photo;
	private String nom;
	private String prenom;
	private String numero;
	@OneToMany
	private Collection<String> horaireDisponible;
	
	public Barbier() {
	}

	public Barbier(Barbier barbier_) {
		this.photo = barbier_.getPhoto();
		this.nom = barbier_.getNom();
		this.prenom = barbier_.getPrenom();
		this.numero = barbier_.getNumero();
		this.horaireDisponible = barbier_.getHoraireDisponible();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
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

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Collection<String> getHoraireDisponible() {
		return horaireDisponible;
	}

	public void setHoraireDisponible(Collection<String> horaireDisponible) {
		this.horaireDisponible = horaireDisponible;
	}
	
}
