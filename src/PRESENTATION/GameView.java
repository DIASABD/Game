package PRESENTATION;

import Domaine.CalculAleatoire.InputReader;
import Domaine.Joueur.InitNouvellePartie;
import Domaine.Joueur.Player;

public class GameView implements ViewControler {

    InputReader inputReader;
    Player player;

    /**
     *
     */
    public GameView() {
        this.inputReader = new InputReader();
    }

    /**
     *
     */
    public void initGame() {
        System.out.println(" 0 : Nouvelle Partie ");
        System.out.println(" 1 : Reprendre une partie en cours");
        int in = inputReader.askIntLoop(2);
        switch (in) {
            case 0:
               nouvellePartie();
                break;
            case 1:

        }

    }

    /**
     *
     */
    void nouvellePartie() {
        player = new InitNouvellePartie();
        player.getMyDB().getMyList().size();
        }

    /**
     *
     * @return
     */
    public  Player getPlayer(){
        return this.player;
    }
}


