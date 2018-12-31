package Domaine.Attaque;

import Domaine.Combattant.Combattant;

public class SORT_MA extends Sort {


    Combattant wizard;

    /**
     *
     * @param wizard
     */
    public SORT_MA(Combattant wizard) {
        this.wizard = wizard;
    }


    @Override
    void consequence(Combattant combattantCible) {

    }

    /**
     *
     */
    @Override
    void gainWizard() {
        wizard.setAC(13 + wizard.get_hability().getDEX());
    }
}
