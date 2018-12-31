package Domaine.RessourcesCombattants;

import Domaine.Combattant.Combattant;

public class WizardArmure extends Combattant implements ChoixArmureType {

    /**
     *
     * @param combattantId
     */
    public WizardArmure(int combattantId) {
        super(combattantId);

    }

    /**
     *
     */
    @Override
    public void choixTypeArmureManuel() {

        int resultat = 0;
        boolean choix = false;
        System.out.println(" 0 = aucune armure ");
        System.out.println(" 1 = armure legere ");
        System.out.println(" 2 = armure moyenne ");
        System.out.println(" 3 = armure lourde ");
        while (choix == false) {
            resultat = getInputReader().askIntLoop(4);
            if (resultat == 0) {
                this.set_armure(ArmureTypes.Aucune_armure);
                choix = true;
                break;
            } else if (resultat == 1) {
                this.set_armure(ArmureTypes.Armure_leger);
                choix = true;
                break;
            } else if (resultat == 2) {
                this.set_armure(ArmureTypes.Armure_moyenne);
                choix = true;
                break;
            } else if (resultat == 3) {
                this.set_armure(ArmureTypes.Armure_lourde);
                choix = true;
                break;
            } else {
                System.out.println(" Veuillez choisir une autre armure ,Celle-ci n'est pas autorisé ");
            }

        }

    }

    /**
     *
     * @param resultat
     */
    @Override
    public void choixTypeArmureAuto(int resultat) {
        if (resultat == 0) {
            this.set_armure(ArmureTypes.Aucune_armure);

        } else if (resultat == 1) {
            this.set_armure(ArmureTypes.Armure_leger);

        } else if (resultat == 2) {
            this.set_armure(ArmureTypes.Armure_moyenne);

        } else if (resultat == 3) {
            this.set_armure(ArmureTypes.Armure_lourde);

        }


    }
}
