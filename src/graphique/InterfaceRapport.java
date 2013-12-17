package graphique;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;


public class InterfaceRapport extends JScrollPane {

	private static JPanel pane = new JPanel();
	
	public InterfaceRapport() {
		super(pane);
		
		pane.add(new JLabel("Rapport"));
	}
}
