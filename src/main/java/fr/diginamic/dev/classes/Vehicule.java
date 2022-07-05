package fr.diginamic.dev.classes;

import fr.diginamic.dev.interfaces.IVehicule;
/**
 * 
 * Classe Abstraite avec l'implementation de 
 * l'interface 
 * Pour utiliser cette classe, il faut creer des classes filles
 * @author OMARI
 *version 1.0
 */
public abstract class Vehicule implements IVehicule {

	@Override
	public void rouler() {

	}

	@Override
	public void accelerer() {
	}

	@Override
	public void stopper() {
	
	}

	@Override
	public void ralentire() {
	}

	@Override
	public void demarrer() {

	}

}
