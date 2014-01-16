package graphique;

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

import vehicule.ProducteurVehicule;

import barriere.BarrierePeage;
import barriere.FileAttente;
import vehicule.ProducteurVehicule;



/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class InterfaceReglage extends JScrollPane implements ActionListener {

	private Box boite = Box.createVerticalBox();
	private InterfacePeage m_peage; 
	private InterfaceInfo m_info; 
	/*private ProducteurVehicule m_vehi;*/
	private FileAttente File = BarrierePeage.getInstance().getFileAttente();
	
	private JButton boutonAjout = new JButton("Ajout borne");
	private JButton boutonSuppr = new JButton("Suppression borne");
	private JButton boutonFilePlus= new JButton(" + file d'attente");
	private JButton boutonFileMoins= new JButton(" - file d'attente");
	private JButton boutonDebitVPlus= new JButton(" + debit voiture");
	private JButton boutonDebitCPlus= new JButton(" + debit camion");
	private JButton boutonDebitVMoins= new JButton(" - debit voiture");
	private JButton boutonDebitCMoins= new JButton(" - debit camion");
	private JButton boutonDebitMPlus= new JButton(" + debit moto");
	private JButton boutonDebitMMoins= new JButton(" - debit moto");
	private JButton boutonDefectueux= new JButton("Vehicule defectueux");
	
	private SpinnerNumberModel model;
	private JSpinner spinnerSuppr;
	
	
	public InterfaceReglage(InterfacePeage peage, InterfaceInfo info/*, ProducteurVehicule vehi*/) {
		m_peage = peage;
		m_info = info;
		/*m_vehi = vehi;*/

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
		
		boutonDebitMPlus.addActionListener(this);
		boite.add(boutonDebitMPlus);
		
		boutonDebitMMoins.addActionListener(this);
		boite.add(boutonDebitMMoins);
		
		boutonDefectueux.addActionListener(this);
		boite.add(boutonDefectueux);
		
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
			BarrierePeage.getInstance().DebitVPlus();
			m_info.DebitVPlus();
			m_info.revalidate();
			m_info.repaint();
		}
		

		else if(e.getSource() == boutonDebitCPlus) {
			BarrierePeage.getInstance().DebitCPlus();
			m_info.DebitCPlus();
			m_info.revalidate();
			m_info.repaint();
		}
		

		else if(e.getSource() == boutonDebitVMoins) {
			BarrierePeage.getInstance().DebitVMoins();
			m_info.DebitVMoins();
			m_info.revalidate();
			m_info.repaint();
		}
		

		else if(e.getSource() == boutonDebitCMoins) {
			BarrierePeage.getInstance().DebitCMoins();
			m_info.DebitCMoins();
			m_info.revalidate();
			m_info.repaint();
		}
		
		else if(e.getSource() == boutonDebitMPlus) {
			BarrierePeage.getInstance().DebitMPlus();
			m_info.DebitMPlus();
			m_info.revalidate();
			m_info.repaint();
		}
		
		else if(e.getSource() == boutonDebitMMoins) {
			BarrierePeage.getInstance().DebitMMoins();
			m_info.DebitMMoins();
			m_info.revalidate();
			m_info.repaint();
		}
	
/*
		else if(e.getSource() == boutonDefectueux) {
			m_vehi.setDef();
		}*/
	}
	
}