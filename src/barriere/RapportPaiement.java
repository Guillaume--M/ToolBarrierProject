package barriere;

import java.util.Iterator;
import java.util.Vector;

import types.TypeVehicule;
import vehicule.*;


public final class RapportPaiement {
	private static RapportPaiement _instance = new RapportPaiement();
	private int _paiment;
	private int _compteurVehicule;
	
	
	
	private RapportPaiement(){
		_paiment = 0;
		_compteurVehicule = 0;
	}
	
	public static RapportPaiement getInstance(){
		return _instance;
	}
	
	public int getNombreVehicule(){
		return _compteurVehicule;
	}
	
	public void enregisterInfos (int money){
		_paiment += money ;
		_compteurVehicule +=1;
	}
	
	public String getRapportPaiement(){
		String message = "";
/*		double total=0,cb=0,liquide=0,police=0,pompier=0,telepeage = 0;
		int p;
		
		Iterator<Payement> it = _paiment.iterator();
		while(it.hasNext()){
			p = it.next(); 
			total += p.getSomme();
			switch(p.getTypeDePayement()){
				case CB:
					cb+=p.getSomme();
					break;
				case Telepayage:
					telepeage+=p.getSomme();
					break;
				case Monnaie:
					liquide+=p.getSomme();
					break;
				case Gratuit_Pompier:
					pompier+=p.getSomme();
					break;
				case Gratuit_Policier:
					police+=p.getSomme();
					break;
				default:
					break;
			}
			
			message = "Rapport Payement :\n Total reçu :"+_paiment;
			message += "Pompier :"+pompier+"\nPolicier :"+police+"\n";	
			
	
		}*/
		return message;
	}
}
