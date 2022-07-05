package fr.diginamic.dev.classes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * Chaque @Test sont indépendants Test de la classe GestionnaireVehicule
 * 
 * @author chris
 *
 */
public class GestionnaireVehiculeTest {
	/**
	 * Je vais déclarer un attribut private pour pouvoir l'utiliser dans tous mes
	 * tests @Test
	 */
	private GestionnaireVehicule gv;

	/**
	 * On repart à zéro véhicule pour chaque Test @Test grâce @Before
	 */
	@Before
	public void setUp() throws Exception {
		this.gv = new GestionnaireVehicule();
		/**
		 * gv.countVehicule() est à 0
		 */
	}

	@Test(expected = Exception.class)
	public void testAddVehiculeWithNull() throws Exception {
		gv.addVehicule(null);
	}

	/**
	 * Est ce que la liste est vide ?
	 */
	@Test
	public void testListeVide() {
		assertEquals(0, gv.countVehicule());
	}

	/**
	 * Test de l'utilisation normale de addVehicule du GestionnaireVehicule
	 * 
	 * @throws Exception
	 */
	@Test
	public void testAddVehicule() throws Exception {
		gv.addVehicule(new Peugeot404());
		assertTrue(gv.countVehicule() == 1);

	}

	@Test
	public void testAddVehiculeTroisV() throws Exception {
		jeuxEssais();

		assertTrue(gv.countVehicule() == 3);

	}

	@Test
	public void testAddVehiculeANePasFaire() {
		try {
			gv.addVehicule(null);
			// Lève une exception => on va directement dans le catch
			assertTrue(gv.countVehicule() == 1);
			// Cette ligne ne sera jamais exécuter
		} catch (Exception ex) {
			/**
			 * INTERDIT DE NE RIEN METTRE
			 */
		}

	}

	private void jeuxEssais() throws Exception {
		gv.addVehicule(new Peugeot404());
		gv.addVehicule(new RenaultTraffic());
		gv.addVehicule(new Peugeot404());
	}

	@Test
	public void testFindCamion() throws Exception {
		jeuxEssais();
		assertEquals(1, gv.findCamion().intValue());
	}

	@Test
	public void testFindCamionVide() throws Exception {
		assertEquals(0, gv.findCamion().intValue());
		gv.addVehicule(new Peugeot404());
		assertEquals(0, gv.findCamion().intValue());
	}

	@Test
	public void testFindVoiture() throws Exception {
		jeuxEssais();
		assertEquals(2, gv.findVoiture().intValue());
		assertTrue(gv.findVoiture().intValue() >= 1);
	}

	@Test
	public void testFindVoitureVide() throws Exception {
		assertEquals(0, gv.findVoiture().intValue());
		gv.addVehicule(new RenaultTraffic());
		assertEquals(0, gv.findVoiture().intValue());

	}

}
