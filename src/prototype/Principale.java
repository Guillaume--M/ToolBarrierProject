package prototype;

public class Principale {

	public Principale(int nombreDeBornes, int nMaxAvantBouchon, int tempoFluxVehicule) {
		
		

		FileAttente buffer = new FileAttente(nMaxAvantBouchon);
		ProducteurVehicule fluxVehicule = new ProducteurVehicule(tempoFluxVehicule, buffer);
		
		Borne[] users = new Borne[nombreDeBornes];
		for (int i = 0; i < nombreDeBornes / 3; i++) {
			users[i] = new BorneAuto(buffer, "Borne Auto " + i);

		}

		for (int i = nombreDeBornes / 3; i < 2 * nombreDeBornes / 3; i++) {
			users[i] = new BorneTele(buffer, "Borne Tele " + i);
		}

		for (int i = 2 * nombreDeBornes / 3; i < nombreDeBornes; i++) {
			users[i] = new BorneManuel(buffer, "Borne Manuel " + i);
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
