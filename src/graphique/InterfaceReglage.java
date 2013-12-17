package graphique;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;


public class InterfaceReglage extends JScrollPane {

	private static JPanel pane = new JPanel();
	
	public InterfaceReglage() {
		super(pane);
		
		pane.add(new JLabel("Reglages"));
	}
}
