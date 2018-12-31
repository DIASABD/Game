package Domaine.RessourcesCombattants;

import Domaine.Combattant.Combattant;

public class FighterArmure extends Combattant implements ChoixArmureType {

    /**
     *
     * @param combattantId
     */
    public FighterArmure(int combattantId) {
        super(combattantId);
    }

    /**
     *
     */
    @Override
    public void choixTypeArmureManuel() {
        boolean choix = false;
        int resultat = 0;
        System.out.println(" Veuillez choisir une armure  pour votre joueur : ");
        System.out.println(" 0 = armure moyenne ");
        System.out.println(" 1 = armure lourde ");

        while (choix == false) {
            resultat = getInputReader().askIntLoop(2);
            if (resultat == 0) {
                this.set_armure(ArmureTypes.Armure_moyenne);
                choix = true;
                break;
            } else if (resultat == 1) {
                this.set_armure(ArmureTypes.Armure_lourde);
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
            this.set_armure(ArmureTypes.Armure_moyenne);
        } else if (resultat == 1) {
            this.set_armure(ArmureTypes.Armure_lourde);

        }

    }

}

