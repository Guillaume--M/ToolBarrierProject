package graphique;

import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class InterfacePeage extends JScrollPane {

	private Box boite = Box.createVerticalBox();
	public JLabel titre = new JLabel("Liste bornes");
	
	private ArrayList<Peage> bornes = new ArrayList<Peage>();
	private int nbBorne;
	
	
	public InterfacePeage(int nbBorneDefaut) {
		nbBorne = nbBorneDefaut;
		
		setViewportView(boite); 
		
		boite.add(titre);
		
		for(int i=0; i<nbBorne; ++i)
	    	bornes.add(new Peage(0,0,0));
		
		for(int i=0; i<nbBorne; ++i)
	    	boite.add(bornes.get(i));
	}
	
	public void ajoutBorne() {
		bornes.add(new Peage(0,0,0));
		nbBorne++;
		boite.add(bornes.get(nbBorne-1));
	}
	
	public void supprBorne(int i) {
		remove(bornes.get(i));
		nbBorne--;
	}
}
