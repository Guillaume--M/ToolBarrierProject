package barriere;

import java.util.ArrayList;
import types.*;

public class BarrierePeage {

	private int nbrManuel;
	private int nbrTele;
	private int nbrAuto;

	private FileAttente file;
	private ProducteurVehicule fluxVehicule;

	private ArrayList<Borne> listeBorne;

	/**
	 * Constructeur du peage
	 * 
	 * @param lengh
	 *            le nombre de borne de chaque type sous la forme d'un tableau
	 *            de taille 3 (0=Manuel,1=Tele,2=Auto)
	 */
	public BarrierePeage(int[] lengh, int nMaxAvantBouchon, int nbVoiturePS) {

		file = new FileAttente(nMaxAvantBouchon);
		fluxVehicule = new ProducteurVehicule(nbVoiturePS, file);
		fluxVehicule.start();
		
		listeBorne = new ArrayList<Borne>();
		
		
		nbrManuel = lengh[0];
		for (int i = 0; i < nbrManuel; ++i)
			addBorne(TypeBorne.Manuel);

		nbrTele = lengh[1];
		for (int i = 0; i < nbrTele; ++i)
			addBorne(TypeBorne.Tele);

		nbrAuto = lengh[2];
		for (int i = 0; i < nbrAuto; ++i)
			addBorne(TypeBorne.Auto);
		
		
		
		for(Borne borne : listeBorne)
		{
			borne.start();
			try 
			{
				Thread.sleep(1000);
			} catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}

	}

	/**
	 * Adaptateur d'ajout de ArrayList<> vers ArrayList<Borne>
	 * 
	 * @param type
	 *            Le type de la borne a ajoute
	 * 
	 */
	public void addBorne(TypeBorne type) {

		Borne borne = new Borne(file, type, true);
		if (!listeBorne.add(borne))
			System.err.println("Borne non ajoutee");
		//borne.start();
	}

	/**
	 * Adaptateur de suppression de ArrayList<> vers ArrayList<Borne>
	 * 
	 * @param numeroDeLaBorne
	 *            Le numero de la borne a supprimer
	 */
	
	
	public void removeBorne(int numeroDeLaBorne) {
		if (numeroDeLaBorne >= 0 && numeroDeLaBorne <= listeBorne.size())
			listeBorne.remove(numeroDeLaBorne);
		else
			System.err.println("IndexTrop Grand");
	}

	/**
	 * Permet de modifier une borne en une autre
	 * 
	 * @param numeroDeLaBorne
	 *            Le numero de la borne a modifier
	 * @param type
	 *            Le type de borne dans lequel elle sera convertie
	 */
	public void changeBorne(int numeroDeLaBorne, TypeBorne type) {

		Borne borne = new Borne(file, type, true);
		listeBorne.set(numeroDeLaBorne, borne);
	}

}