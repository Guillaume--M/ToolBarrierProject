package graphique;

import java.awt.BorderLayout;
import java.awt.LayoutManager;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

import barriere.Rapport;

/**
 * 
 * @author Bruyère Julien
 * @version 1.0
 *
 */
public class InterfaceRapport extends JPanel {

	private JScrollPane panel = new JScrollPane(Rapport.getInstance()._jta);
	private JButton bouton= new JButton("Imprimer");
	private JLabel titre = new JLabel("Rapport en temps réél");

	public InterfaceRapport() {

		this.setLayout(new BorderLayout());
		
		titre.setHorizontalAlignment(SwingConstants.CENTER);
		
		bouton.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent evt) {
				Rapport.getInstance().creerFichier();
			}
		});
		
		
		panel.setMaximumSize(this.getPreferredSize());
		
		this.add(titre, BorderLayout.NORTH);
		this.add(panel, BorderLayout.CENTER);
		this.add(bouton, BorderLayout.SOUTH);
		
		this.setVisible(true);
	}
}