package graphique;

import java.awt.Insets;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 * 
 * @author Bruyère Julien
 * @version 1.0
 *
 */
public class Peage extends Box {

	private JLabel m_numeroLabel;
	
	public Peage(int etat, int vehicule, int paiement, int numeroBorne){
		super(BoxLayout.X_AXIS);		
		
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
		
		BoutonPeage boutonEtat = new BoutonPeage(etat, cheminEtat, numeroBorne-1, 0);
		BoutonPeage boutonVehicule = new BoutonPeage(vehicule, cheminVehicule, numeroBorne-1, 1);
		BoutonPeage boutonPaiement = new BoutonPeage(paiement, cheminPaiement, numeroBorne-1, 2);
		
		m_numeroLabel = new JLabel("Borne n°" + numeroBorne + "  ");
		
		add(m_numeroLabel);
		add(boutonEtat);
		add(boutonVehicule);
		add(boutonPaiement);
	}
	
	public void modifNumero(int numeroBorne) {
		m_numeroLabel.setText("Borne n°" + numeroBorne + "  ");
	}
}