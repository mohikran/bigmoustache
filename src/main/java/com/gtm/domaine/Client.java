package com.gtm.domaine;

/**
 * Classe domaine client avec ses parametres, constructeurs getters et setters
 * Est utilise dans le Dao et appelé par Hibernate comme entite
 * 
 */

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;

/**
 * Classe domaine client avec ses parametres, constructeurs getters et setters
 * Est utilise dans le Dao et appelé par Hibernate comme entite
 * 
 */

@Entity
@NamedQuery(name = "Client.LireByIdConseiller", query = "select c From Client c where c.idConseiller=?1")
public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nom;
	private String prenom;
	private String adresse;
	private String email;
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private CompteCourant compteCourant;
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private CompteEpargne compteEpargne;
	private long idConseiller;

	/**
	 * 
	 * @param nom
	 *            Nom du client
	 * @param prenom
	 *            Prenom du client
	 * @param adresse
	 *            Adresse du client
	 * @param email
	 *            Email du client
	 * @param compteCourant
	 *            Compte courant que peut avoir un client
	 * @param compteEpargne
	 *            Compte Epargne que peut avoir un client
	 * @param idConseiller
	 *            Numero d identification du conseiller du client
	 */
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

	/**
	 * 
	 * @param id
	 *            Numero identification du client, est unique
	 * @param nom
	 *            Nom du client
	 * @param prenom
	 *            Prenom du client
	 * @param adresse
	 *            Adresse du client
	 * @param email
	 *            Email du client
	 * @param compteCourant
	 *            Compte courant que peut avoir un client
	 * @param compteEpargne
	 *            Compte Epargne que peut avoir un client
	 * @param idConseiller
	 *            Numero d identification du conseiller du client
	 */
	public Client(int id, String nom, String prenom, String adresse, String email, CompteCourant compteCourant,
			CompteEpargne compteEpargne, long idConseiller) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.email = email;
		this.compteCourant = compteCourant;
		this.compteEpargne = compteEpargne;
		this.idConseiller = idConseiller;
	}

	public Client(int id, String nom, String prenom, String adresse, String email, int idConseiller) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.email = email;
		this.compteCourant = null;
		this.compteEpargne = null;
		this.idConseiller = idConseiller;
	}

	public Client(CompteCourant compteCourant, CompteEpargne compteEpargne) {
		super();
		
		this.compteCourant = compteCourant;
		this.compteEpargne = compteEpargne;
	}

	public Client() {
		super();
	}

	public int getIdClient() {
		return id;
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

	@Override
	public String toString() {
		return "Client [ " + id + ", " + nom + ", " + prenom + ", " + adresse + ", " + email + ", " + compteCourant
				+ ", " + compteEpargne + ", " + idConseiller + " ]";
	}

}
