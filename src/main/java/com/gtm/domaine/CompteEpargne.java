package com.gtm.domaine;

import javax.persistence.Entity;
/**
 * 
 * Classe  domaine CompteEpargne, herite de Compte 
 *  Attribut tauxDeRemuneration caracteristique de cette classe, fixe a 3
 * Est utilise dans le Dao et appelé par Hibernate comme entite
 */
@Entity
public class CompteEpargne extends Compte {
	
	private int tauxDeRenumeration;

	public CompteEpargne(long solde) {
		super(solde);
		this.tauxDeRenumeration = 3;
	}

	public CompteEpargne(long solde, int tauxDeRenumeration) {
		super(solde);
		this.tauxDeRenumeration = tauxDeRenumeration;
	}

	public CompteEpargne() {
		super();
	}

	public int getTauxDeRenumeration() {
		return tauxDeRenumeration;
	}

	public void setTauxDeRenumeration(int tauxDeRenumeration) {
		this.tauxDeRenumeration = tauxDeRenumeration;
	}

	@Override
	public String toString() {
		return "CompteEpargne [ " + getIdCompte() + ", " + getSolde()
				+ ", " +  tauxDeRenumeration + "]";
	}

	
}
