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


import java.util.ArrayList;
import types.*;
import vehicule.*;

public class Borne extends Thread
{
	protected int tempo;
	protected int numero;
	protected boolean status;

	protected FileAttente buffer;

	protected ArrayList<TypePaiement> paiementAccepte;

	protected TypeBorne typeBorne;

	/**
	 * 
	 * Constructeur d'une borne
	 * 
	 * @param file
	 *            La file d'attente auquel est assign� la borne
	 * @param num
	 *            le numero de la borne
	 * @param temp
	 *            la temporisation de cette borne
	 */

	public Borne(FileAttente file, TypeBorne type, boolean sta) {
		tempo = type.getTempo();
		status = sta;
		buffer = file;
		paiementAccepte = new ArrayList<>();
		typeBorne = type;
	}

	/**
	 * Getter du tempo
	 * 
	 * @return int La tempo d'une borne
	 */
	public int getTempo() {
		return tempo;
	}

	/**
	 * Getter du numero
	 * 
	 * @return int Le numero d'une borne
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * Setter du status
	 * 
	 * @param stat
	 *            true=ouvert, false=ferme
	 */
	public void setStatus(boolean stat) {
		status = stat;
	}

	/**
	 * Getter du status
	 * 
	 * @return boolean La valeur du status
	 */
	public boolean getStatus() {
		return status;
	}

	/**
	 * @param type
	 *            Type de paiement que l'on veut tester
	 * @return bool true si la borne est capable de traiter ce format de
	 *         paiement
	 */
	public boolean testPaiement(TypePaiement type) {

		if (!status)
			return false;
		else {
			for (int i = 0; i < paiementAccepte.size(); ++i) {
				if (paiementAccepte.get(i).equals(type))
					return true;
			}
		}
		return false;
	}

	
	@Override
	public void run() {
		Vehicule vehicule;
		while (true) {
			synchronized (buffer) {
				vehicule = buffer.accepteVehicule();
			}
			if (null != vehicule) {
				System.out
						.println(typeBorne.getName() + ": traite le vehicule n" + vehicule.getNumero());
				try {
					if(vehicule.getDefectuosite()){
						System.out.println("Vehicule n " + vehicule.getNumero() + " : Voiture defectueuse.");
						Thread.sleep(20000);
						}
					Thread.sleep(tempo);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Vehicule n " + vehicule.getNumero()
						+ " : Paiement accepte.");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			else{
				System.out.println("Borne " + typeBorne.getName() + " libre");
				}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
