package Domaine.Controleur;

import Domaine.CalculAleatoire.InputReader;
import Domaine.Combattant.Combattant;
import Domaine.Combattant.CombattantsType;
import Domaine.IntelligenceArtificielle.GestionAI;
import Domaine.RessourcesCombattants.*;

public class InitManuelJoueur extends Combattant implements GestionAI {


    InputReader inputReader;

    /**
     *
     * @param combattantId
     */
    public InitManuelJoueur(int combattantId) {
        super(combattantId);
        this.set_combattantId(1);
        this.inputReader = new InputReader();
        this.set_hability( new Habilities());
        initManuel();
    }

    /**
     *
     */
    public void initManuel() {
        System.out.println(" Veuillez choisir un Nom pour votre joueur : ");
        choixNom();
        System.out.println(" Veuillez choisir un type de combattant : ");
        choixTypeCombattant();
        System.out.println(" Veuillez choisir une arme  pour votre joueur : ");
        choixArme();
        System.out.println(" Veuillez choisir une armure pour votre joueur : ");
        choixArmure();
        System.out.println(" Veuillez attribuer un bouclier à votre joueur ? ");
        System.out.println(" 0: Oui ");
        System.out.println(" 1 : Non ");
        attBouclier();
        System.out.println(" Veuillez initialiser les 6 habilétés de votre joueur : ");
        initHabiletes();
        System.out.println(" Votre  joueur est bien initialisé ");

    }

    /**
     *
     */
    public void choixNom() {
        String resultat = null;
        while (null == resultat) {
            resultat = inputReader.askStringtLoop();
            this.set_nom(resultat);
        }
    }

    /**
     *
     */
    public void choixTypeCombattant() {
        int resultat = 0;
        System.out.println(" 0 = fighter  ");
        System.out.println(" 1 = rogue  ");
        System.out.println(" 2 = wizard ");
        while (resultat != 0 || (resultat != 1) || (resultat != 2)) {
            resultat = inputReader.askIntLoop(3);
            if (resultat == 0) {
                this.setCombattantsType(CombattantsType.Fighter);
                break;
            } else if (resultat == 1) {
                this.setCombattantsType(CombattantsType.Rogue);
                break;
            } else if (resultat == 2) {
                this.setCombattantsType(CombattantsType.Wizard);
                break;
            } else {
                System.out.println(" Veuillez choisir un autre type , Celui-ci n'est pas autorisé ");
            }

        }

    }

    /**
     *
     */
    public void choixArme() {
        ChoixArme armeWizard = new ArmesWizard(this.get_combattantId());
        ChoixArme autreComattant = new ArmesCombatNonWizard(this.get_combattantId());
        switch (this.getCombattantsType()) {
            case Fighter:
                autreComattant.choixArmeManuel();
                break;
            case Rogue:
                autreComattant.choixArmeManuel();
                break;
            case Wizard:
                armeWizard.choixArmeManuel();
                break;
        }

    }

    /**
     *
     */
    void choixArmure() {
        ChoixArmureType choixArmureTypeF = new FighterArmure(this.get_combattantId());
        ChoixArmureType choixArmureTypeR = new RogueArmure(this.get_combattantId());
        ChoixArmureType choixArmureTypW = new WizardArmure(this.get_combattantId());
        switch (this.getCombattantsType()) {
            case Fighter:
                choixArmureTypeF.choixTypeArmureManuel();
                break;
            case Rogue:
                choixArmureTypeR.choixTypeArmureManuel();
                break;
            case Wizard:
                choixArmureTypW.choixTypeArmureManuel();
                break;
        }

    }

    /**
     *
     */
    void initHabiletes() {

        int index = 1;
        while (index < 7) {
            if (index == 1) {
                System.out.println(" Veuillez choisir  un score pour sa force physique ");
                int score = entreScore();
                if (score != 0 && score <= 20) {
                    this.get_hability().setSTR(score);
                    index += 1;
                }
            }
            if (index == 2) {
                System.out.println(" Veuillez choisir un score pour sa dexterité ");
                int score = entreScore();
                if (score != 0 && score <= 20) {
                    this.get_hability().setDEX(score);
                    index += 1;
                }
            }
            if (index == 3) {
                System.out.println(" Veuillez choisir un score pour sa constitution physique ");
                int score = entreScore();
                if (score != 0 && score <= 20) {
                    this.get_hability().setCON(score);
                    index += 1;
                }
            }
            if (index == 4) {
                System.out.println(" Veuillez choisir un score pour son intelligence ");
                int score = entreScore();
                if (score != 0 && score <= 20) {
                    this.get_hability().setINT(score);
                    index += 1;
                }
            }
            if (index == 5) {
                System.out.println(" Veuillez choisir un score pour sa sagesse ");
                int score = entreScore();
                if (score != 0 && score <= 20) {
                    this.get_hability().setWIS(score);
                    index += 1;
                }
            }
            if (index == 6) {
                System.out.println(" Veuillez  choisir un score pour son charisme ");
                int score = entreScore();
                if (score != 0 && score <= 20) {
                    this.get_hability().setCHA(score);
                    index += 1;
                }
            }

        }
    }

    /**
     *
     * @return
     */
    public int entreScore() {

        int resultat = 0;
        try {
            resultat = inputReader.askIntLoop(21);
        } catch (Exception e) {
            System.out.println(" Le score que vous avez entrer n'est pas valide veuillez entrer un autre score");
        }
        return resultat;
    }

    /**
     *
     */
    public void attBouclier() {
        int index = inputReader.askIntLoop(2);
        switch (index) {
            case 0:
                this.setBouclier(true);
                break;
            case 1:
                this.setBouclier(false);
                break;
        }


    }
}
