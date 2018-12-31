package BD;

import Domaine.Combattant.Combattant;
import Domaine.Joueur.Player;

import java.util.ArrayList;
import java.util.HashMap;

public class MyDB {

    ArrayList<Combattant> myList;
    HashMap BD ;


    public MyDB() {
        this.myList = new ArrayList<>();
        BD = new HashMap<Integer,Player>();
    }

    /**
     *
     * @return
     */
    public ArrayList<Combattant> getMyList() {
        return myList;
    }

    /**
     *
     * @return
     */
    public HashMap getBD() {
        return BD;
    }

    /**
     *
     * @param myList
     */
    public void setMyList(ArrayList<Combattant> myList) {

        this.myList = myList;
    }

    /**
     *
     * @param BD
     */
    public void setBD(HashMap BD) {
        this.BD = BD;
    }

    /**
     *
     * @param combattant
     */
    public  void addCombattant(Combattant combattant){
        this.myList.add(combattant);
    }
}
