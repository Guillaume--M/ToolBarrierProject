package graphique;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import types.TypeVehicule;
import barriere.BarrierePeage;
import barriere.FileAttente;



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
public class InterfaceReglage extends JPanel implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8970772166561881901L;
	private JLabel titre = new JLabel("Reglages");
	
	private InterfacePeage m_peage; 
	private InterfaceInfo m_info; 
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
	private JButton boutonVDefectueux= new JButton("V defectueuse");
	private JButton boutonCDefectueux= new JButton("C defectueuse");
	private JButton boutonMDefectueux= new JButton("M defectueuse");
	
	private SpinnerNumberModel model;
	private JSpinner spinnerSuppr;
	
	public InterfaceReglage(InterfacePeage peage, InterfaceInfo info) {
		m_peage = peage;
		m_info = info;
		
		
		ArrayList<Box> ligne = new ArrayList<Box>();
		int index = 0;
		
		
		titre.setHorizontalAlignment(SwingConstants.CENTER);
		ligne.add(Box.createHorizontalBox());
		ligne.get(index).add(titre);
		index++;
		

		boutonAjout.addActionListener(this);
		ligne.add(Box.createHorizontalBox());
		ligne.get(index).add(boutonAjout);
		index++;
		
		
		model = new SpinnerNumberModel(1, 1, m_peage.getNbBornes(), 1);
		spinnerSuppr = new JSpinner(model);
		
		boutonSuppr.addActionListener(this);
		ligne.add(Box.createHorizontalBox());
		ligne.get(index).add(boutonSuppr);
		ligne.get(index).add(spinnerSuppr);
		index++;
		
		
		Box ligneFile = Box.createHorizontalBox();
		
		boutonFilePlus.addActionListener(this);
		ligneFile.add(boutonFilePlus);

		boutonFileMoins.addActionListener(this);
		ligneFile.add(boutonFileMoins);
		
		ligne.add(ligneFile);
		index++;
		
		
		Box ligneDebitV = Box.createHorizontalBox();
		
		boutonDebitVPlus.addActionListener(this);
		ligneDebitV.add(boutonDebitVPlus);

		boutonDebitVMoins.addActionListener(this);
		ligneDebitV.add(boutonDebitVMoins);
		
		ligne.add(ligneDebitV);
		index++;
		
		
		Box ligneDebitC = Box.createHorizontalBox();
		
		boutonDebitCPlus.addActionListener(this);
		ligneDebitC.add(boutonDebitCPlus);

		boutonDebitCMoins.addActionListener(this);
		ligneDebitC.add(boutonDebitCMoins);
		
		ligne.add(ligneDebitC);
		index++;	
		
		
		Box ligneDebitM = Box.createHorizontalBox();
		
		boutonDebitMPlus.addActionListener(this);
		ligneDebitM.add(boutonDebitMPlus);

		boutonDebitMMoins.addActionListener(this);
		ligneDebitM.add(boutonDebitMMoins);
		
		ligne.add(ligneDebitM);
		index++;	
		
		
		Box ligneDefectueux = Box.createHorizontalBox();
		
		boutonVDefectueux.addActionListener(this);
		ligneDefectueux.add(boutonVDefectueux);
		
		ligneDefectueux.add(Box.createRigidArea(new Dimension(5, 0)));

		boutonCDefectueux.addActionListener(this);
		ligneDefectueux.add(boutonCDefectueux);
		
		ligneDefectueux.add(Box.createRigidArea(new Dimension(5, 0)));
		
		boutonMDefectueux.addActionListener(this);
		ligneDefectueux.add(boutonMDefectueux);
		
		ligne.add(ligneDefectueux);
		index++;	

		
		Box colonne = Box.createVerticalBox();
		colonne.add(ligne.get(0));
		colonne.add(Box.createRigidArea(new Dimension(0, 20)));
		
		for(int i=1; i<index; i++) {
			colonne.add(ligne.get(i));
			colonne.add(Box.createRigidArea(new Dimension(0, 5)));
		}
		
		this.add(colonne);
		this.setVisible(true);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		int debit;

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
			debit = BarrierePeage.getInstance().getDebitV() + 1 ;
			BarrierePeage.getInstance().setTempo(debit, TypeVehicule.Voiture);
			BarrierePeage.getInstance().setDebitV(debit);
			m_info.DebitVPlus();
			m_info.revalidate();
			m_info.repaint();
		}
		

		else if(e.getSource() == boutonDebitCPlus) {
			debit = BarrierePeage.getInstance().getDebitC() + 1 ;
			BarrierePeage.getInstance().setTempo(debit, TypeVehicule.PoidLourd);
			BarrierePeage.getInstance().setDebitC(debit);
			m_info.DebitCPlus();
			m_info.revalidate();
			m_info.repaint();
		}
		

		else if(e.getSource() == boutonDebitVMoins) {
			debit = BarrierePeage.getInstance().getDebitV() - 1 ;
			if (debit > 0) {
				BarrierePeage.getInstance().setTempo(debit, TypeVehicule.Voiture);
				BarrierePeage.getInstance().setDebitV(debit);
				m_info.DebitVMoins();
				m_info.revalidate();
				m_info.repaint();
			}
		}
		

		else if(e.getSource() == boutonDebitCMoins) {
			debit = BarrierePeage.getInstance().getDebitC() - 1 ;
			if (debit > 0) {
				BarrierePeage.getInstance().setTempo(debit, TypeVehicule.PoidLourd);
				BarrierePeage.getInstance().setDebitC(debit);
				m_info.DebitCMoins();
				m_info.revalidate();
				m_info.repaint();
			}
		}
		
		else if(e.getSource() == boutonDebitMPlus) {
			debit = BarrierePeage.getInstance().getDebitM() + 1 ;
			BarrierePeage.getInstance().setTempo(debit, TypeVehicule.Moto);
			BarrierePeage.getInstance().setDebitM(debit);
			m_info.DebitMPlus();
			m_info.revalidate();
			m_info.repaint();
		}
		
		else if(e.getSource() == boutonDebitMMoins) {
			debit = BarrierePeage.getInstance().getDebitM() - 1 ;
			if (debit > 0) {
				BarrierePeage.getInstance().setTempo(debit, TypeVehicule.Moto);
				BarrierePeage.getInstance().setDebitM(debit);
				m_info.DebitMMoins();
				m_info.revalidate();
				m_info.repaint();
			}
		}
	

		else if(e.getSource() == boutonVDefectueux) {
			BarrierePeage.getInstance().setDef(TypeVehicule.Voiture);
		}
		
		else if(e.getSource() == boutonCDefectueux) {
			BarrierePeage.getInstance().setDef(TypeVehicule.PoidLourd);
		}
		
		else if(e.getSource() == boutonMDefectueux) {
			BarrierePeage.getInstance().setDef(TypeVehicule.Moto);
		}
	}
	
}