package graphique;

import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import barriere.GestionnaireAlarme;


public class InterfaceAlarme extends JScrollPane {
	
	private static JPanel pane = new JPanel();
	
	
	public InterfaceAlarme() {
		super(pane);
		
		pane.add(new JLabel("Alarme"));
		pane.add(GestionnaireAlarme._jta);
		//pane.remove();
		
	}

}