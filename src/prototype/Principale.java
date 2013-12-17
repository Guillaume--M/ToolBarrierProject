package prototype;

public class Principale {

	public Principale(int nombreDeBornes, int nMaxAvantBouchon, int tempoFluxVehicule) {
		
		//config init
		/*
		int nombreDeBornes    = 4   ;
		int nMaxAvantBouchon  = 10  ;
		int tempoFluxVehicule = 1000 ;*/
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
