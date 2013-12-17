package graphique;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.LayoutStyle;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerNumberModel;

import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;

import prototype.Principale;


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
public class Fenetre_Reglages extends javax.swing.JFrame {
	private JTextPane Bornes;
	private JButton Annuler;
	private JButton Valider;
	private JSpinner Spinner_debit_voiture;
	private JSpinner Spinner_bornes_ouvertes;
	private JSpinner Spinner_bornes_totales;
	private JTextPane Debit_V;
	private JTextPane Ouvertes;

	/**
	* Auto-generated main method to display this JFrame
	*/
	/*public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Fenetre_Reglages inst = new Fenetre_Reglages();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}*/
	
	public Fenetre_Reglages() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			GroupLayout thisLayout = new GroupLayout((JComponent)getContentPane());
			getContentPane().setLayout(thisLayout);
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			{
				Bornes = new JTextPane();
				Bornes.setText("Nombre de bornes : ");
			}
			{
				Ouvertes = new JTextPane();
				Ouvertes.setText("Taille file voiture : ");
			}
			{
				Debit_V = new JTextPane();
				Debit_V.setText("Debit de voiture : ");
			}
			{
				Valider = new JButton();
				Valider.setText("Valider");
				Valider.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
					
						new Principale((Integer)Spinner_bornes_totales.getValue(), 
								(Integer)Spinner_bornes_ouvertes.getValue(),
								(Integer)Spinner_debit_voiture.getValue());
					}
				});
			}
			{
				Annuler = new JButton();
				Annuler.setText("Fermer");
				Annuler.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						System.exit(0);
					}
				});

			}
			{
				SpinnerNumberModel model = new SpinnerNumberModel(5, 1, 20, 1);
				Spinner_bornes_totales = new JSpinner(model);
			}
			{
				SpinnerNumberModel model = new SpinnerNumberModel(10, 1, 100, 1);
				Spinner_bornes_ouvertes = new JSpinner(model);
			}
			{
				SpinnerNumberModel model = new SpinnerNumberModel(1000, 500, 10000, 500);
				Spinner_debit_voiture = new JSpinner(model);
			}
			thisLayout.setHorizontalGroup(thisLayout.createSequentialGroup()
				.addContainerGap()
				.addGroup(thisLayout.createParallelGroup()
				    .addComponent(Debit_V, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)
				    .addComponent(Ouvertes, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)
				    .addComponent(Bornes, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)
				    .addComponent(Valider, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE))
				.addGap(242)
				.addGroup(thisLayout.createParallelGroup()
				    .addComponent(Spinner_debit_voiture, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
				    .addComponent(Spinner_bornes_ouvertes, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
				    .addComponent(Spinner_bornes_totales, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
				    .addComponent(Annuler, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE))
				.addContainerGap(48, Short.MAX_VALUE));
			thisLayout.setVerticalGroup(thisLayout.createSequentialGroup()
				.addContainerGap(40, 40)
				.addGroup(thisLayout.createParallelGroup()
				    .addComponent(Bornes, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
				    .addComponent(Spinner_bornes_totales, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(thisLayout.createParallelGroup()
				    .addComponent(Ouvertes, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
				    .addComponent(Spinner_bornes_ouvertes, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(thisLayout.createParallelGroup()
				    .addComponent(Debit_V, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
				    .addComponent(Spinner_debit_voiture, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 104, GroupLayout.PREFERRED_SIZE)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(Valider, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(Annuler, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
				.addContainerGap());
			pack();
			this.setSize(559, 359);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}

}
