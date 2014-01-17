package graphique;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JSpinner;
import javax.swing.JTextPane;
import javax.swing.LayoutStyle;
import javax.swing.SpinnerNumberModel;
import javax.swing.WindowConstants;

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
	/**
	 * 
	 */
	private static final long serialVersionUID = 6320612613831002480L;
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
	private JSpinner Spinner_debit_M;
	private JTextPane Debit_M;
	private JSpinner Spinner_debit_camion;
	private JTextPane Debit_C;

	private JTextPane Bornes_manuelles;
	private JTextPane Ouvertes;

	private int Nb_bornes[] = { 1 , 1 , 1 };
	private int Debit_VCM[] = {1, 1, 1};
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
				Debit_V.setText("Nb de voiture par min : ");
			}
			{
				Valider = new JButton();
				Valider.setText("Valider");
				Valider.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						
						Nb_bornes[0] = (Integer)Spinner_bornes_manuelles.getValue();
						Nb_bornes[1] = (Integer)Spinner_bornes_telep.getValue();
						Nb_bornes[2] = (Integer)Spinner_bornes_auto.getValue();
						Debit_VCM[0] = (Integer)Spinner_debit_voiture.getValue();
						Debit_VCM[1] = (Integer)Spinner_debit_camion.getValue();
						Debit_VCM[2] = (Integer)Spinner_debit_M.getValue();
						
						BarrierePeage.getInstance(Nb_bornes, 
								(Integer)Spinner_taille_file.getValue(),
								Debit_VCM);
						
						new FenetrePrincipale(1200, 800);
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
				SpinnerNumberModel model = new SpinnerNumberModel(10, 10, 100, 1);
				Spinner_taille_file = new JSpinner(model);
			}
			{
				SpinnerNumberModel model = new SpinnerNumberModel(2, 0, 20, 1);
				Spinner_bornes_manuelles = new JSpinner(model);
			}
			{
				SpinnerNumberModel model = new SpinnerNumberModel(2, 0, 20, 1);
								
				Spinner_bornes_auto = new JSpinner(model);
				
			}
			{
				SpinnerNumberModel model = new SpinnerNumberModel(2, 0, 20, 1);
				Spinner_bornes_telep = new JSpinner(model);
			}
			{
				Bornes_manuelles = new JTextPane();
				Bornes_manuelles.setText("Nb de bornes manuelles :");
			}
			{
				Debit_M = new JTextPane();
				Debit_M.setText("Nb de moto par min :");
			}
			{
				Debit_C = new JTextPane();
				Debit_C.setText("Nb de camions par min :");
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
				SpinnerNumberModel model = new SpinnerNumberModel(30, 1, 500, 1);
				Spinner_debit_voiture = new JSpinner(model);
			}
			{
				SpinnerNumberModel model = new SpinnerNumberModel(30, 1, 500, 1);
				Spinner_debit_camion = new JSpinner(model);
			}
			{
				SpinnerNumberModel model = new SpinnerNumberModel(30, 1, 500, 1);
				Spinner_debit_M = new JSpinner(model);
			}
			thisLayout.setVerticalGroup(thisLayout.createSequentialGroup()
				.addContainerGap()
				.addGroup(thisLayout.createParallelGroup()
				    .addComponent(Spinner_bornes_manuelles, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(Bornes_manuelles, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(thisLayout.createParallelGroup()
				    .addComponent(Bornes_auto, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
				    .addComponent(Spinner_bornes_auto, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(thisLayout.createParallelGroup()
				    .addComponent(Spinner_bornes_telep, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(Bornes_tele, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(thisLayout.createParallelGroup()
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addComponent(Ouvertes, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
				        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED))
				    .addComponent(Spinner_taille_file, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
				.addGap(31)
				.addGroup(thisLayout.createParallelGroup()
				    .addComponent(Debit_V, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
				    .addComponent(Spinner_debit_voiture, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
				.addGroup(thisLayout.createParallelGroup()
				    .addComponent(Debit_C, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
				    .addComponent(Spinner_debit_camion, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
				.addGroup(thisLayout.createParallelGroup()
				    .addComponent(Debit_M, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
				    .addComponent(Spinner_debit_M, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
				.addGap(19)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(Annuler, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
				    .addComponent(Valider, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
				.addContainerGap(44, 44));
			thisLayout.setHorizontalGroup(thisLayout.createSequentialGroup()
				.addContainerGap()
				.addGroup(thisLayout.createParallelGroup()
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addComponent(Valider, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
				        .addGap(112))
				    .addComponent(Debit_C, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 227, GroupLayout.PREFERRED_SIZE)
				    .addComponent(Debit_V, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 227, GroupLayout.PREFERRED_SIZE)
				    .addComponent(Ouvertes, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 227, GroupLayout.PREFERRED_SIZE)
				    .addComponent(Bornes_tele, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 227, GroupLayout.PREFERRED_SIZE)
				    .addComponent(Bornes_auto, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 227, GroupLayout.PREFERRED_SIZE)
				    .addComponent(Bornes_manuelles, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 227, GroupLayout.PREFERRED_SIZE)
				    .addComponent(Debit_M, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 227, GroupLayout.PREFERRED_SIZE))
				.addGap(76)
				.addGroup(thisLayout.createParallelGroup()
				    .addGroup(thisLayout.createSequentialGroup()
				        .addGap(0, 0, Short.MAX_VALUE)
				        .addComponent(Spinner_debit_camion, GroupLayout.PREFERRED_SIZE, 268, GroupLayout.PREFERRED_SIZE))
				    .addGroup(thisLayout.createSequentialGroup()
				        .addGap(0, 0, Short.MAX_VALUE)
				        .addComponent(Spinner_debit_voiture, GroupLayout.PREFERRED_SIZE, 268, GroupLayout.PREFERRED_SIZE))
				    .addGroup(thisLayout.createSequentialGroup()
				        .addGap(0, 0, Short.MAX_VALUE)
				        .addComponent(Spinner_taille_file, GroupLayout.PREFERRED_SIZE, 268, GroupLayout.PREFERRED_SIZE))
				    .addGroup(thisLayout.createSequentialGroup()
				        .addGap(0, 0, Short.MAX_VALUE)
				        .addComponent(Spinner_bornes_telep, GroupLayout.PREFERRED_SIZE, 268, GroupLayout.PREFERRED_SIZE))
				    .addGroup(thisLayout.createSequentialGroup()
				        .addGap(0, 0, Short.MAX_VALUE)
				        .addComponent(Spinner_bornes_auto, GroupLayout.PREFERRED_SIZE, 268, GroupLayout.PREFERRED_SIZE))
				    .addGroup(thisLayout.createSequentialGroup()
				        .addGap(0, 0, Short.MAX_VALUE)
				        .addComponent(Spinner_bornes_manuelles, GroupLayout.PREFERRED_SIZE, 268, GroupLayout.PREFERRED_SIZE))
				    .addComponent(Spinner_debit_M, GroupLayout.Alignment.LEADING, 0, 268, Short.MAX_VALUE)
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addGap(0, 148, Short.MAX_VALUE)
				        .addComponent(Annuler, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)))
				.addContainerGap());

			pack();
			this.setSize(605, 360);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}

}