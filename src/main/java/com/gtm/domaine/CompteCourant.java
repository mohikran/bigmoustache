package com.gtm.domaine;

import javax.persistence.Entity;
/**
 * 
 * Classe  domaine CompteCourant, herite de Compte 
 *  Attribut plafondDecouvert caracteristique de cette classe, fixe a 1000
 *  Est utilise dans le Dao et appelé par Hibernate comme entite
 */
@Entity
public class CompteCourant extends Compte{
	

	private long plafondDeDecouvert;
/**
 * 
 * @param solde Fixe lors de la creation du compte
 */
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
