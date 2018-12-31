package Domaine.IntelligenceArtificielle;

import Domaine.Combattant.Combattant;

public class GestionCombattantAIArene extends GestionCombattantAI {

    /**
     *
     * @param combattant
     */
    @Override
    public void deplacement(Combattant combattant) {
        deplacerUnCombat(combattant);

    }

    /**
     *
     */
    public void moveAllComb() {
        int i = 0;
        Combattant combattant = null;
        while (i < this.getArene().getMyDB().getMyList().size()) {
            combattant = this.getArene().getMyDB().getMyList().get(i);
            deplacement(combattant);
            i++;
        }

      //  this.getArene().modeCombat();
    }

    /**
     *
     * @param combattantID_1
     * @param combattantID_2
     */
    public void attaque(int combattantID_1, int combattantID_2) {
    }
}
