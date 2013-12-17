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
 * @author GaÃ«tan Le BarbÃ© gaetan.lebarbe@ecole.ensicaen.fr
 * @version 0.0.1
 * @date 28 mars 2013
 */
package prototype;

/**
 * @author Meunier Guillaume 
 * 
 */
public class Borne extends Thread
{
	String				name;
	int					tempo;
	FileAttente	buffer;

	public Borne(int tempo, FileAttente buffer, String name)
	{
		this.name = name;
		this.tempo = tempo;
		this.buffer = buffer;
	}

	@Override
	public void run()
	{
		Object vehicule;
		while (true)
		{
			synchronized (buffer)
			{
				vehicule = buffer.accepteVehicule();
			}
			if (null != vehicule)
			{
				System.out.println(name + ": traite le vehicule n°" + vehicule);
				try 
				{
					Thread.sleep(tempo);
				} catch (InterruptedException e) 
				{
			
					e.printStackTrace();
				}
				System.out.println("Vehicule n°" + vehicule + " : Payment accepté.");
				try 
				{
					Thread.sleep(2000);
				} catch (InterruptedException e) 
				{
					e.printStackTrace();
				}
			}
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
