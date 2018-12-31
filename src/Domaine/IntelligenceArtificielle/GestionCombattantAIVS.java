package Domaine.IntelligenceArtificielle;

import Domaine.Combattant.Combattant;
import Domaine.Combattant.Matrice;

public class GestionCombattantAIVS extends GestionCombattantAI {
    Combattant _combattant;

    Matrice matrice;
    int _columns;
    int _rows;

    /**
     *
     * @return
     */
    public Matrice getMatrice() {
        return matrice;
    }

    /**
     *
     * @param matrice
     */
    public void setMatrice(Matrice matrice) {
        this.matrice = matrice;
    }

    /**
     *
     * @param _combattant
     */
    public GestionCombattantAIVS(Combattant _combattant) {
        super();
        this._combattant = _combattant;
        this._columns = 8;
        this._rows = 8;
    }

    /**
     *
     * @param combattant
     */
    @Override
    public void deplacement(Combattant combattant) {
        deplacerUnCombat(combattant);
      //  this.vs.combat();
    }

    /**
     *
     * @param combattantID_1
     * @param combattantID_2
     */
    public void attaque(int combattantID_1, int combattantID_2) {
    }
}
