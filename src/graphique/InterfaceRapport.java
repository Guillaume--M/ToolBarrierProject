package graphique;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import barriere.Rapport;


public class InterfaceRapport extends JScrollPane {

	private static JPanel pane = new JPanel();
	private static JButton bouton= new JButton("Imprimer");
	private static JTextArea texte;
	
	public InterfaceRapport() {
		super(pane);
		
		//Rapport.ajouterObservateur(texte);
		pane.add(Rapport.getInstance()._jta);
		

		bouton.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent evt) {
				Rapport.getInstance().creerFichier();
			}
		});
		pane.add(bouton);
	}
}