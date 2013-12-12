package bornes;

public final class BorneAuto extends Borne {

    public BorneAuto(int tarif) {
        super(tarif);
        //set type de paiement des bornes
        this.addBorne();
    }

    
     // gabarit permettant uniquement au voitures de passer
     // bouton 'alarme déclenchable par l'usager
    
    @Override
    public boolean encaisser() {
        //avant d'encaisser il faut test si ils paient avec le bon type de paiement
        //if paiement ok >> _statusBarrier = true;
        //>> _statusBandeau = true;
        return false; //vehicule.monnaie >= tarif)

    }

}
