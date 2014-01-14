package barriere;

import java.util.ArrayList;
import types.TypeVehicule;
import vehicule.ProducteurVehicule;

public class Traffic {

	private ArrayList<ProducteurVehicule> traffic;
	FileAttente buffer;
	

	public Traffic(int[] nbrVehiculeParMinute, FileAttente buffer) {

		traffic = new ArrayList<ProducteurVehicule>();
		this.buffer = buffer;
		addProducteur(nbrVehiculeParMinute[0], TypeVehicule.Voiture);
		addProducteur(nbrVehiculeParMinute[1], TypeVehicule.Moto);
		addProducteur(nbrVehiculeParMinute[2], TypeVehicule.PoidLourd);

		for (ProducteurVehicule tra : traffic) {

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
		traffic.add(prod);

	}
}
