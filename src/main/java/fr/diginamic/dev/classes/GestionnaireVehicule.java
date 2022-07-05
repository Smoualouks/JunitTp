package fr.diginamic.dev.classes;

import java.util.ArrayList;
import java.util.List;

public class GestionnaireVehicule {

	private static final Camion Null = null;
	private List <Vehicule> listeVehicule = new ArrayList<>();
	/**
	 * 
	 * Ajouter uniquement des vehicule instanci�e
	 * s'il est null, declencher une exception
	 * @param vehicule
	 */
	/**
	 * Gestionnaire de v�hicules
	 *
	 * Rajouter une fa�ade pour retrouver une Voiture dans la Liste
	 * Rajouter une fa�ade pour retrouver un Camion dans la liste
	 *
	 * Pourvoir leur nombre aussi
	 *
	 * Cr�er les m�thodes r�pondant aux besoins et �crire les @Test de celle-ci
	 *
	 * @author chris
	 * @version 1.0
	 *
	 */
	public void addVehicule(Vehicule vehicule) throws Exception{
		
		if(vehicule == null) throw  new Exception("le Vehicule n'est pas instanci�");
		
		listeVehicule.add(vehicule);
	}
	/**
	 * la m�thode countVehicule est une fa�ade car on peut facilement
	 * changer le type de la variable de listeVehicule sans
	 * provoquer une maintenance lourde dans les classes
	 * utilisatrices...
	 * une fa�ade 
	 * @return
	 */
	public int countVehicule() {
		return this.listeVehicule.size();
	}

	/**
     * Rajouter une fa�ade pour retrouver une Voiture dans la Liste
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
