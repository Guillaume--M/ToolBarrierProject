package vehicule;

import comBarriereVehicule.TypeDePayement;
import comBarriereVehicule.Categorie;

abstract public class Vehicule {
	protected Payement payement;
	protected Categorie categorie;

	Vehicule(Payement p) {
		this.payement = p;
	}

	Categorie getCategorie() {
		return this.categorie;
	}

	TypeDePayement getTypedePayement() {
		return this.payement.getTypeDePayement();
	}

}
