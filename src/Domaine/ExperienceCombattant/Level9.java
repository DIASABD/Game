package Domaine.ExperienceCombattant;

import Domaine.CalculAleatoire.NombreAleatoire;
import Domaine.Combattant.Combattant;
import Domaine.RessourcesCombattants.HP;

public class Level9 implements LevelState {



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
    public Level9(Combattant combattant) {
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
        if( expP>=48000 && expP< 64000){
            setLevel(9);
        }
        else if(expP>=64000&&expP < 85000){
            setLevel(10);
        }
        else if(expP>=85000 &&expP < 100000){
            setLevel(11);
        }
        else if( expP>=100000 && expP < 120000){
            setLevel(12);
        }

        if (expP >= 120000) {
            hp.setLevel(new Level13(combattant));
        }

    }

}
