package graphique;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;

import barriere.BarrierePeage;

/**
 * 
 * @author Bruyère Julien
 * @version 1.0
 *
 */
public class FenetrePrincipale extends JFrame {
	
	
	public FenetrePrincipale(int longueur, int hauteur) {
		
		InterfaceInfo info = new InterfaceInfo();
		InterfaceAlarme alarme = new InterfaceAlarme();
		InterfaceRapport rapport = new InterfaceRapport();
		InterfacePeage peage = new InterfacePeage();
		InterfaceReglage reglage = new InterfaceReglage(peage, info);
		
		setTitle("Simulateur de barrière de péage");
		setSize(longueur, hauteur);
		setLocationRelativeTo(null);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	    
	    JSplitPane splitAR = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, alarme, reglage);
	    splitAR.setDividerLocation(longueur/5);
	    
	    JSplitPane splitIA = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, info, splitAR);
	    splitIA.setDividerLocation(longueur/5);
	    
	    JSplitPane splitPI = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, peage, splitIA);
	    splitPI.setDividerLocation(longueur/5);
	    
	    JSplitPane splitRapport = new JSplitPane(JSplitPane.VERTICAL_SPLIT, splitPI, rapport);
	    splitRapport.setDividerLocation(hauteur/2);
	    
	    
	    getContentPane().add(splitRapport, BorderLayout.CENTER);
	    setVisible(true);
	    
	}
}