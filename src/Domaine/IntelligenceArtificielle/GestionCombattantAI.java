package Domaine.IntelligenceArtificielle;

import Domaine.Combattant.Combattant;
import Domaine.Controleur.Arene;
import Domaine.Controleur.VS;

import java.util.Random;

public abstract class GestionCombattantAI implements GestionAI {

    Combattant _combattant;
    VS vs;
    Arene arene;

    public VS getVs() {
        return vs;
    }

    /**
     *
     * @return
     */
    public Arene getArene() {
        return arene;
    }

    /**
     *
     * @param vs
     */
    public void setVs(VS vs) {

        this.vs = vs;
    }

    /**
     *
     * @param arene
     */
    public void setArene(Arene arene) {
        this.arene = arene;
    }

    /**
     *
     * @param combattant
     */
    public void deplacerUnCombat(Combattant combattant) {
        int index = new Random().nextInt(4);
        System.out.println(index);
        int newX = combattant.getPositionX();
        int newY = combattant.getPositionY();
        switch (index) {
            case 0:
                if (newX + 1 < arene.get_rows()) newX += 1;
                break;
            case 1:
                if (newX - 1 >= 0) newX -= 1;
                break;
            case 2:
                if (newY + 1 < arene.get_columns()) newY += 1;
                break;
            case 3:
                if (newY - 1 >= 0) newY -= 1;
                break;
        }
        System.out.println(arene.getMatrice().getMatriceSession()[newY][newX]);
        if (" vide  ".equals(arene.getMatrice().getMatriceSession()[newY][newX])) ;
        {
            arene.getMatrice().setMatriceSession("  vide  ", combattant.getPositionY(), combattant.getPositionX());
            combattant.setPositionX(newX);
            combattant.setPositionY(newY);
            arene.getMatrice().setMatriceSession(combattant.get_nom(), newY, newX);
        }
        //this.arene.modeCombat();
    }

    /**
     *
     * @param combattant
     */
    public abstract void deplacement(Combattant combattant);

    /**
     *
     * @param combattantID_1
     * @param combattantID_2
     */
    public abstract void attaque(int combattantID_1, int combattantID_2);

}
