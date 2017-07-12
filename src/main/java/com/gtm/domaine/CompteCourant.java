package com.gtm.domaine;

import javax.persistence.Entity;

@Entity
public class CompteCourant extends Compte{
	

	private long plafondDeDecouvert;

	public CompteCourant(long solde) {
		super(solde);
		this.plafondDeDecouvert = 1000;
	}

	public CompteCourant(long solde, long plafondDeDecouvert) {
		super(solde);
		this.plafondDeDecouvert = plafondDeDecouvert;
	}

	public CompteCourant() {
		super();
	}

	public long getPlafondDeDecouvert() {
		return plafondDeDecouvert;
	}

	public void setPlafondDeDecouvert(long plafondDeDecouvert) {
		this.plafondDeDecouvert = plafondDeDecouvert;
	}

	@Override
	public String toString() {
		return "CompteCourant [ " + getIdCompte() + ", " + getSolde()
				+ ", " + plafondDeDecouvert  + "]";
	}
	

	
	
	
	

}
