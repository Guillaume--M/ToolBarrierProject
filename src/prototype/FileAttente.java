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
public class FileAttente
{
	int		size, currentPut, currentGet;
	boolean	full;
	boolean	empty;
	Object	tab[];

	public FileAttente(int size)
	{
		this.size = size;
		tab = new Object[size];
		currentGet = -1;
		currentPut = 0;
		full = false;
		empty = true;
	}

	public void depose(Object o)
	{
		if (full)
		{
			System.out.println("Trop de v�hicules en attente : Bouchon");
			return;
		}
		tab[currentPut] = o;
		currentPut = (currentPut + 1) % size;
		if (currentGet == currentPut)
		{
			full = true;
		}
		empty = false;
	}

	public Object accepteVehicule()
	{
		if (empty)
		{
			System.out.println("Borne libre en attente");
			return null;
		}
		currentGet = (currentGet + 1) % size;
		if (currentGet == currentPut)
		{
			empty = true;
		}
		full = false;
		return tab[currentGet];
	}

	public boolean isFull()
	{
		return full;
	}
}
