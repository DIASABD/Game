package Domaine.RessourcesCombattants;

import Domaine.Combattant.Combattant;

public class Armures {


    ArmureTypes _armureTypes;
    Combattant combattant;

    /**
     *
     * @return
     */
    public ArmureTypes get_armure() {
        return _armureTypes;
    }

    /**
     *
     * @param _armureTypes
     */
    public void set_armure(ArmureTypes _armureTypes) {
        this._armureTypes = _armureTypes;
    }

    /**
     *
     * @param combattant
     */
    public Armures(Combattant combattant) {
        this.combattant = combattant;
    }

    /**
     *
     * @return
     */
    int calculACtypeArmure() {

        int value = 0;
        switch (combattant.get_armure()) {
            case Aucune_armure:
                value = 10 + combattant.get_hability().getDEX();
                combattant.setAC(value);
                ;
                break;
            case Armure_leger:
                value = 11 + combattant.get_hability().getDEX();
                combattant.setAC(value);
                ;
                break;
            case Armure_moyenne:
                value = 10 + combattant.get_hability().getDEX();
                combattant.setAC(value);
                ;
                break;
            case Armure_lourde:
                if (combattant.get_hability().getSTR() >= 13) {
                    value = 16;
                } else if (combattant.get_hability().getSTR() >= 15) {
                    value = 18;
                } else value = 14;
                break;

        }

        if (combattant.isBouclier() == true) {
            value += 2;
        }
        return value;
    }


}
