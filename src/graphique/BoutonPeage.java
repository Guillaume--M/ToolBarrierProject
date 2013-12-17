package graphique;

import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;


public class BoutonPeage extends JButton implements ActionListener {

	private ArrayList<ImageIcon> image = new ArrayList<ImageIcon>();
	private int numeroImage;
	
	public BoutonPeage(int numero, ArrayList<String> cheminImage) {
		
		numeroImage = numero;
		
		for(int i=0; i < cheminImage.size(); ++i)
			image.add(new ImageIcon(cheminImage.get(i)));

		
		setIcon(image.get(numeroImage));
		setMargin(new Insets(0, 0, 0, 0));
		addActionListener(this);
	}
	
	
	public void prochaineImage() {
		numeroImage++;
		if(image.size() <= numeroImage) {
			numeroImage = 0;
		}
		
		setIcon(image.get(numeroImage));
	}
	
	public void actionPerformed(ActionEvent arg0) {
		prochaineImage();
	}
}
