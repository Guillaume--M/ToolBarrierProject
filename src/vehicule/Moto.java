package vehicule;

import barriere.FileAttente;
import types.*;

public class Moto extends Vehicule {


	/**
	 * Constructeur d'une Moto
	 * 
	 * @param buffer
	 *            La file d'attente auquel est assigne la Moto
	 * @param type
	 *            Le type de vehicule que l'on construit
	 * @param defectuosite
	 *            Etat defectueux de la moto
	 */
	public Moto(FileAttente buffer, TypeVehicule type, boolean stat, int i) {
		super(buffer, type, stat,i);
	}
}
