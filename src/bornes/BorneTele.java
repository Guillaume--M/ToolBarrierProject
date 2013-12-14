package bornes;

import comBarriereVehicule.*;

public final class BorneTele extends Borne {

	/**
	 * Constructeur d'une Borne Télépéage
	 * 
	 * @param price
	 *            Le prix à payer pour passer cette borne
	 * @param c
	 *            type de vehicule accepté par la borne
	 */
	public BorneTele(int price, Categorie c) {
		super(price);
		_acceptedVehiculeType = c;
		this.addBorne();
	}

	// pas le droit de repasser avec le meme badge avant un timer
	// gabarit permettant uniquement au voitures de passer
	// bouton 'alarme déclenchable par l'usager

	// avant d'encaisser il faut test si ils paient avec le bon type de paiement
	// assez de sous ?
	// if paiement ok >> _statusBarrier = true;
	// >> _statusBandeau = true;
	// vehicule.monnaie >= tarif)

}
