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

import graphique.InterfaceInfo;
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
	int nbDefectueux = 0;

	public ProducteurVehicule(int nbrvehiculeparmin, TypeVehicule type,
			FileAttente buffer) {
		this.buffer = buffer;
		if (nbrvehiculeparmin == 0)
			nbrvehiculeparmin = 1;
		tempo = 60000 / nbrvehiculeparmin;
		typeVehiculeCreer = type;

	}

	public Vehicule CreerVehicule(boolean def) {

		Vehicule v;
		Paiement p = new Paiement(15, TypePaiement.CB);
		if (!def) {
			++i;
			float r1 = (float) (Math.random() * 100);
			boolean defectueux;

			if (r1 > 90) {
				defectueux = true;
			} else {
				defectueux = false;
			}
			v = new Vehicule(buffer, typeVehiculeCreer, defectueux, i, p);

			return v;
		} else {
			v = new Vehicule(buffer, typeVehiculeCreer, def, i, p);
			return v;
		}
	}

	public void setDef() {
		nbDefectueux++;
	}

	public void setTempo(int nbrVehiculeParMin) {
		if (nbrVehiculeParMin == 0)
			nbrVehiculeParMin = 1;
		this.tempo = 60000 / nbrVehiculeParMin;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		while (true) {
			if (!buffer.isFull()) {
				synchronized (buffer) {
					Vehicule v;
					if (nbDefectueux > 0) {
						v = CreerVehicule(true);
						nbDefectueux--;
					} else
						v = CreerVehicule(false);
					Rapport.getInstance().ajouterLigne(
							"Le vehicule(" + typeVehiculeCreer.getName()
									+ ") n " + v.getNumero()
									+ " arrive en station");
					buffer.depose(v);

				}
			} else {
				GestionnaireAlarme.ajouterAlarme(new Alarme(TypeAlarme.Bouchon,
						"Trop de véhicule"));
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