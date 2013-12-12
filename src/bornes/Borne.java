package bornes;

// import enum.payement

import java.util.ArrayList;
import java.util.Iterator;
import paiement.Paiement;

/**
 * @author slavnic/gazquez
 * @TODO - Auto alarme timer - Rajouter les champs des types de paiements des
 * bornes
 */
public abstract class Borne extends Thread implements Paiement {

    private ArrayList<Borne> _tabBornes = new ArrayList<Borne>();
     
    // pour savoir si la borne est ouverte/fermée
    protected boolean _statusBarrier;
    // pour savoir si la borne est occupée/libre
    protected boolean _statusBandeau;
    // pour savoir si la voiture à passée la barrière
    protected boolean _statusBoucleAmont;
    
    protected int _tarif;

    //enum des type de paiement des bornes
    //enum des type d'alarme
    
    public Borne(int tarif){
        
        _tarif = tarif;       
        _statusBandeau = false;
        _statusBarrier = false;
        _statusBoucleAmont = false;
          
    }
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

    public int getNbrBornes(String typeBorne) {
        //à compléter selon la modélisation
        return 8;
    }

    public void addBorne(){
        _tabBornes.add(this);
    }
    public void delBorne(int numBorne){
        _tabBornes.remove(numBorne);
    }
    // voir si on thread chaque bornes (peut_etre inutil si les bornes sont threadés)

    public Borne getFreeBorne() {

        for (Iterator<Borne> ite = _tabBornes.iterator(); ite.hasNext();) {
            if (!ite.next()._statusBandeau) {
                return (Borne) ite.next();
            }
        }
        System.err.println("Pas de bornes disponibles");
        return null;
    }
}
