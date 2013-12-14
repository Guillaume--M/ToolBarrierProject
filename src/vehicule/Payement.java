package vehicule;

import comBarriereVehicule.TypeDePayement;

public class Payement {
	private double _somme;
	private TypeDePayement _typepayement;

	Payement(double s, TypeDePayement p) {
		_somme = s;
		_typepayement = p;
	}

	public double getSomme() {
		return _somme;
	}

	public TypeDePayement getTypeDePayement() {
		return _typepayement;
	}

	public boolean solvable(double prix) {
		return this._somme < prix;
	}

}
