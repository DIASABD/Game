package Domaine.IntelligenceArtificielle;

import BD.MyDB;
import Domaine.IntelligenceArtificielle.CreerCombattant;
import Domaine.IntelligenceArtificielle.GestionAI;

public class CreerCombattantsAuto implements GestionAI {

    int _nombCombattant;
    public CreerCombattantsAuto(int _nombCombattant) {
        this._nombCombattant = _nombCombattant;
        }

    /**
     *
     * @param nombCombattant
     * @param myDB
     */
    public void initialiser(int nombCombattant,  MyDB myDB) {
        int x = nombCombattant;
        int i = 0;
        while (nombCombattant > 0) {
            myDB.addCombattant(new CreerCombattant(i));
            ++i;
            --nombCombattant;
        }
        System.out.println(" Vos " + x + " joueur ont été bien initialisé . ");
    }
}
