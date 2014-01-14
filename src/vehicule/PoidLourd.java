package vehicule;

import types.*;

public class PoidLourd extends Vehicule {
	PoidLourd(int i,Payement p) {
		super(i,p);
		_categorie = TypeVehicule.PoidLourd;
	}

	public PoidLourd(int i,Payement p,boolean defectueux){
		super(i,p,defectueux);
		_categorie = TypeVehicule.PoidLourd;
	}
}
