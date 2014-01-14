package graphique;

import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

import types.TypeBorne;

import barriere.BarrierePeage;

/**
 * 
 * @author Bruyère Julien
 * @version 1.0
 *
 */
public class InterfacePeage extends JScrollPane {

	private Box m_boite = Box.createVerticalBox();

	private ArrayList<Peage> m_bornesGraphiques = new ArrayList<Peage>();
	private int m_nbBorneTotal = 0;
	
	private BarrierePeage m_bornesPhysiques;
	
	
	public InterfacePeage() {
		m_bornesPhysiques = BarrierePeage.getInstance();
		
		int nbBorneManuel = m_bornesPhysiques.getNbManuel(); 
		int nbBorneTele = m_bornesPhysiques.getNbTele();
		int nbBorneAuto = m_bornesPhysiques.getNbAuto();
		
		
		setViewportView(m_boite); 
		
		m_boite.add(new JLabel("Liste bornes"));

		for(int i=0; i<nbBorneManuel; ++i) {
			m_nbBorneTotal++;
			if(m_bornesPhysiques.getBorne(i).getStatus())
				m_bornesGraphiques.add(new Peage(1,0,0, m_nbBorneTotal));
			else
				m_bornesGraphiques.add(new Peage(0,0,0, m_nbBorneTotal));
		}
		for(int i=0; i<nbBorneTele; ++i) {
			m_nbBorneTotal++;
			if(m_bornesPhysiques.getBorne(i).getStatus())
				m_bornesGraphiques.add(new Peage(1,0,1, m_nbBorneTotal)); 
			else
				m_bornesGraphiques.add(new Peage(0,0,1, m_nbBorneTotal));
		}
		for(int i=0; i<nbBorneAuto; ++i) {
			m_nbBorneTotal++;
			if(m_bornesPhysiques.getBorne(i).getStatus())
				m_bornesGraphiques.add(new Peage(1,0,2, m_nbBorneTotal));
			else
				m_bornesGraphiques.add(new Peage(0,0,2, m_nbBorneTotal));
		}
		
		for(int i=0; i<m_nbBorneTotal; ++i)
			m_boite.add(m_bornesGraphiques.get(i));
		for(int i=0; i<m_nbBorneTotal; ++i)
			m_boite.add(m_bornesGraphiques.get(i));
		for(int i=0; i<m_nbBorneTotal; ++i)
			m_boite.add(m_bornesGraphiques.get(i));
		
	}
	
	public void ajoutBorne() {
		
		/* Graphique */
		m_bornesGraphiques.add(new Peage(1,0,0, m_nbBorneTotal+1));
		m_nbBorneTotal++;
		m_boite.add(m_bornesGraphiques.get(m_nbBorneTotal-1));
		
		/* Physique */
		m_bornesPhysiques.addBorne(TypeBorne.Manuel);
	}
	
	public void supprBorne(int i) {
		
		/* Graphique */
		
		/* Efface les dernieres bornes graphiques */
		for(int j = i; j<m_nbBorneTotal; ++j)
			m_boite.remove(m_bornesGraphiques.get(j));
		
		/* Enleve la borne */
		m_bornesGraphiques.remove(i);
		m_nbBorneTotal--;
		
		/* Raffiche les dernieres bornes */
		for(int j = i; j<m_nbBorneTotal; ++j) {
			m_bornesGraphiques.get(j).modifNumero(j+1);
			m_boite.add(m_bornesGraphiques.get(j));
		}
		
		
		/* Physique */
		m_bornesPhysiques.removeBorne(i);
	}
	
	public int getNbBornes() {
		return m_nbBorneTotal;
	}
}