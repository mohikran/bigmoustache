import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.gtm.dao.ClientCrudDao;
import com.gtm.dao.CompteCrudDao;
import com.gtm.dao.ConseillerCrudDao;
import com.gtm.domaine.Client;
import com.gtm.domaine.CompteCourant;
import com.gtm.domaine.CompteEpargne;
import com.gtm.domaine.Conseiller;
import com.gtm.domaine.Gerant;

public class Test1 {
	private ClientCrudDao clientDao;
	private CompteCrudDao compteDao;
	private ConseillerCrudDao conseillerDao;
	Client client1;
	Client client2;
	Client client3;
	CompteCourant compteCClient1;
	CompteCourant compteCClient2;
	CompteEpargne compteEClient1; 
	
	@Before
	public void initialisationDesDonnées(){
		clientDao = new ClientCrudDao();
		compteDao = new CompteCrudDao();
		conseillerDao = new ConseillerCrudDao();
		
		Conseiller conseiller1 = new Conseiller("Dupont", "Marc", "Kikoo", "MDupont");
		Conseiller conseiller2 = new Conseiller("Surand", "Martin", "Jakam", "MSurand");
		
		List<Conseiller> maList = new ArrayList<Conseiller>();
		maList.add(conseiller1);
		maList.add(conseiller2);
		
		Gerant gerant = new Gerant("Holland", "François", "GTPresident", "Flambis", maList);
		
		compteCClient1 = new CompteCourant(2000);
		compteEClient1 = new CompteEpargne(50000);
		compteCClient2 = new CompteCourant(1000);
		
		client1 = new Client("Piccini","Alexandre", "5 rue du Grand Boulevard", "APiccini@hotmail.fr", compteCClient1, compteEClient1, 1);
		client2 = new Client("Dumoulin", "Matthieu", "5 petite rue de Monplaisir", "m.dumoulin.ensci@gmail.com", compteCClient2, null, 1);
		client3 = new Client("MBiandou", "Douglas", "unknow", "DMbiandou@objis.com", null, null, 2);

	
	
//	clientDao.sauverEnBase(client1);
//	clientDao.sauverEnBase(client2);
//	clientDao.sauverEnBase(client3);
//	
//	conseillerDao.sauverEnBase(conseiller1);
//	conseillerDao.sauverEnBase(conseiller2);
//	
//	System.out.println(clientDao.lireById(2));
//	clientDao.supprimer(2);
//	System.out.println(clientDao.lireTous());
//	
//	client1 = new Client(1, "Roux", "Clement", "5 rue de la messe", "CRoux@jk.fr", compteCClient1, compteEClient1, 1);
//	
//	clientDao.modifier(client1);
//	
//	System.out.println(clientDao.lireById(1));
	}

	@After
	public void destruction(){
		clientDao = null;
		compteDao = null;
		conseillerDao = null;
	}
	
	@Test
	public void testLectureClient() {
		System.out.println(compteCClient1);
		System.out.println(client1);
		assertNotNull(clientDao.sauverEnBase(client1));
	}
}
