package Proxibanque;

import static org.junit.Assert.*;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.gtm.dao.ClientCrudDao;
import com.gtm.dao.CompteCrudDao;
import com.gtm.dao.ConseillerCrudDao;
import com.gtm.dao.IntClientCrudDao;
import com.gtm.domaine.Client;
import com.gtm.domaine.CompteCourant;
import com.gtm.domaine.CompteEpargne;
import com.gtm.service.ClientCrudService;
import com.gtm.service.VirementService;

public class ClientCrudServiceTest {

	private final static Logger log = Logger.getLogger(ClientCrudServiceTest.class);
	
	private ClientCrudDao clientService;
	Client client1;
	CompteCourant compteCClient1;
	CompteEpargne compteEClient1; 
	
	@Before
	public void initialisationDesDonnées(){
		clientService = new ClientCrudDao();
		compteCClient1 = new CompteCourant(2000);
		compteEClient1 = new CompteEpargne(50000);
		client1 = new Client(1,"Piccini","Alexandre", "5 rue du Grand Boulevard", "APiccini@hotmail.fr", compteCClient1, compteEClient1, 1);
	}
	
	@After
	public void DestructionDesDonnées(){
		clientService = null;
		compteCClient1 = null;
		compteEClient1 = null;
		client1 = null;
	}
		
	
	@Test
	public void testsauverEnBase() {
		assertTrue(clientService.sauverEnBase(client1));
		log.info(client1);
	}
	
	@Test
	public void testLireByIdRetourneUnObjet(){
		assertNotNull(clientService.lireById(1));
	}
	
	@Test
	public void testLireByIdRetourneUnClient(){
		assertTrue(clientService.lireById(1) instanceof Client);
	}
	
	@Test
	public void testLireByIdConseillerRetourneUnObjet(){
		assertNotNull(clientService.LireByIdConseiller(1));
	}
	
	@Test
	public void testLireByIdConseillerRetourneUnClient(){
		assertTrue(clientService.LireByIdConseiller(1) instanceof Client);
	}
	
	@Test
	public void testLireTousRetourneUneListeNonNull(){
		assertNotNull(clientService.lireTous());
	}
	
	@Test
	public void testLireTousRetourneUneListeNonVide(){
		assertFalse(clientService.lireTous().isEmpty());
	}
	
	
	
	@Test
	public void testsupprimerClient() {
		assertTrue(clientService.supprimer(1));
	}

}
