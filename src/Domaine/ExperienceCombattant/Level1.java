package Domaine.ExperienceCombattant;

import Domaine.CalculAleatoire.NombreAleatoire;
import Domaine.Combattant.Combattant;
import Domaine.RessourcesCombattants.HP;

public class Level1  implements LevelState {


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
    public Level1(Combattant combattant) {
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
        if( expP<300){
            setLevel(1);
        }
        else if(expP>=300&&expP < 900){
            setLevel(2);
        }
        else if(expP>=900 &&expP < 2700){
            setLevel(3);
        }
        else if( expP>=2700 && expP <6500){
            setLevel(4);
        }

        if (expP >= 6500) {
            hp.setLevel(new Level5(combattant));
        }

    }


}
