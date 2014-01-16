package graphique;

import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

import barriere.GestionnaireAlarme;
import barriere.Rapport;

/**
 * 
 * @author Bruyère Julien
 * @version 1.0
 *
 */
public class InterfaceAlarme extends JPanel {
	
	private JScrollPane panel = new JScrollPane(GestionnaireAlarme._jta);
	private JLabel titre = new JLabel("Alarmes");
	
	
	public InterfaceAlarme() {
		
		this.setLayout(new BorderLayout()); 
		
		titre.setHorizontalAlignment(SwingConstants.CENTER);
		 
		this.add(titre, BorderLayout.NORTH);
		this.add(panel, BorderLayout.CENTER);
		
		this.setVisible(true);

	}

}