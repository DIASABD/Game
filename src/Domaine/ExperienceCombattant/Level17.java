package Domaine.ExperienceCombattant;

import Domaine.CalculAleatoire.NombreAleatoire;
import Domaine.Combattant.Combattant;
import Domaine.RessourcesCombattants.HP;

public class Level17 implements LevelState {



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
    public Level17(Combattant combattant) {
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
        if( expP>=225000 && expP< 265000){
            setLevel(17);
        }
        else if(expP>=265000&&expP < 305000){
            setLevel(18);
        }
        else if(expP>=305000 &&expP < 355000){
            setLevel(19);
        }
        else if( expP>=355000 ){
            setLevel(20);
        }


    }


}
