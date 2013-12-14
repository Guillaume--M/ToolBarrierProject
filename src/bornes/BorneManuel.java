package bornes;

import comBarriereVehicule.*;

/**
 * 
 * @author slavnic/gazquez
 * @TODO - gérer les véhicule spéciaux ac le pass
 * 
 */
public final class BorneManuel extends Borne {

	// Superviseur.setAlarme(Alarme.monnaie);

	/**
	 * Constructeur d'une Borne Manuelle
	 * 
	 * @param price
	 *            Le prix à payer pour passer cette borne
	 * @param c
	 *            type de vehicule accepté par la borne
	 */
	public BorneManuel(int price, Categorie c) {
		super(price);
		_acceptedVehiculeType = c;
		this.addBorne();
	}

	// Alarme boutonAlarme;
	// push count systeme de gestion

	// avant d'encaisser il faut test si ils paient avec le bon type de paiement
	// if paiement ok >> _statusBarrier = true;
	// >> _statusBandeau = true;
	// vehicule.monnaie >= tarif)

}
