package graphique;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

import barriere.BarrierePeage;

/**
 * @author Rodolphe Adam
 * @author Guillaume Meunier
 * @author Bruyère Julien
 * @version 1.0
 *
 */
public class InterfaceInfo extends JPanel {
	
	private JLabel titre = new JLabel("Informations");
	private Box conteneurInfos = Box.createVerticalBox();
	private JScrollPane scrollPane = new JScrollPane(conteneurInfos);
	
	private int taille_file = BarrierePeage.getInstance().getSize();
	private int debit_V = BarrierePeage.getInstance().getDebitV();
	private int debit_C = BarrierePeage.getInstance().getDebitC();
	private int debit_M = BarrierePeage.getInstance().getDebitM();
	private static InterfaceInfo _instance ;
	private int nbV = 0;
	private int nbC = 0;
	private int nbM = 0;
	
	private JLabel file = new JLabel("Taille de la file d'attente : " + taille_file);
	private JLabel DV = new JLabel("Debit Voiture : " + debit_V);
	private JLabel DC = new JLabel("Debit Camion : " + debit_C);
	private JLabel DM = new JLabel("Debit Moto : " + debit_M);
	private JLabel NV = new JLabel("Nombre de Voiture : " + nbV);
	private JLabel NC = new JLabel("Nombre de Moto : " + nbM);
	private JLabel NM = new JLabel("Nombre de Camion : " + nbC);
	
	public InterfaceInfo() {
		_instance = this;
		
		this.setLayout(new BorderLayout());
		
		titre.setHorizontalAlignment(SwingConstants.CENTER);
		this.add(titre, BorderLayout.NORTH);
		

		conteneurInfos.add(file);
		conteneurInfos.add(Box.createRigidArea(new Dimension(0, 10)));
		
		conteneurInfos.add(DV);
		conteneurInfos.add(Box.createRigidArea(new Dimension(0, 10)));
		
		conteneurInfos.add(DC);
		conteneurInfos.add(Box.createRigidArea(new Dimension(0, 10)));
		
		conteneurInfos.add(DM);
		conteneurInfos.add(Box.createRigidArea(new Dimension(0, 10)));
		
		conteneurInfos.add(NV);
		conteneurInfos.add(Box.createRigidArea(new Dimension(0, 10)));
		
		conteneurInfos.add(NC);
		conteneurInfos.add(Box.createRigidArea(new Dimension(0, 10)));
		
		conteneurInfos.add(NM);
		conteneurInfos.add(Box.createRigidArea(new Dimension(0, 10)));
		
		this.add(scrollPane, BorderLayout.CENTER);
	}

	public void filePlus() {
		taille_file++;
		file.setText("Taille de la file d'attente :" + taille_file);
	}
	
	public void fileMoins() {
		taille_file--;
		file.setText("Taille de la file d'attente :" + taille_file);
	}

	public void DebitVPlus() {
		debit_V++;
		DV.setText("Debit Voiture :" + debit_V);
	}
	
	public void DebitVMoins() {
		if (debit_V != 1) {
			debit_V--;
			DV.setText("Debit Voiture :" + debit_V);
		}
	}

	public void DebitCPlus() {
		debit_C++;
		DC.setText("Debit Camion :" + debit_C);
	}

	public void DebitCMoins() {
		if (debit_C != 1) {
			debit_C--;
			DC.setText("Debit Camion :" + debit_C);
		}
	}

	public void DebitMPlus() {
		debit_M++;
		DM.setText("Debit Moto :" + debit_M);
	}

	public void DebitMMoins() {
		if (debit_M != 1) {
			debit_M--;
			DM.setText("Debit Moto :" + debit_M);
		}
	}
	
	public void maj()
	{
		nbV = BarrierePeage.getInstance().getFileAttente().getNbVoiture();
		NV.setText("Nombre de Voiture: " + nbV);
		nbM = BarrierePeage.getInstance().getFileAttente().getNbMoto();
		NM.setText("Nombre de  Moto  : " + nbM);
		nbC = BarrierePeage.getInstance().getFileAttente().getNbPoidsLourd();
		NC.setText("Nombre de Camion : " + nbC);
		
	}
	public static InterfaceInfo getInstance()
	{
		return _instance;
	}
}