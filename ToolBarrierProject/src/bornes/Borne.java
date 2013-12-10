package bornes;
// import enum.payement
/**
 * @author slavnic
 * @TODO 
 * - Auto alarme timer
 * - Rajouter les champs des types de paiements des bornes
 */
public abstract class Borne {

	protected boolean _statusBarrier;
	protected boolean _statusBandeau;
	protected boolean _statusBoucleAmont;
	//retourne type vehicule
	protected void getTypeVehicule(){
		
	}
	//retourne type Paiement 
	protected void getTypePaiement(){
		
	}
	public boolean getStatusBandeau() {
		return _statusBandeau;
	}
	public boolean getStatusBoucleAmont() {
		return _statusBoucleAmont;
	}
	
	public boolean getBarrier(){
		return _statusBarrier;
	}
	public void setBarrier(boolean stateBarrier){
		_statusBarrier = stateBarrier;
	}
	
	
}
