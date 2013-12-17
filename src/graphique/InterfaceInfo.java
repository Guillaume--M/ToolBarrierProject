package graphique;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class InterfaceInfo extends JScrollPane {
	
	private static JPanel pane = new JPanel();
	
	public InterfaceInfo() {
		super(pane);
		
		pane.add(new JLabel("Informations"));

	}
}
