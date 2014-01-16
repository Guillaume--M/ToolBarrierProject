package vehicule;

import barriere.FileAttente;
import types.*;

public class Voiture extends Vehicule {


	/**
	 * Constructeur d'une Voiture
	 * 
	 * @param buffer
	 *            La file d'attente auquel est assigne la Voiture
	 * @param type
	 *            Le type de vehicule que l'on construit
	 * @param defectuosite
	 *            Etat defectueux de la Voiture
	 */
	public Voiture(FileAttente buffer, TypeVehicule type, boolean stat,int i,Paiement p) {
		super(buffer, type, stat, i , p );
	}



}

