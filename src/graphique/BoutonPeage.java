package graphique;

import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import types.TypeBorne;

import barriere.BarrierePeage;

/**
 * 
 * @author Bruyère Julien
 * @version 1.0
 *
 */
public class BoutonPeage extends JButton implements ActionListener {

	private ArrayList<ImageIcon> m_image = new ArrayList<ImageIcon>();
	private int m_numeroImage, m_numeroBorne, m_typeBouton;
	
	
	public BoutonPeage(int numeroImage, ArrayList<String> cheminImage, int numeroBorne, int typeBouton) {
		
		m_numeroImage = numeroImage;
		m_numeroBorne = numeroBorne;
		m_typeBouton = typeBouton;
		
		for(int i=0; i < cheminImage.size(); ++i)
			m_image.add(new ImageIcon(cheminImage.get(i)));

		
		setIcon(m_image.get(numeroImage));
		setMargin(new Insets(0, 0, 0, 0));
		addActionListener(this);
	}
	
	
	public void prochaineImage() {
		m_numeroImage++;
		if(m_image.size() <= m_numeroImage) {
			m_numeroImage = 0;
		}
		
		setIcon(m_image.get(m_numeroImage));
	}
	
	public void actionPerformed(ActionEvent arg0) {
		prochaineImage();
		
		if(m_typeBouton == 0)
			BarrierePeage.getInstance().getBorne(m_numeroBorne).setStatus(!BarrierePeage.getInstance().getBorne(m_numeroBorne).getStatus());
		else if(m_typeBouton == 2) {
			if(m_numeroImage == 0)
				BarrierePeage.getInstance().changeBorne(m_numeroBorne, TypeBorne.Manuel);
			else if(m_numeroImage == 1)
				BarrierePeage.getInstance().changeBorne(m_numeroBorne, TypeBorne.Tele);
			else if(m_numeroImage == 2)
					BarrierePeage.getInstance().changeBorne(m_numeroBorne, TypeBorne.Auto);
		}
		
	}
}