package comBarriereVehicule;

import java.util.ArrayList;

public enum TypeBorne {

	Auto(8000, "Auto"), Manuel(12000, "Manuel"), Tele(3000, "Tele");

	private int tempo = 0;
	private String name = "";
	private ArrayList<TypePaiement> paiementAccepte;

	/**
	 * @param temp
	 *            La temporisation d'une borne
	 * @param nom
	 *            Le "type" de borne sous forme d'une String
	 */
	TypeBorne(int temp, String nom) {
		this.tempo = temp;
		this.name = nom;
		paiementAccepte = new ArrayList<TypePaiement>();
		this.majPaiement(nom);
	}

	/**
	 * Getter de tempo
	 * 
	 * @return int La temporisation d'une borne
	 */
	public int getTempo() {
		return tempo;
	}

	/**
	 * Getter de name
	 * 
	 * @return String Le "type" de borne sous forme d'une String
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
		paiementAccepte.add(type);
	}

	/**
	 * Met a jour les paiement que la borne autorise
	 * 
	 * @param nom
	 *            Le "type" de borne sous forme d'une String
	 */
	private void majPaiement(String nom) {

		if (nom.equals(Auto)) {
			addPaiement(TypePaiement.Monnaie);
			addPaiement(TypePaiement.CB);
			addPaiement(TypePaiement.Abonnement);
		} else if (nom.equals(Manuel)) {
			addPaiement(TypePaiement.CB);
			addPaiement(TypePaiement.Monnaie);
			addPaiement(TypePaiement.Abonnement);
		} else if (nom.equals(Tele)) {
			addPaiement(TypePaiement.Telepayage);
		}

	}

}
