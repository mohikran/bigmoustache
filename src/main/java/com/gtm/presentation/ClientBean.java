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
			return "barbier";
		} catch (Exception e) {
			return "formulaire";
		}
	}

	public String selecService() {
		if (serviceSelect.equals("service1")){
			serviceSelect= "Service : Barbe façon bucheron Canadien";
			prix = 25;
		return "rendezvous";
		}
		else if (serviceSelect.equals("service2")){
			prix = 35;
			serviceSelect= "Service : Barbe à l'Anglaise";
		return "rendezvous";
		}
		else {return "listeService";}
	}
	
	public void updateClient()
	{
		Client clientmodifier = service.update(client);
		if(clientmodifier != null)
		{
			client = clientmodifier;
		}
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
