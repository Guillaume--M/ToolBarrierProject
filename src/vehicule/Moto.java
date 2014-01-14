package vehicule;

import types.*;

public class Moto extends Vehicule {
	public Moto(int i,Payement p) {
		super(i,p);
		_categorie = TypeVehicule.Moto;
	}
	
	public Moto(int i,Payement p,boolean defectueux){
		super(i,p,defectueux);
		_categorie = TypeVehicule.Moto;
	}

}
