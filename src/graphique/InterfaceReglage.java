package graphique;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;


public class InterfaceReglage extends JScrollPane implements ActionListener {

	private Box boite = Box.createVerticalBox();
	private InterfacePeage m_peage; 
	
	private JButton boutonAjout = new JButton("Ajout borne");
	private JButton boutonSuppr = new JButton("Suppression borne");
	
	public InterfaceReglage(InterfacePeage peage) {
		m_peage = peage;
		
		setViewportView(boite); 
		
		boite.add(new JLabel("Reglages"));
		
		
		boutonAjout.addActionListener(this);
		boite.add(boutonAjout);
		
	
		boutonSuppr.addActionListener(this);
		boite.add(boutonSuppr);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == boutonAjout) {
			m_peage.ajoutBorne();
			m_peage.revalidate();
			m_peage.repaint();
		}
		else if(e.getSource() == boutonSuppr) {
			m_peage.supprBorne(3);
			m_peage.revalidate();	
			m_peage.repaint();
		}
	}
}
