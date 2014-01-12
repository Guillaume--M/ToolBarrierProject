package prototype;

import comBarriereVehicule.TypeBorne;

public class BorneManuel extends Borne {

	private static int nombreManuel = 0;

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
	public BorneManuel(FileAttente buffer, TypeBorne type, boolean stat,
			String nam) {

		super(buffer, type, stat);
		numero = ++nombreManuel;
	}

	/**
	 * @name Getter du nombreManuel
	 * @return int Le nombre de bornes "Manuel" crees
	 */
	public static int getNombre() {
		return nombreManuel;
	}

}
