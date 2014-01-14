package vehicule;

import types.TypeVehicule;

import types.*;

public class Voiture extends Vehicule{

	public Voiture(int i,Payement p) {
		super(i,p);
		_categorie = TypeVehicule.Voiture;
	}
	
	public Voiture(int i,Payement p,boolean defectueux){
		super(i,p,defectueux);
		_categorie = TypeVehicule.Voiture;
	}

}
