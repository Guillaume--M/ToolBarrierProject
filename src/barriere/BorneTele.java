package barriere;

import types.*;

public class BorneTele extends Borne {

	private static int nombreTele = 0;

	/**
	 * Constructeur d'une borne automatique
	 * 
	 * @param buffer
	 *            La file d'attente auquel est assigne la borne
	 * @param type
	 *            Le type de borne que l'on construit
	 * @param stat
	 *            Etat ouvert/fermee de la borne
	 */
	public BorneTele(FileAttente buffer, TypeBorne type, boolean stat,
			String nam) {

		super(buffer, type, stat);
		numero = ++nombreTele;
	}

	/**
	 * @name Getter de nombreTele
	 * @return int Le nombre de bornes "Tele" crees
	 */
	public static int getNombre() {
		return nombreTele;
	}

}