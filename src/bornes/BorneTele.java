package bornes;

public final class BorneTele extends Borne {

    public BorneTele(int tarif) {
      super(tarif);
      //set type de paiement des bornes
      this.addBorne();        
    }
    
    
    // pas le droit de repasser avec le meme badge avant un timer
    // gabarit permettant uniquement au voitures de passer
    // bouton 'alarme déclenchable par l'usager
  @Override
    public boolean encaisser() {
        //avant d'encaisser il faut test si ils paient avec le bon type de paiement
        // assez de sous ?
        //if paiement ok >> _statusBarrier = true;
        //>> _statusBandeau = true;
        return false; //vehicule.monnaie >= tarif)

    }
}
