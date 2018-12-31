package Domaine.IntelligenceArtificielle;

import Domaine.CalculAleatoire.NombreAleatoire;
import Domaine.Combattant.Combattant;
import Domaine.Combattant.CombattantsType;
import Domaine.RessourcesCombattants.*;

import java.util.Random;

public class CreerCombattant extends Combattant implements GestionAI {

    NombreAleatoire nombreAleatoire;

    ChoixArme choixArme;
    ChoixArmureType choixArmureType;

    /**
     *
     * @param combattantId
     */
    public CreerCombattant(int combattantId) {
        super(combattantId);
        this.nombreAleatoire = new NombreAleatoire();
        initAll();
    }

    /**
     *
     */
    public void initAll() {
        initCombattantType();
        initHabilities();
        attArmure();
        attBouclier();
        initHabilities();
        attArm();
    }

    /**
     *
     */
    public void initHabilities() {
        this.get_hability().setSTR(nombreAleatoire.calcul(1, 8));
        this.get_hability().setCON(nombreAleatoire.calcul(1, 8));
        this.get_hability().setDEX(nombreAleatoire.calcul(1, 8));
        this.get_hability().setINT(nombreAleatoire.calcul(1, 8));
        this.get_hability().setWIS(nombreAleatoire.calcul(1, 8));
        this.get_hability().setCHA(nombreAleatoire.calcul(1, 8));

    }

    /**
     *
     */
    public void attArm() {
        int index = 0;

        switch (this.getCombattantsType().name().toLowerCase()) {
            case "fighter":
                this.choixArme = new ArmesCombatNonWizard(this.get_combattantId());
                index = new Random().nextInt(8);
                this.choixArme.choixArmeAuto(index);
                break;
            case "rogue ":
                this.choixArme = new ArmesCombatNonWizard(this.get_combattantId());
                index = new Random().nextInt(8);
                this.choixArme.choixArmeAuto(index);
                break;
            case "wizard":
                this.choixArme = new ArmesWizard(this.get_combattantId());
                index = new Random().nextInt(2);
                break;
        }


    }

    /**
     *
     */
    public void attArmure() {
        int index = 0;
        ;
        switch (this.getCombattantsType()) {
            case Rogue:
                choixArmureType = new RogueArmure(this.get_combattantId());
                index = new Random().nextInt(4);
                break;
            case Wizard:
                choixArmureType = new WizardArmure(this.get_combattantId());
                index = new Random().nextInt(6);
                break;
            case Fighter:
                choixArmureType = new FighterArmure(this.get_combattantId());
                index = new Random().nextInt(2);
                break;
        }
        choixArmureType.choixTypeArmureAuto(index);
    }

    /**
     *
     */
    public void initCombattantType() {
        int index = new Random().nextInt(3);
        switch (index) {
            case 0:
                this.setCombattantsType(CombattantsType.Fighter);
                break;
            case 1:
                this.setCombattantsType(CombattantsType.Rogue);
                break;
            case 2:
                this.setCombattantsType(CombattantsType.Wizard);
                break;
        }
    }

    /**
     *
     */
    public void attBouclier() {
        int index = nombreAleatoire.calcul(0, 2);
        switch (index) {
            case 0:
                this.setBouclier(true);
        }


    }


}
