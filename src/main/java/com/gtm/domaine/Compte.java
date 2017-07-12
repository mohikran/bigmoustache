package com.gtm.domaine;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
public abstract class Compte {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private long solde;
	
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

	public long getIdCompte() {
		return id;
	}

}