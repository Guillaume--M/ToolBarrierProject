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
package prototype;

public class ProducteurVehicule extends Thread
{
	static int			i	= 0;
	int					tempo;
	FileAttente	buffer;

	public ProducteurVehicule(int tempo, FileAttente buffer)
	{
		this.tempo = tempo;
		this.buffer = buffer;
	}

	@Override
	public void run()
	{
		while (true)
		{
			if (!buffer.isFull())
			{
				synchronized (buffer)
				{
					i++;
					System.out.println("Le vehicule" + i + " arrive en station");
					buffer.depose(new Integer(i));
				}
			}
			else
			{
				System.err.println("BOUCHON! Trop de vehicules en attente !");
				try 
				{
					Thread.sleep(1000);
				} catch (InterruptedException e) 
				{
					e.printStackTrace();
				}
			}
			try
			{
				Thread.sleep(tempo);
			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}
