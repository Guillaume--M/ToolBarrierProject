/* ENSICAEN
 * 6 Boulevard Marechal Juin 
 * F-14050 Caen Cedex 
 *
 * This file is owned by ENSICAEN students.
 * No portion of this document may be reproduced, copied
 * or revised without written permission of the authors.
 */
/**
 * @author Meunier Guillaume 
 * 
 */
package vehicule;

import java.util.ArrayList;

import barriere.FileAttente;
import types.*;

public class Vehicule extends Thread {
	protected int numero;
	protected boolean defectueux;

	protected FileAttente buffer;

	protected ArrayList<TypePaiement> paiementPossede;

	protected TypeVehicule typeVehicule;

	/**
	 * 
	 * Constructeur d'un vehicule
	 * 
	 * @param file
	 *            La file d'attente auquel est assign� le vehicule
	 * @param num
	 *            le numero du vehicule
	 */

	public Vehicule(FileAttente file, TypeVehicule type, boolean sta, int i) {
		numero = i;
		defectueux = sta;
		buffer = file;
		paiementPossede = new ArrayList<>();
		typeVehicule = type;
	}

	/**
	 * Getter du numero
	 * 
	 * @return int Le numero du vehicule
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * Setter de la defectuosite
	 * 
	 * @param stat
	 *            true=defectueux, false=ok
	 */
	public void setDefectuosite(boolean stat) {
		defectueux = stat;
	}

	/**
	 * Getter de la defectuosite
	 * 
	 * @return boolean La valeur du defectueux
	 */
	public boolean getDefectuosite() {
		return defectueux;
	}
	public TypeVehicule getCategorie(){
		return typeVehicule;
	}
}
