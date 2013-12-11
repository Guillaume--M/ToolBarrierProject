package bornes;
// import enum.payement
/**
 * @author slavnic/gazquez
 * @TODO 
 * - Auto alarme timer
 * - Rajouter les champs des types de paiements des bornes
 */
public abstract class Borne implements Encaisse {

	// pour savoir si la borne est ouverte/fermée
	protected boolean _statusBarrier;
	// pour savoir si la borne est occupée/libre
	protected boolean _statusBandeau;
	// pour savoir si la voiture à passée la barrière
	protected boolean _statusBoucleAmont;
	
	protected int _tarif;

	// retourne type vehicule qui passe dans la borne (pour savoir si il a le droit de passer a cette borne ou arlarme)
	public void getTypeVehicule() {

	}

	// retourne type Paiement que la voiture veut payer avec (cb/espèce/telepeage)
	public void getTypePayement() {

	}

	// check si la voiture et la borne ont le même type de paiement
	public boolean checkPayement() {// typePaiement borne){
		return false; // this.getTypePayement.equals(borne);
	}

	public boolean getStatusBandeau() {
		return _statusBandeau;
	}

	public boolean getStatusBoucleAmont() {
		return _statusBoucleAmont;
	}

	public boolean getBarrier() {
		return _statusBarrier;
	}

	public void setBarrier(boolean stateBarrier) {
		_statusBarrier = stateBarrier;
	}

	public int get_tarif() {
		return _tarif;
	}

	public void set_tarif(int tarif) {
		_tarif = tarif;
	}

}
