package Domaine.Combattant;

import Domaine.IntelligenceArtificielle.GestionAI;
import Domaine.Joueur.Player;

public class GestionJoueurManuel extends Player implements GestionAI {



    public GestionJoueurManuel() {

    }


    /**
     *
     * @param combattant
     */
    public void deplacementManuel(Combattant combattant) {
        System.out.println("Quelle direction souhaitez-vous prendre ? ");
        System.out.println("(droite: d ou e; gauche: g ou o; haut: h ou n; bas: b ou s)");
        int x = combattant.getPositionX();
        int y = combattant.getPositionY();
        String choix =   getInputReader().askStringtLoop();
        if (choix.equals("g") || choix.equals("o")) {
            x -= 1;
        } else if (choix.equals("d") || choix.equals("e")) {
            x += 1;
        } else if (choix.equals("h") || choix.equals("n")) {
            y -= 1;
        } else if (choix.equals("b") || choix.equals("s")) {
            y += 1;
        }

        if (y < get_columns() - 1 && x < get_rows() - 1) {

            if (choix.equals("vide")) {
                combattant.setPositionX(x);
                combattant.setPositionY(y);
                getMatrice().setMatriceSession(combattant.get_nom(), y, x);
            }
            {
                System.out.println("Désolé vous ne pouvez pas vous déplacer ce espace est occupé");

            }
        } else {
            System.out.println("Désolé vous ne pouvez pas vous déplacer hors du champ du jeu");

        }
    }

    /**
     *
     * @param combattantID_1
     * @param combattantID_2
     */
    public void attaque(int combattantID_1, int combattantID_2) {
    }

}
