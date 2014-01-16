package vehicule;

import types.TypePaiement;

public class Paiement {
	TypePaiement _tp;
	float _somme;
	
	public Paiement(float somme,TypePaiement tp){
		_tp = tp;
		_somme = somme;
	}
	
	public float getSomme(){
		return _somme;
	}
	
	public TypePaiement getTypePaiement(){
		return _tp;
	}
}
