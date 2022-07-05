package fr.diginamic.dev.classes;

import java.util.ArrayList;
import java.util.List;

public class GestionnaireVehicule {

	private static final Camion Null = null;
	private List <Vehicule> listeVehicule = new ArrayList<>();
	/**
	 * 
	 * Ajouter uniquement des vehicule instanciée
	 * s'il est null, declencher une exception
	 * @param vehicule
	 */
	/**
	 * Gestionnaire de véhicules
	 *
	 * Rajouter une façade pour retrouver une Voiture dans la Liste
	 * Rajouter une façade pour retrouver un Camion dans la liste
	 *
	 * Pourvoir leur nombre aussi
	 *
	 * Créer les méthodes répondant aux besoins et écrire les @Test de celle-ci
	 *
	 * @author chris
	 * @version 1.0
	 *
	 */
	public void addVehicule(Vehicule vehicule) throws Exception{
		
		if(vehicule == null) throw  new Exception("le Vehicule n'est pas instancié");
		
		listeVehicule.add(vehicule);
	}
	/**
	 * la méthode countVehicule est une façade car on peut facilement
	 * changer le type de la variable de listeVehicule sans
	 * provoquer une maintenance lourde dans les classes
	 * utilisatrices...
	 * une façade 
	 * @return
	 */
	public int countVehicule() {
		return this.listeVehicule.size();
	}

	/**
     * Rajouter une façade pour retrouver une Voiture dans la Liste
     * Avoir leur nombre aussi
     * 0 vide >0 poiur avoir le nombre
     */
	 
	public Integer findVoiture() {
		Integer count =0;
		for (Vehicule vehicule : listeVehicule) {
			if(vehicule instanceof Voiture) {
				count++;
			}
		}
		return count;
	}
	
	public Integer findCamion() {
		Integer count =0;
		for (Vehicule vehicule : listeVehicule) {
			if(vehicule instanceof Camion) {
				count++;
			}
		}
		return count;
	}
	
}
