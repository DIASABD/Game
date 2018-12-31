package Domaine.RessourcesCombattants;

import Domaine.Combattant.Combattant;

public class RogueArmure extends Combattant implements ChoixArmureType {

    /**
     *
     * @param combattantId
     */
    public RogueArmure(int combattantId) {
        super(combattantId);
    }


    /**
     *
     */
    @Override
    public void choixTypeArmureManuel() {
        int resultat = 0;
        boolean choix = false;
        System.out.println(" Veuillez choisir une armure  pour votre joueur : ");
        System.out.println(" 0 = aucune armure ");
        System.out.println(" 1 = armure legere ");
        while (choix == false) {
            resultat = getInputReader().askIntLoop(2);
            if (resultat == 0) {
                this.set_armure(ArmureTypes.Aucune_armure);
                choix = true;
                break;
            } else if (resultat == 1) {
                this.set_armure(ArmureTypes.Armure_leger);
                choix = true;
                break;
            } else {
                System.out.println(" Veuillez choisir une autre armure , Celle-ci n'est pas autorisé ");
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
        }

    }
}
