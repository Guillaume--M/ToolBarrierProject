/* 
 * ENSICAEN
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
package barriere;

import vehicule.*;
import java.util.Vector;
import types.*;
import graphique.InterfaceInfo;

/**
 * @author Meunier Guillaume
 * 
 */
public class FileAttente {
	int size, currentPut, currentGet;
	boolean full;
	boolean empty;
	Vector<Vehicule> listVehicule;

	public FileAttente(int size) {
		this.size = size;
		listVehicule = new Vector<Vehicule>(size);
		currentGet = -1;
		currentPut = 0;
		full = false;
		empty = true;
	}

	public void depose(Vehicule o) {

		if (listVehicule.size() >= size) {
			System.out.println("Trop de Objects en attente : Bouchon");
		} else {
			listVehicule.add(o);
		}
		InterfaceInfo.getInstance().maj();
	}

	public Vehicule accepteVehicule() {

		if (listVehicule.size() == 0) {
			return null;
		}

		Vehicule currentV = listVehicule.firstElement();
		listVehicule.remove(currentV);
		return currentV;

	}

	public boolean isFull() {
		if (listVehicule.size() >= size) {
			return true;
		} else {
			return false;
		}
	}

	public int getNbPoidsLourd() {
		int nb = 0;
		for (int i = 0; i < listVehicule.size(); i++) {
			if (listVehicule.get(i).getCategorie() == TypeVehicule.PoidLourd)
				nb++;
		}
		return nb;
	}

	public int getNbMoto() {
		int nb = 0;
		for (int i = 0; i < listVehicule.size(); i++) {
			if (listVehicule.get(i).getCategorie() == TypeVehicule.Moto)
				nb++;
		}
		return nb;
	}

	public int getNbVoiture() {
		int nb = 0;
		for (int i = 0; i < listVehicule.size(); i++) {
			if (listVehicule.get(i).getCategorie() == TypeVehicule.Voiture)
				nb++;
		}
		return nb;
	}

	/*
	 * public int getNbSpecial(){ int nb = 0; for(int i = 0;i<size;i++){
	 * if(listVehicule.get(i).getCategorie() == Categorie.Special) nb++; }
	 * return nb; }
	 */
	public void filplus() {
		this.size = size++;
	}

	public void filmoins() {
		this.size = size--;
	}
}