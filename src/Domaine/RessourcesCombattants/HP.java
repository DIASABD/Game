package Domaine.RessourcesCombattants;

import Domaine.Combattant.Combattant;
import Domaine.ExperienceCombattant.LevelState;
import Domaine.CalculAleatoire.NombreAleatoire;

public class HP {

    private int pointVie;
    private LevelState currentLevel;
    Combattant combattant;
    NombreAleatoire nombreAleatoire;

    /**
     *
     * @param combattant
     */
    public HP(Combattant combattant) {
        this.combattant = combattant;
        this.nombreAleatoire = new NombreAleatoire();
        currentLevel = this.combattant.get_levelState();

    }

    /**
     *
     */
    public HP() {

    }

    /**
     *
     * @param s
     */
    public void setLevel(LevelState s) {
        currentLevel = s;
    }

    /**
     *
     * @param pointVie
     * @return
     */
    public int calculHP(int pointVie) {

        switch (this.combattant.getCombattantsType()) {
            case Fighter:
                this.pointVie = calculHpMaximal(10, combattant.get_hability().getCON(), combattant.get_levelState().getLevel(), nombreAleatoire.calcul(1, 10));
                break;
            case Rogue:
                this.pointVie = calculHpMaximal(6, combattant.get_hability().getCON(), combattant.get_levelState().getLevel(), nombreAleatoire.calcul(1, 6));
                break;
            case Wizard:
                this.pointVie = calculHpMaximal(8, combattant.get_hability().getCON(), combattant.get_levelState().getLevel(), nombreAleatoire.calcul(1, 8));
                break;
                }
        return currentLevel.getLevel();
    }

    /**
     *
     * @param max
     * @param CON
     * @param levelState
     * @param HitDice
     * @return
     */
    public int calculHpMaximal(int max, int CON, int levelState, int HitDice) {
        return (max + CON) + ((levelState - 1) * (HitDice + CON));

    }


}

