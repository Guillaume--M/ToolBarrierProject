package graphique;

import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;


public class InterfaceAlarme extends JScrollPane {
	
	private static JPanel pane = new JPanel();
	private ArrayList<JLabel> list = new ArrayList<JLabel>();
	
	public InterfaceAlarme() {
		super(pane);
		
		pane.add(new JLabel("Alarme"));
		pane.add(new JLabel("Bouchons"));
		//pane.remove();
		
	}

}
