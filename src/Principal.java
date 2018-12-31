import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.awt.event.ComponentEvent;

import static java.lang.System.*;

import Domaine.*;
import Domaine.Combattant.Combattant;
import Domaine.Combattant.GestionJoueurManuel;
import Domaine.Controleur.Arene;
import Domaine.Controleur.ModeCombat;
import Domaine.Controleur.VS;
import Domaine.IntelligenceArtificielle.CreerCombattant;
import PRESENTATION.*;
import BD.*;

public class Principal {

    static int CON = 3;
    static int pointVie = 0;

    public static void main(String[] args) {

        GameView gameView = new GameView();
        gameView.initGame();

    }

}



