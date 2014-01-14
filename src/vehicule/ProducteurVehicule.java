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
package vehicule;

import barriere.FileAttente;
import barriere.GestionnaireAlarme;
import barriere.Rapport;
import vehicule.*;
import types.*;
import barriere.Alarme;

public class ProducteurVehicule extends Thread {
	int i = 0;
	int tempo;
	FileAttente buffer;
	TypeVehicule typeVehiculeCreer;

	public ProducteurVehicule(int nbrvehiculeparmin, TypeVehicule type,
			FileAttente buffer) {
		this.buffer = buffer;
		tempo = 60000 / nbrvehiculeparmin;
		typeVehiculeCreer = type;

	}

	public Vehicule CreerVehicule() {
		++i;
		float r1 = (float) (Math.random() * 100);
		boolean defectueux;

		if (r1 > 90) {
			defectueux = true;
		} else {
			defectueux = false;
		}
		Vehicule v = new Vehicule(buffer, typeVehiculeCreer, defectueux, i);

		return v;
	}

	@Override
	public void run() {
		while (true) {
			if (!buffer.isFull()) {
				synchronized (buffer) {
					Vehicule v = CreerVehicule();
					Rapport.getInstance().ajouterLigne("Le vehicule("
							+ typeVehiculeCreer.getName() + ") n "
							+ v.getNumero() + " arrive en station");
					buffer.depose(v);
				}
			} else {
				GestionnaireAlarme.ajouterAlarme(new Alarme(TypeAlarme.Bouchon,"Trop de véhicule"));
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			try {

				Thread.sleep(tempo);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
