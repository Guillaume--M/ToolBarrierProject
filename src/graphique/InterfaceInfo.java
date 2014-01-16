package graphique;

import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import barriere.BarrierePeage;


public class InterfaceInfo extends JScrollPane {
	
	private Box boite = Box.createVerticalBox();
	
	private int taille_file = BarrierePeage.getInstance().getSize();
	private int debit_V = BarrierePeage.getInstance().getDebitV();
	private int debit_C = BarrierePeage.getInstance().getDebitC();
	private int debit_M = BarrierePeage.getInstance().getDebitM();
	private static InterfaceInfo _instance ;
	private int nbV = 0;
	private int nbC = 0;
	private int nbM = 0;
	
	private JLabel file = new JLabel("Taille de la file d'attente :" + taille_file);
	private JLabel DV = new JLabel("Debit Voiture :" + debit_V);
	private JLabel DC = new JLabel("Debit Camion :" + debit_C);
	private JLabel DM = new JLabel("Debit Moto :" + debit_M);
	private JLabel NV = new JLabel("Nombre de Voiture: " + nbV);
	private JLabel NC = new JLabel("Nombre de   Moto : " + nbM);
	private JLabel NM = new JLabel("Nombre de Camion : " + nbC);
	
	public InterfaceInfo() {
		_instance = this;
		
		setViewportView(boite);
		
		boite.add(new JLabel("Informations"));

		boite.add(file);
		
		boite.add(DV);
		
		boite.add(DC);
		
		boite.add(DM);
		
		boite.add(NV);		
		
		boite.add(NC);
		
		boite.add(NM);
			
		
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
		if (debit_V != 0) {
			debit_V--;
			DV.setText("Debit Voiture :" + debit_V);
		}
	}

	public void DebitCPlus() {
		debit_C++;
		DC.setText("Debit Camion :" + debit_C);
	}

	public void DebitCMoins() {
		if (debit_C != 0) {
			debit_C--;
			DC.setText("Debit Camion :" + debit_C);
		}
	}

	public void DebitMPlus() {
		debit_M++;
		DM.setText("Debit Moto :" + debit_M);
	}

	public void DebitMMoins() {
		if (debit_M != 0) {
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