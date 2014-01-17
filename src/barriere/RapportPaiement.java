package barriere;

import java.util.Iterator;
import java.util.Vector;
import vehicule.*;


public final class RapportPaiement {
	private static RapportPaiement _instance = new RapportPaiement();
	static Vector<Paiement> _paiement;
	private static  int _compteurVehicule;
	
	
	
	private RapportPaiement(){
		_paiement = new Vector<Paiement>();
		_compteurVehicule = 0;
		
	}
	
	public static RapportPaiement getInstance(){
		return _instance;
	}
	
	public int getNombreVehicule(){
		return _compteurVehicule;
	}
	
	public static void enregisterInfos (Vehicule v){
		_paiement.add(v.getPaiement());
		_compteurVehicule +=1;
	}
	
	public String getRapportPaiement(){
		String message = "";
		float total=0,cb=0,liquide=0,gratuit=0,telepeage = 0;
		Paiement p;
		
		Iterator<Paiement> it = _paiement.iterator();
		while(it.hasNext()){
			p = it.next(); 
			total += p.getSomme();
			switch(p.getTypePaiement()){
				case CB:
					cb+=p.getSomme();
					break;
				case Telepayage:
					telepeage+=p.getSomme();
					break;
				case Monnaie:
					liquide+=p.getSomme();
					break;
				case Gratuit:
					gratuit+=p.getSomme();
					break;
				default:
					break;
			}
			
			message = "Rapport Payement :\n Total reçu :"+total;
			message += "\n CB :"+cb+"\n Telepayage :"+telepeage+"\n liquide :"+liquide;
			message += "Vehicule privilégié (Pompier/Police) :"+gratuit;	
			
	
		}
		return message;
	}
}