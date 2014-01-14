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
import vehicule.*;
import types.*;

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
	
	public Vehicule CreerVehicule(int i){
		Vehicule v;
		boolean defectueux;
		Payement p = new Payement(100,TypePaiement.CB);
		
		
		
		float r1 = (float) (Math.random()*100);
		float r2 = (float) (Math.random()*100);
		
		if(r2>90){
			defectueux = true;
		}
		else{
			defectueux = false;
		}
		
		if(r1<50){
			v = new Voiture(i,p,defectueux);
		}
		else if (r1<75){
			v = new PoidLourd(i,p,defectueux);
		}
		else{
			v = new Moto(i,p,defectueux);
		}
		
		return v;
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
					buffer.depose(this.CreerVehicule(i));
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
