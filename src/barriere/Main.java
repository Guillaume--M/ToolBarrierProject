/* 
 * ENSICAEN
 * 6 Boulevard Marechal Juin 
 * F-14050 Caen Cedex 
 *
 * This file is owned by ENSICAEN students.
 * No portion of this document may be reproduced, copied
 * or revised without written permission of the authors.
 */
/**
 * @author Meunier Guillaume 
 * 
 */
package barriere;

import javax.swing.SwingUtilities;
import graphique.FenetrePrincipale;
import graphique.Fenetre_Reglages;

public class Main
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Fenetre_Reglages inst = new Fenetre_Reglages();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}

}

