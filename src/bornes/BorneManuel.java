package bornes;

/**
 *
 * @author slavnic/gazquez
 * @TODO - gérer les véhicule spéciaux ac le pass
 *
 */
public final class BorneManuel extends Borne {

    //Superviseur.setAlarme(Alarme.monnaie);
    
    public BorneManuel(int tarif) {
      super(tarif);
      //set type de paiement des bornes
      this.addBorne();        
    }

    // Alarme boutonAlarme;
    // push count systeme de gestion
    
    @Override
    public boolean encaisser() {
        //avant d'encaisser il faut test si ils paient avec le bon type de paiement
        //if paiement ok >> _statusBarrier = true;
        //>> _statusBandeau = true;
        return false; //vehicule.monnaie >= tarif)

    }
}
