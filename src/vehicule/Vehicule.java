package vehicule;

import comBarriereVehicule.Categorie;

public abstract class Vehicule {
	protected Payement _payement;
	protected Categorie _categorie;

	public Vehicule(Payement p) {
		_payement = p;
	}

	public Categorie getCategorie() {
		return _categorie;
	}

	public Payement getTypedePayement() {
		return _payement;
	}

}
