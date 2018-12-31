package Domaine.RessourcesCombattants;

import Domaine.Combattant.Combattant;

public class Armes {


    ArmesType _armesType;
    Combattant combattant;

    /**
     *
     * @return
     */
    public ArmesType get_armesType() {
        return _armesType;
    }

    /**
     *
     * @param _armesType
     */
    public void set_armesType(ArmesType _armesType) {
        this._armesType = _armesType;
    }

    /**
     *
     * @param combattant
     */
    public Armes(Combattant combattant) {
        this.combattant = combattant;
    }

    /**
     *
     * @return
     */
    int calculDommage() {

        int value = 0;
        switch (combattant.get_arme()) {

            case DAGUE_MELLE:
                value = combattant.getNombreAleatoire().calcul(1, 4) + combattant.get_hability().getDEX();
                break;
            case EPEE_DISTANCE:
                value = combattant.getNombreAleatoire().calcul(1, 4) + combattant.get_hability().getDEX();
                break;
            case HACHE:
                value = combattant.getNombreAleatoire().calcul(1, 10) + combattant.get_hability().getDEX();
                break;
            case EPEE_1_MAIN:
                value = combattant.getNombreAleatoire().calcul(1, 8) + combattant.get_hability().getSTR();
                break;
            case EPEE_2_MAINS:
                value = combattant.getNombreAleatoire().calcul(1, 10) + combattant.get_hability().getSTR();
                break;
            case ARBALETE:
                value = combattant.getNombreAleatoire().calcul(1, 10) + combattant.get_hability().getSTR();
                break;
            case ARC:
                value = combattant.getNombreAleatoire().calcul(1, 8) + combattant.get_hability().getDEX();
                break;
            case Massue:
                value = combattant.getNombreAleatoire().calcul(1, 6) + combattant.get_hability().getSTR();
                break;

        }
        return value;
    }

}
