package Domaine.ExperienceCombattant;

import Domaine.CalculAleatoire.NombreAleatoire;
import Domaine.Combattant.Combattant;
import Domaine.RessourcesCombattants.HP;

public class Level5 implements LevelState {



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
    public Level5(Combattant combattant) {
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
        if( expP>=6500 && expP< 14000){
            setLevel(5);
        }
        else if(expP>=1400&&expP < 23000){
            setLevel(6);
        }
        else if(expP>=23000 &&expP < 34000){
            setLevel(7);
        }
        else if( expP>=34000 && expP < 48000){
            setLevel(8);
        }

        if (expP >= 48000) {
            hp.setLevel(new Level9(combattant));
        }

    }

}

