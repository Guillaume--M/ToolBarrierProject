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
		int nombreDeBornes    = 4   ;
		int nMaxAvantBouchon  = 10  ;
		int tempoFluxVehicule = 500 ;
		int tempoBorne        = 7000 ;

		FileAttente buffer = new FileAttente(nMaxAvantBouchon);
		ProducteurVehicule fluxVehicule = new ProducteurVehicule(tempoFluxVehicule, buffer);
		
		Borne[] users = new Borne[nombreDeBornes];
		for (int i = 0; i < nombreDeBornes; i++)
		{
			users[i] = new Borne(tempoBorne, buffer, "Borne " + i);
		}
		
		fluxVehicule.start();
		
		for (int i = 0; i < nombreDeBornes; i++)
		{
			users[i].start();
			try 
			{
				Thread.sleep(1000);
			} catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}

}
