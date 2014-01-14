package vehicule;

import types.*;

public class Payement {
	private double _somme;
	private TypePaiement _typepayement;

	public Payement(double s, TypePaiement p) {
		_somme = s;
		_typepayement = p;
	}

	public double getSomme() {
		return _somme;
	}

	public TypePaiement getTypeDePayement() {
		return _typepayement;
	}

	public boolean solvable(double prix) {
		return this._somme < prix;
	}

}
