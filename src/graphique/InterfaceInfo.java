package graphique;

import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import barriere.BarrierePeage;


public class InterfaceInfo extends JScrollPane {
	
	private Box boite = Box.createVerticalBox();
	
	private static int taille_file = BarrierePeage.getInstance().getSize();
	private static int debit_V = BarrierePeage.getInstance().getDebitV();
	private static int debit_C = BarrierePeage.getInstance().getDebitC();
	private static int debit_M = BarrierePeage.getInstance().getDebitM();
	
	public InterfaceInfo() {

		
		setViewportView(boite);
		
		boite.add(new JLabel("Informations"));

		boite.add(new JLabel("Taille de la file d'attente :" + taille_file));
		
		boite.add(new JLabel("Debit Voiture :" + debit_V));
		
		boite.add(new JLabel("Debit Camion :" + debit_C));
		
		boite.add(new JLabel("Debit Camion :" + debit_M));
		
	}

	public void filePlus() {
		taille_file++;
	}
	
	public void fileMoins() {
		taille_file--;
	}

	public void DebitVPlus() {
		debit_V++;
	}
	
	public void DebitVMoins() {
		if (debit_V != 0) 
			debit_V--;
	}

	public void DebitCPlus() {
		debit_C++;
	}

	public void DebitCMoins() {
		if (debit_C != 0)
			debit_C--;
	}

	public void DebitMPlus() {
		debit_M++;
	}

	public void DebitMMoins() {
		if (debit_M != 0)
			debit_M--;
	}

}