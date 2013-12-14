package vehicule;

import comBarriereVehicule.Categorie;

public class Moto extends Vehicule {
	Moto(Payement p) {
		super(p);
		_categorie = Categorie.Moto;
	}

}
