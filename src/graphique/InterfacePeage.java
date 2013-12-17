package graphique;

import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.JScrollPane;

public class InterfacePeage extends JScrollPane {

	private ArrayList<Peage> bornes = new ArrayList<Peage>();
	
	public InterfacePeage() {
		
		Box boite = Box.createVerticalBox();
		setViewportView(boite); 
		
		for(int i=0; i<11; ++i)
	    	bornes.add(new Peage(0,0,0));
		
		for(int i=0; i<11; ++i)
	    	boite.add(bornes.get(i));
	}
}
