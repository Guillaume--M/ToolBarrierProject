package barriere;

import java.util.ArrayList;
import types.TypeVehicule;
import vehicule.ProducteurVehicule;

public class Trafic {

	private ArrayList<ProducteurVehicule> trafic;
	FileAttente buffer;

	public Trafic(int[] nbrVehiculeParMinute, FileAttente buffer) {

		trafic = new ArrayList<ProducteurVehicule>();
		this.buffer = buffer;
		addProducteur(nbrVehiculeParMinute[0], TypeVehicule.Voiture);
		addProducteur(nbrVehiculeParMinute[1], TypeVehicule.Moto);
		addProducteur(nbrVehiculeParMinute[2], TypeVehicule.PoidLourd);

		for (ProducteurVehicule tra : trafic) {

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			tra.start();
		}

	}

	public void addProducteur(int nbrParMinute, TypeVehicule type) {
		ProducteurVehicule prod = new ProducteurVehicule(nbrParMinute, type,
				buffer);
		trafic.add(prod);

	}

	public ProducteurVehicule getProducteurs(int i) {
		if (0 <= i && i <= 2) {
			return trafic.get(i);
		} else
			return null;

	}

	public void changeTempo(int tempoParMin, TypeVehicule type) {

		if (type == TypeVehicule.Moto) {
			trafic.get(1).setTempo(tempoParMin);
		}
		if (type == TypeVehicule.Voiture) {
			trafic.get(0).setTempo(tempoParMin);
		}
		if (type == TypeVehicule.PoidLourd) {
			trafic.get(2).setTempo(tempoParMin);
		}
	}

	public void motoDef() {
		trafic.get(1).setDef();
	}

	public void voitureDef() {
		trafic.get(0).setDef();
	}

	public void poidDef() {
		trafic.get(2).setDef();
	}

}
