package graphique;

import barriere.BarrierePeage;

/**
 * 
 * @author Bruyère Julien
 * @version 1.0
 * 
 * Classe de test
 *
 */
public class InterfacePrincipale {
	public static void main(String[] args) {
	
		int tab[] = {1,1,1};
		int tab2[] = {60,30,15};
		BarrierePeage.getInstance(tab, 10, tab2);
		new FenetrePrincipale(800, 600);
	}
}