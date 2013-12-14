package bornes;

import java.util.ArrayList;
import java.util.Iterator;
import comBarriereVehicule.Categorie;

//import vehicule.Vehicule;

/**
 * @author slavnic/gazquez
 * @TODO - Auto alarme timer - Rajouter les champs des types de paiements des
 *       bornes - les tarifs peuvent dépendre du type de véhicule (hashmap?) -
 *       plusieurs type depayement pour une borne ?
 * 
 * @TOREAD A LIRE AVANT DE COMMENTER: notre diagramme de classe est pas fiable,
 *         je suis donc parti sur une modélisation persos, certaines
 *         méthodes/classes/champs peuvent paraître obsolète, je les faits
 *         évoluer en fonction de l'orientation que prend le projet
 * 
 * @CONVENTION - underscore pour les champs de classe - Full Anglais sauf
 *             commentaires (of course !) - j'évite au possible l'utilisation de
 *             this
 * 
 */
public abstract class Borne extends Thread {

	// l'ensemble des bornes qui constitue le péage
	private ArrayList<Borne> _tabBornes = new ArrayList<Borne>();

	// pour savoir si la borne est ouverte/fermée
	protected boolean _statusBarrier;
	// pour savoir si la borne est occupée/libre
	protected boolean _statusBandeau;
	// pour savoir si la voiture a passée la barrière
	protected boolean _statusBoucleAmont;
	// prix de la barrier
	protected int _price;
	// type de vehicule accepté par la borne
	protected Categorie _acceptedVehiculeType;

	// enum des type d'alarme
	
	
	/**
	 * Constructeur de Borne(abstract) (initialise les champs des bornes)
	 * 
	 * @param tarif
	 *            Prix qur la borne demande à l'usagers
	 */
	public Borne(int price) {

		_price = price;
		_statusBandeau = false;
		_statusBarrier = false;
		_statusBoucleAmont = false;

	}

	//
	// // retourne type vehicule qui passe dans la borne (pour savoir si il a le
	// // droit de passer a cette borne ou arlarme)
	// public void getTypeVehicule() {
	//
	// }
	//
	// // retourne type Paiement que la voiture veut payer avec
	// // (cb/espèce/telepeage)
	// public void getTypePayement() {
	//
	// }
	//
	// // check si la voiture et la borne ont le même type de paiement
	// public boolean checkPayement() {// typePaiement borne){
	// return false; // this.getTypePayement.equals(borne);
	// }

	/**
	 * Getter du champs _statusBandeau
	 * 
	 * @return boolean Status du Bandeau amont (false=occupé,true=libre)
	 */
	public boolean getStatusBandeau() {
		return _statusBandeau;
	}

	/**
	 * Getter du champs _statusBoucleAmont
	 * 
	 * @return boolean Status de la BoucleAmont(false=non
	 *         franchie,true=franchie)
	 */
	public boolean getStatusBoucleAmont() {
		return _statusBoucleAmont;
	}

	/**
	 * Getter du champs _statusBarrier
	 * 
	 * @return boolean Le status de la barriere (false=fermée,true=ouverte)
	 */
	public boolean getBarrier() {
		return _statusBarrier;
	}

	/**
	 * Setter du champs _stateBarrier
	 * 
	 * @param stateBarrier
	 *            permet de set le status de la barriere
	 *            (false=fermée,true=ouverte)
	 */
	public void setBarrier(boolean stateBarrier) {
		_statusBarrier = stateBarrier;
	}

	/**
	 * Getter du champs _price
	 * 
	 * @return int Le prix à payer pour passer le péage
	 */
	public int getPrice() {
		return _price;
	}

	/**
	 * Setter du champs _price
	 * 
	 * @param price
	 *            Le prix du peage à modifier
	 */
	public void setPrice(int price) {
		_price = price;
	}

	/**
	 * Renvoie le nombre total de borne dans le péage
	 * 
	 * @return int le nombre de borne dans le péage
	 */
	public int getNbrBornes() {

		return _tabBornes.size();
	}

	/**
	 * Ajouter une borne au péage
	 */
	public void addBorne() {
		_tabBornes.add(this);
	}

	/**
	 * Supprimer la borne numero "numBorne" du péage
	 * 
	 * @param numBorne
	 */
	public void delBorne(int numBorne) {
		_tabBornes.remove(numBorne);
	}

	// voir si on thread chaque bornes (peut_etre inutil si les bornes sont
	// threadés)

	/**
	 * Permet de trouver une borne qui n'est pas occupée
	 * 
	 * @return Borne La borne qui est prête à accueillir un nouveau véhicule
	 */
	public Borne getFreeBorne() {

		for (Iterator<Borne> ite = _tabBornes.iterator(); ite.hasNext();) {
			if (!ite.next()._statusBandeau)
				return (Borne) ite.next();

		}
		System.err.println("Pas de bornes disponibles");
		return null;
	}
}
