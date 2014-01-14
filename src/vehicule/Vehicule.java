package vehicule;

import types.TypeVehicule;
import types.*;

public abstract class Vehicule {
	public int _numero;
	protected Payement _payement;
	protected TypeVehicule _categorie;
	public boolean _defectueux;

	public Vehicule(int i,Payement p) {
		_numero = i;
		_payement = p;
	}

	public Vehicule(int i,Payement p,boolean defectueux) {
		_numero = i;
		_payement = p;
		_defectueux = defectueux;
	}
	public TypeVehicule getCategorie() {
		return _categorie;
	}

	public Payement getTypedePayement() {
		return _payement;
	}
	
	public boolean getDefectuosite(){
		return _defectueux;
	}
	
	public int getNumero(){
		return _numero;
	}
	
	
	

}
