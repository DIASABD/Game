package Domaine.ExperienceCombattant;

import Domaine.CalculAleatoire.NombreAleatoire;
import Domaine.Combattant.Combattant;
import Domaine.RessourcesCombattants.HP;

public class Level13 implements LevelState {



    NombreAleatoire _nombreAleatoire;
    int _CON;
    int level;
    int exp_point, PRO;
    HP hp;

    /**
     *
     * @return
     */
    public int getLevel() {
        return level;
    }

    /**
     *
     * @param level
     */
    public void setLevel(int level) {
        this.level = level;
        this.hp= new HP(combattant);
        this.exp_point= 0;
    }

    /**
     *
     * @param combattant
     */
    public Level13(Combattant combattant) {
        this._nombreAleatoire = new NombreAleatoire();
        this.PRO = 2;
        this.level=1; ;
    }

    /**
     *
     */
    @Override
    public void upadteLevel() {

        int expP= combattant.getExp_Point();
        if( expP>=120000 && expP< 140000){
            setLevel(13);
        }
        else if(expP>=140000&&expP < 165000){
            setLevel(14);
        }
        else if(expP>=165000 &&expP < 195000){
            setLevel(15);
        }
        else if( expP>=195000 && expP < 225000){
            setLevel(16);
        }

        if (expP >= 225000) {
            hp.setLevel(new Level17(combattant));
        }

    }


}
