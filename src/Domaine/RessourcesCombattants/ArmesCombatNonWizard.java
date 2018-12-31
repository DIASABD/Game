package Domaine.RessourcesCombattants;

import Domaine.Combattant.Combattant;

public class ArmesCombatNonWizard extends Combattant implements ChoixArme {


    public ArmesCombatNonWizard(int combattantId) {
        super(combattantId);

    }

    /**
     *
     */
    @Override
    public void choixArmeManuel() {

        boolean choix = false;
        System.out.println(" 1 = Dague (mêlée)  ");
        System.out.println(" 2 = Dague (distance, maximum 20 pieds)  ");
        System.out.println(" 3 = Épée longue (mêlée, maniée à 1 main)");
        System.out.println(" 4 = Épée longue (mêlée, maniée à 2 main)");
        System.out.println(" 5 = Arbalète (distance, maniée à 2 mains, une seule attaque par tour)  ");
        System.out.println(" 6 = Arc (distance, maniée à 2 mains)  ");
        System.out.println(" 7 = Massue ");
        System.out.println(" 8 = hache ");
        int resultat = 0;

        while (choix == false) {
            resultat = getInputReader().askIntLoop(8);
            if (resultat == 0) {
                this.set_arme(ArmesType.DAGUE_MELLE);
                choix = true;
                break;
            } else if (resultat == 1) {
                this.set_arme(ArmesType.EPEE_DISTANCE);
                choix = true;
                break;
            } else if (resultat == 2) {
                this.set_arme(ArmesType.EPEE_1_MAIN);
                choix = true;
                break;
            } else if (resultat == 3) {
                this.set_arme(ArmesType.EPEE_2_MAINS);
                choix = true;
                break;
            } else if (resultat == 4) {
                this.set_arme(ArmesType.ARBALETE);
                choix = true;
                break;
            } else if (resultat == 5) {
                this.set_arme(ArmesType.ARC);
                choix = true;
                break;
            } else if (resultat == 6) {
                this.set_arme(ArmesType.Massue);
                choix = true;
                break;
            } else if (resultat == 7) {
                this.set_arme(ArmesType.HACHE);
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
            this.set_arme(ArmesType.EPEE_1_MAIN);

        } else if (resultat == 3) {
            this.set_arme(ArmesType.EPEE_2_MAINS);

        } else if (resultat == 4) {
            this.set_arme(ArmesType.ARBALETE);

        } else if (resultat == 5) {
            this.set_arme(ArmesType.ARC);

        } else if (resultat == 6) {
            this.set_arme(ArmesType.Massue);

        } else if (resultat == 7) {
            this.set_arme(ArmesType.HACHE);
        }


    }

}

