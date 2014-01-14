package types;

import java.util.ArrayList;

public enum TypeVehicule {

	Moto("Moto", false), Voiture("Voiture", false), PoidLourd("PoidLourd",
			false);

	private boolean defecteux = false;
	private String name = "";
	private ArrayList<TypePaiement> paiementPossede;

	/**
	 * @param temp
	 *            La temporisation d'un vehicule
	 * @param nom
	 *            Le "type" de vehicule sous forme d'une String
	 */
	TypeVehicule(String nom, boolean sta) {

		this.name = nom;
		setDefecteux(sta);
		paiementPossede = new ArrayList<TypePaiement>();
		this.majPaiement(nom);
	}

	/**
	 * Getter de name
	 * 
	 * @return String Le "type" de vehicule sous forme d'une String
	 */
	public String getName() {
		return name;
	}

	/**
	 * Adaptateur d'ajout de ArrayList<> vers ArrayList<TypePaiement>
	 * 
	 * @param type
	 *            Le type de paiement a ajouter
	 */
	private void addPaiement(TypePaiement type) {
		paiementPossede.add(type);
	}

	/**
	 * Met a jour les paiement que le vehicule possede *
	 * 
	 * @param nom
	 *            Le "type" de vehicule sous forme d'une String
	 */
	private void majPaiement(String nom) {

		if (nom.equals(Moto)) {
			addPaiement(TypePaiement.Monnaie);
		} else if (nom.equals(Voiture)) {
			addPaiement(TypePaiement.CB);
		} else if (nom.equals(PoidLourd)) {
			addPaiement(TypePaiement.Telepayage);
		}
	}

	public boolean isDefecteux() {
		return defecteux;
	}

	public void setDefecteux(boolean defecteux) {
		this.defecteux = defecteux;
	}

}