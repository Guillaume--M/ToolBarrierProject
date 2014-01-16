package vehicule;

import barriere.FileAttente;
import types.*;

public class PoidLourd extends Vehicule {

	/**
	 * Constructeur d'une PoidLourd
	 * 
	 * @param buffer
	 *            La file d'attente auquel est assigne la PoidLourd
	 * @param type
	 *            Le type de vehicule que l'on construit
	 * @param defectuosite
	 *            Etat defectueux de la PoidLourd
	 */
	public PoidLourd(FileAttente buffer, TypeVehicule type, boolean stat,
			int i,Paiement p) {
		super(buffer, type, stat,i,p);
	}

}