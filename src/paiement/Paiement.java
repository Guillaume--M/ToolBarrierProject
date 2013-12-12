package paiement;

/**
*
* @Author gazquez
* @Todo - Gérer les voitures qui ont pas assez de tunes
*                  - régler les pb de package
*                  -
*
* Interface des types de paiements dans les bornes
*
*/
public interface Paiement {

        /**
         * Fonction qui définit la façon de payer dans une borne
         *
         * @return String quel type de paiement et de combien
         */
        public String encaisser();
        
        
}