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
 * @author Gaëtan Le Barbé gaetan.lebarbe@ecole.ensicaen.fr
 * @version 0.0.1
 * @date 28 mars 2013
 */
package prototype;

import javax.swing.SwingUtilities;

import graphique.FenetrePrincipale;
import graphique.Fenetre_Reglages;

/**
 * @author Meunier Guillaume 
 * 
 */
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
