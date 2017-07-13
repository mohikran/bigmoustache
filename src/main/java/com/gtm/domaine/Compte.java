package com.gtm.domaine;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
/**
 * 
 * Classe abstraire domaine Compte avec ses parametres, constructeurs getters et setters
 * 
 *
 */
@Entity
public  class Compte {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private long solde;
	/**
	 * 
	 * @param solde Fixe lors de la creation du compte
	 */
	public Compte(long solde) {
		super();
		this.solde = solde;
	}

	public Compte() {
		super();
	}

	public long getSolde() {
		return solde;
	}

	public void setSolde(long solde) {
		this.solde = solde;
	}

	public int getIdCompte() {
		return id;
	}

}
