package com.gtm.domaine;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public abstract class Compte {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long idCompte;
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
		return idCompte;
	}

}
