package vehicule;

import comBarriereVehicule.Categorie;

public class PoidLourd extends Vehicule {
	PoidLourd(Payement p) {
		super(p);
		_categorie = Categorie.PoidLourd;
	}

}
