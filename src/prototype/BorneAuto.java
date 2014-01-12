package prototype;

import comBarriereVehicule.TypeBorne;

public class BorneAuto extends Borne {

	private static int nombreAuto = 0;

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
	public BorneAuto(FileAttente buffer, TypeBorne type, boolean stat,
			String nam) {
		super(buffer, type, stat);
		numero = ++nombreAuto;
	}

	/**
	 * @name Getter de nombreAuto
	 * @return int Le nombre de bornes "Auto" crees
	 */
	public static int getNombre() {
		return nombreAuto;
	}

}
