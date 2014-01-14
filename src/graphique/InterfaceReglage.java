package graphique;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextPane;
import javax.swing.SpinnerNumberModel;

import barriere.BarrierePeage;
import barriere.FileAttente;



public class InterfaceReglage extends JScrollPane implements ActionListener {

	private Box boite = Box.createVerticalBox();
	private InterfacePeage m_peage; 
	private InterfaceInfo m_info; 
	private FileAttente File = BarrierePeage.getInstance().getFileAttente();
	
	private JButton boutonAjout = new JButton("Ajout borne");
	private JButton boutonSuppr = new JButton("Suppression borne");
	private JButton boutonFilePlus= new JButton("Incrementer la file d'attente");
	private JButton boutonFileMoins= new JButton("Décrementer la file d'attente");
	private JButton boutonDebitVPlus= new JButton("incrementer le debit de voiture");
	private JButton boutonDebitCPlus= new JButton("Incrementer le debit de camion");
	private JButton boutonDebitVMoins= new JButton("Decrementer le debit de voiture");
	private JButton boutonDebitCMoins= new JButton("Décrementer le debit de camion");
	
	
	private SpinnerNumberModel model;
	private JSpinner spinnerSuppr;
	
	
	public InterfaceReglage(InterfacePeage peage, InterfaceInfo info) {
		m_peage = peage;
		m_info = info;
		
		
		model = new SpinnerNumberModel(1, 1, m_peage.getNbBornes(), 1);
		spinnerSuppr = new JSpinner(model);
		
		
		setViewportView(boite); 
		
		boite.add(new JLabel("Reglages"));
		
		
		boutonAjout.addActionListener(this);
		boite.add(boutonAjout);
		
		
		JPanel suppr = new JPanel();
		
		boutonSuppr.addActionListener(this);
		suppr.add(boutonSuppr);
		suppr.add(spinnerSuppr);	
		
		boite.add(suppr);
		
		
		boutonFilePlus.addActionListener(this);
		boite.add(boutonFilePlus);
		boutonFilePlus.setPreferredSize(new java.awt.Dimension(216, 22));

		boutonFileMoins.addActionListener(this);
		boite.add(boutonFileMoins);
		
		boutonDebitVPlus.addActionListener(this);
		boite.add(boutonDebitVPlus);
		
		boutonDebitVMoins.addActionListener(this);
		boite.add(boutonDebitVMoins);

		boutonDebitCPlus.addActionListener(this);
		boite.add(boutonDebitCPlus);
		
		boutonDebitCMoins.addActionListener(this);
		boite.add(boutonDebitCMoins);
		
		
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == boutonAjout) {
			m_peage.ajoutBorne();
			m_peage.revalidate();
			m_peage.repaint();
			
			model = new SpinnerNumberModel(1, 1, m_peage.getNbBornes(), 1);
			spinnerSuppr.setModel(model);
		}
		
		else if(e.getSource() == boutonSuppr) {
			m_peage.supprBorne((Integer)spinnerSuppr.getValue()-1);
			m_peage.revalidate();	
			m_peage.repaint();
			
			model = new SpinnerNumberModel(1, 1, m_peage.getNbBornes(), 1);
			spinnerSuppr.setModel(model);
		}
		
		else if(e.getSource() == boutonFilePlus) {
			File.filplus();
			m_info.filePlus();
			m_info.revalidate();
			m_info.repaint();
		}
		
		else if(e.getSource() == boutonFileMoins) {
			File.filmoins();
			m_info.fileMoins();
			m_info.revalidate();
			m_info.repaint();
		}
		
		else if(e.getSource() == boutonDebitVPlus) {
			File.filplus();
			m_info.DebitVPlus();
			m_info.revalidate();
			m_info.repaint();
		}
		

		else if(e.getSource() == boutonDebitCPlus) {
			File.filplus();
			m_info.DebitCPlus();
			m_info.revalidate();
			m_info.repaint();
		}
		

		else if(e.getSource() == boutonDebitVMoins) {
			File.filplus();
			m_info.DebitVMoins();
			m_info.revalidate();
			m_info.repaint();
		}
		

		else if(e.getSource() == boutonDebitCMoins) {
			File.filplus();
			m_info.DebitCMoins();
			m_info.revalidate();
			m_info.repaint();
		}
	}
}