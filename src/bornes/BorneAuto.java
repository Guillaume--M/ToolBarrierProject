package bornes;

import comBarriereVehicule.*;

public final class BorneAuto extends Borne {

	/**
	 * Constructeur d'une Borne Automatique
	 * 
	 * @param price
	 *            Le prix à payer pour passer cette borne
	 * @param c
	 *            type de vehicule accepté par la borne
	 */
	public BorneAuto(int price, Categorie c) {
		super(price);
		_acceptedVehiculeType = c;
		this.addBorne();
	}
}

// gabarit permettant uniquement au voitures de passer
// bouton 'alarme déclenchable par l'usager

// avant d'encaisser il faut test si ils paient avec le bon type de paiement
// if paiement ok >> _statusBarrier = true;
// >> _statusBandeau = true;
// vehicule.monnaie >= tarif)
