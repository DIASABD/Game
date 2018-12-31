package Domaine.Attaque;

import Domaine.CalculAleatoire.NombreAleatoire;
import Domaine.Combattant.Combattant;

public class SORT_MC extends Sort {


    NombreAleatoire nombreAleatoire;
    Combattant wizard;

    /**
     *
     * @param wizard
     */
    public SORT_MC(Combattant wizard) {
        this.wizard = wizard;
        this.nombreAleatoire = new NombreAleatoire();
    }

    /**
     *
     * @param combattantCible
     */
    @Override
    void consequence(Combattant combattantCible) {
        combattantCible.setDommage(combattantCible.getDommage() + nombreAleatoire.calcul(3, 4) + 3);
    }

    /**
     *
     */
    @Override
    void gainWizard() {

    }
}
