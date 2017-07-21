package com.gtm.presentation;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.gtm.domaine.Client;
import com.gtm.service.IClientService;

@SuppressWarnings("serial")
@Named
@SessionScoped
public class ClientBean implements Serializable {

	private Client client;
	@Inject
	private IClientService service;
	private String horaireRdv;
	private Boolean service1, service2;
	private Integer prix;
	private String serviceSelect;

	public ClientBean() {
		// client = new Client ();
		System.out.println("\n\n BLABLA \n\n");
	}

	@PostConstruct
	public void init() {
		client = new Client();
	}

	public String creerClient() {
		try {
			System.out.println("Affichage client bean" + client);
			service.ajouter(client);
			return "listeService";
		} catch (Exception e) {
			return "formulaire";
		}
	}

	public String selecService() {
		if (serviceSelect.equals("service1")){
			prix = 25;
		return "rendezvous";
		}
		else if (serviceSelect.equals("service2")){
			prix = 35;
		return "rendezvous";
		}
		else {return "listeService";}
	}

	public IClientService getService() {
		return service;
	}

	public void setService(IClientService service) {
		this.service = service;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public String getHoraireRdv() {
		return horaireRdv;
	}

	public void setHoraireRdv(String horaireRdv) {
		this.horaireRdv = horaireRdv;
	}

	public Integer getPrix() {
		return prix;
	}

	public void setPrix(Integer prix) {
		this.prix = prix;
	}

	public String getServiceSelect() {
		return serviceSelect;
	}

	public void setServiceSelect(String serviceSelect) {
		this.serviceSelect = serviceSelect;
	}

}
