package Domaine.RessourcesCombattants;

import Domaine.Combattant.Combattant;

public class ArmesWizard extends Combattant implements ChoixArme {

    /**
     *
     * @param combattantId
     */
    public ArmesWizard(int combattantId) {
        super(combattantId);

    }

    /**
     *
     */
    @Override
    public void choixArmeManuel() {
        boolean choix = false;
        System.out.println(" 0 = Dague (mêlée)  ");
        System.out.println(" 1 = Dague (distance, maximum 20 pieds)  ");
        System.out.println(" 2 = Massue  ");
        int resultat = 0;
        while (choix == false) {
            resultat = getInputReader().askIntLoop(3);
            if (resultat == 0) {
                this.set_arme(ArmesType.DAGUE_MELLE);
                choix = true;
                break;
            } else if (resultat == 1) {
                this.set_arme(ArmesType.EPEE_DISTANCE);
                choix = true;
                break;
            } else if (resultat == 2) {
                this.set_arme(ArmesType.Massue);
                choix = true;
                break;
            } else {
                System.out.println(" Veuillez choisir une autre arme , Celle-ci n'est pas autorisée ");

            }
        }

    }

    /**
     *
     * @param resultat
     */
    @Override
    public void choixArmeAuto(int resultat) {
        if (resultat == 0) {
            this.set_arme(ArmesType.DAGUE_MELLE);
        } else if (resultat == 1) {
            this.set_arme(ArmesType.EPEE_DISTANCE);
        } else if (resultat == 2) {
            this.set_arme(ArmesType.Massue);
        }
    }
}
