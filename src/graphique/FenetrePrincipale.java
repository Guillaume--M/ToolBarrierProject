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

public class FenetrePrincipale extends JFrame {
	
	private InterfaceInfo info = new InterfaceInfo();
	private InterfaceAlarme alarme = new InterfaceAlarme();
	private InterfacePeage peage = new InterfacePeage(5);
	private InterfaceRapport rapport = new InterfaceRapport();
	private InterfaceReglage reglage = new InterfaceReglage(peage);
	
	
	public FenetrePrincipale(int longueur, int hauteur) {

		
		setTitle("Simulateur de barrière de péage");
		setSize(longueur, hauteur);
		setLocationRelativeTo(null);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	    
	    JSplitPane splitAR = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, alarme, reglage);
	    splitAR.setDividerLocation(longueur/4);
	    
	    JSplitPane splitIA = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, info, splitAR);
	    splitIA.setDividerLocation(longueur/4);
	    
	    JSplitPane splitPI = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, peage, splitIA);
	    splitPI.setDividerLocation(longueur/4);
	    
	    JSplitPane splitRapport = new JSplitPane(JSplitPane.VERTICAL_SPLIT, splitPI, rapport);
	    splitRapport.setDividerLocation(hauteur-250);
	    
	    
	    getContentPane().add(splitRapport, BorderLayout.CENTER);
	    setVisible(true);
	}
}
