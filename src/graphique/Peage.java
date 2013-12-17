package graphique;

import java.awt.Insets;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;


public class Peage extends Box {

	private static int m_numeroPeage = 0;
		
	public Peage(int etat, int vehicule, int paiement){
		super(BoxLayout.X_AXIS);
		m_numeroPeage++;		
		
		ArrayList<String> cheminEtat = new ArrayList<String>();
		cheminEtat.add("resources/croix.png");
		cheminEtat.add("resources/fleche.png");
		
		ArrayList<String> cheminVehicule = new ArrayList<String>();
		cheminVehicule.add("resources/voiture.png");
		cheminVehicule.add("resources/tout.png");
		
		ArrayList<String> cheminPaiement = new ArrayList<String>();
		cheminPaiement.add("resources/guichet.png");
		cheminPaiement.add("resources/telepeage.png");
		cheminPaiement.add("resources/CB.png");
		
		BoutonPeage boutonEtat = new BoutonPeage(etat, cheminEtat);
		BoutonPeage boutonVehicule = new BoutonPeage(vehicule, cheminVehicule);
		BoutonPeage boutonPaiement = new BoutonPeage(paiement, cheminPaiement);
		
		
		add(new JLabel("Borne n�" + m_numeroPeage));
		add(boutonEtat);
		add(boutonVehicule);
		add(boutonPaiement);
	}
}
