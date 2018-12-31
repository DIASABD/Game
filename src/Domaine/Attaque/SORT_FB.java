package Domaine.Attaque;

import Domaine.CalculAleatoire.NombreAleatoire;
import Domaine.Combattant.Combattant;

public class SORT_FB extends Sort {


    Combattant combattantsType;
    NombreAleatoire nombreAleatoire;

    /**
     *
     */
    public SORT_FB() {
        nombreAleatoire = new NombreAleatoire();
    }

    /**
     *
     * @param combattantCible
     */
    @Override
    void consequence(Combattant combattantCible) {
        combattantCible.setDommage(combattantCible.getDommage() + nombreAleatoire.calcul(2, 10));
    }

    /**
     *
     */
    @Override
    void gainWizard() {

    }
}
