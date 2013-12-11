package bornes;
/**
 * 
 * @author slavnic/gazquez
 * @TODO 
 *  
 */
public final class BorneManuel extends Borne{
	
	public BorneManuel(){}
	
	// Alarme boutonAlarme;
	// push count systeme de gestion
	
	@Override
	public boolean encaisser() {
		//avant d'encaisser il faut test si ils paie avec le bon type de paiement
		return false; //vehicule.monnaie >= tarif)
			
	}
}
