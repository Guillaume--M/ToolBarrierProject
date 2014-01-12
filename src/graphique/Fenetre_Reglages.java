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

import barriere.BarrierePeage;


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
	private JButton Annuler;
	private JButton Valider;
	private JSpinner Spinner_debit_voiture;
	private JSpinner Spinner_bornes_manuelles;
	private JSpinner Spinner_taille_file;
	private JSpinner Spinner_bornes_auto;
	private JSpinner Spinner_bornes_telep;
	private JTextPane Debit_V;
	private JTextPane Bornes_auto;
	private JTextPane Bornes_tele;

	private JTextPane Bornes_manuelles;
	private JTextPane Ouvertes;

	private int Nb_bornes[] = { 1 , 1 , 1 };
	private int tempo = 1000;
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
				Ouvertes = new JTextPane();
				Ouvertes.setText("Taille file voiture avant bouchon : ");
			}
			{
				Debit_V = new JTextPane();
				Debit_V.setText("Nb de voiture par sec : ");
			}
			{
				Valider = new JButton();
				Valider.setText("Valider");
				Valider.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						
						//Nb_bornes[0] = (Integer)Spinner_bornes_manuelles.getValue();
						//Nb_bornes[1] = (Integer)Spinner_bornes_telep.getValue();
						//Nb_bornes[2] = (Integer)Spinner_bornes_auto.getValue();
						//tempo		 = (1/(Integer)Spinner_debit_voiture.getValue())*1000;
						new BarrierePeage(Nb_bornes,
								(Integer)Spinner_taille_file.getValue(),
								tempo);
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
				SpinnerNumberModel model = new SpinnerNumberModel(10, 1, 100, 1);
				Spinner_taille_file = new JSpinner(model);
			}
			{
				SpinnerNumberModel model = new SpinnerNumberModel(5, 1, 20, 1);
				Spinner_bornes_manuelles = new JSpinner(model);
			}
			{
				SpinnerNumberModel model = new SpinnerNumberModel(5, 1, 20, 1);
								
				Spinner_bornes_auto = new JSpinner(model);
				
			}
			{
				SpinnerNumberModel model = new SpinnerNumberModel(5, 1, 20, 1);
				Spinner_bornes_telep = new JSpinner(model);
			}
			{
				Bornes_manuelles = new JTextPane();
				Bornes_manuelles.setText("Nb de bornes manuelles :");
			}
			{
				Bornes_auto = new JTextPane();
				Bornes_auto.setText("Nb de bornes auto :");
			}
			{
				Bornes_tele = new JTextPane();
				Bornes_tele.setText("Nb de bornes telep. : ");
			}
			
			
			{
				SpinnerNumberModel model = new SpinnerNumberModel(1, 1, 10, 1);
				Spinner_debit_voiture = new JSpinner(model);
			}
			thisLayout.setVerticalGroup(thisLayout.createSequentialGroup()
				.addContainerGap()
				.addGroup(thisLayout.createParallelGroup()
				    .addGroup(thisLayout.createSequentialGroup()
				        .addComponent(Bornes_manuelles, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
				        .addGap(0, 0, Short.MAX_VALUE))
				    .addGroup(thisLayout.createSequentialGroup()
				        .addGap(0, 0, Short.MAX_VALUE)
				        .addComponent(Spinner_bornes_manuelles, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)))
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(thisLayout.createParallelGroup()
				    .addComponent(Bornes_auto, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
				    .addComponent(Spinner_bornes_auto, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(thisLayout.createParallelGroup()
				    .addComponent(Spinner_bornes_telep, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(Bornes_tele, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
				.addGroup(thisLayout.createParallelGroup()
				    .addGroup(thisLayout.createSequentialGroup()
				        .addComponent(Spinner_taille_file, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
				        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED))
				    .addComponent(Ouvertes, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
				.addGroup(thisLayout.createParallelGroup()
				    .addGroup(thisLayout.createSequentialGroup()
				        .addComponent(Debit_V, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
				        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED))
				    .addComponent(Spinner_debit_voiture, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
				.addGap(0, 108, GroupLayout.PREFERRED_SIZE)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(Annuler, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
				    .addComponent(Valider, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
				.addContainerGap(37, 37));
			thisLayout.setHorizontalGroup(thisLayout.createSequentialGroup()
				.addContainerGap()
				.addGroup(thisLayout.createParallelGroup()
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addComponent(Valider, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
				        .addGap(112))
				    .addComponent(Debit_V, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 227, GroupLayout.PREFERRED_SIZE)
				    .addComponent(Ouvertes, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 227, GroupLayout.PREFERRED_SIZE)
				    .addComponent(Bornes_tele, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 227, GroupLayout.PREFERRED_SIZE)
				    .addComponent(Bornes_auto, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 227, GroupLayout.PREFERRED_SIZE)
				    .addComponent(Bornes_manuelles, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 227, GroupLayout.PREFERRED_SIZE))
				.addGap(160)
				.addGroup(thisLayout.createParallelGroup()
				    .addGroup(thisLayout.createSequentialGroup()
				        .addComponent(Annuler, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
				        .addGap(0, 0, Short.MAX_VALUE))
				    .addGroup(thisLayout.createSequentialGroup()
				        .addGap(0, 0, Short.MAX_VALUE)
				        .addComponent(Spinner_debit_voiture, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE))
				    .addComponent(Spinner_taille_file, GroupLayout.Alignment.LEADING, 0, 120, Short.MAX_VALUE)
				    .addGroup(thisLayout.createSequentialGroup()
				        .addComponent(Spinner_bornes_telep, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
				        .addGap(0, 0, Short.MAX_VALUE))
				    .addGroup(thisLayout.createSequentialGroup()
				        .addComponent(Spinner_bornes_auto, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
				        .addGap(0, 0, Short.MAX_VALUE))
				    .addComponent(Spinner_bornes_manuelles, GroupLayout.Alignment.LEADING, 0, 120, Short.MAX_VALUE))
				.addContainerGap(30, 30));
			pack();
			this.setSize(559, 359);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}

}
