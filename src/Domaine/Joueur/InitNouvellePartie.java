package Domaine.Joueur;

import Domaine.CalculAleatoire.InputReader;
import Domaine.Combattant.Combattant;
import Domaine.Combattant.GestionJoueurManuel;
import Domaine.Controleur.Arene;
import Domaine.Controleur.InitManuelJoueur;
import Domaine.Controleur.VS;
import Domaine.IntelligenceArtificielle.CreerCombattant;

public class InitNouvellePartie extends Player {

    InputReader inputReader;

    /**
     *
     */
    public InitNouvellePartie() {
      inputReader = new InputReader();
      initPartie();
    }

    /**
     *
     */
    public void initPartie() {
        System.out.println(" Veuillez entrer le mode d'initialisation de votre joueur : ");
        choixModeInitJoueur();
        System.out.println(" Veuillez entrer le mode de jeu : ");
       this.typeJeu();
        System.out.println(" Veuillez entrer le type de combat  : ");
        this.choixModeCombat();
    }

    /**
     *
     */
    void choixModeInitJoueur() {

        System.out.println(" 0 = automatique ");
        System.out.println(" 1 = manuel ");
        int resultat = 0;
        Combattant combattant= null;

        while (resultat != 0 || resultat != 1) {
            resultat = inputReader.askIntLoop(2);
            if (resultat == 0) {
                combattant= new CreerCombattant(this.getJoueurID());
                 this.setJoueur(combattant);
                 this.getMyDB().getMyList().add(combattant);
                break;
            } else if (resultat == 1) {
                combattant= new InitManuelJoueur(this.getJoueurID());
                this.getMyDB().getMyList().add(combattant);
                break;
            } else {
                System.out.println(" Le choix fait n'est pas valide, vueillez choisir entre 1 et 2 ");
            }

        }

    }

    /**
     *
     */
    void choixModeCombat() {

        int resultat = 0;
        System.out.println(" 0 = Arene");
        System.out.println(" 1 = VS");
        try {
            while (resultat != 0 || resultat != 1) {
                resultat = this.joueur.getInputReader().askIntLoop(2);
                if (resultat == 0) {
                    this.modeCombat= new Arene();
                    modeCombat.modeCombat(this.getMyDB(),this.getMatrice());
                    break;
                }
                if (resultat == 1) {
                    System.out.print(getMyDB().getMyList().size());
                    this.modeCombat=new VS();
                    modeCombat.modeCombat(this.getMyDB(),this.getMatrice());
                    modeCombat.combat(this.getMyDB(),this.getMatrice());
                    break;
                } else {
                    System.out.println(" Le choix du type de combat fait n'est pas valide, veuillez choisir entre 0 et 1 ");
                }
            }
        } catch (Exception e) {
            }
    }

    /**
     *
     */
    void typeJeu() {

        int resultat = 0;
        System.out.println(" 0 = Mode IA ");
        System.out.println(" 1 = Mode Player");
        try {
            while (resultat != 0 || resultat != 1) {
                resultat = this.joueur.getInputReader().askIntLoop(2);
                if (resultat == 0) {
                    break;
                }
                if (resultat == 1) {
                    //gestionJoueurManuel = new GestionJoueurManuel();
                    break;
                } else {
                    System.out.println(" Le choix du type de combat fait n'est pas valide, veuillez choisir entre 0 et 1 ");
                }
            }
        } catch (Exception e) {

        }

    }


}
