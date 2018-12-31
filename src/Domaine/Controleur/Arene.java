package Domaine.Controleur;


import BD.MyDB;
import Domaine.Combattant.Combattant;
import Domaine.Combattant.Matrice;
import Domaine.IntelligenceArtificielle.CreerCombattantsAuto;

import Domaine.Joueur.InitNouvellePartie;
import Domaine.Joueur.Player;

import java.util.Random;

public class Arene extends  Player  implements ModeCombat {

  
   String stringDeco;

    /**
     *
     * @param myBase
     * @param matrice
     */
    public void initMatrice(MyDB myBase, Matrice matrice) {
        int index = 0;
        String comName = " COMB  ";
        int nombCombattant= myBase.getMyList().size();
        Combattant combattant= null;
        while (nombCombattant > 0) {
            int x = new Random().nextInt(get_rows());
            int y = new Random().nextInt(get_columns());
            combattant = myBase.getMyList().get(index);
            combattant.set_combattantId(index + 1);
            String val= matrice.getMatriceSession()[y][x];
            if (null == val){
                combattant.setPositionX(x);
                combattant.setPositionY(y);
               matrice.setMatriceSession(comName + combattant.get_combattantId(), y, x);
                nombCombattant--;
                index++;
                System.out.println( comName + combattant.get_combattantId());
            }
        }
        redimentionner();
    }


    /**
     *
     * @param myDB
     * @param matrice
     */
    @Override
    public void modeCombat(MyDB myDB, Matrice matrice) {

     initMatrice(myDB,matrice);
        int x = getnbTotalCombattant() - 1;
        String sepRows = "| ";
        int i = 0;
        int j = 0;
        pourtour(get_columns() + 3);
        while (i < get_rows()) {
            sepaCol();
            System.out.print("  ");
            System.out.println();
            j = 0;
            System.out.print(stringDeco);
            while (j < get_columns()) {
                System.out.print(sepRows);
                System.out.print(matrice.getMatriceSession()[i][j]);
                j++;
            }
            System.out.println(sepRows + stringDeco);
            --x;
            i++;
        }
        ;
        sepaCol();
        System.out.println();
        pourtour(get_columns() + 3);

    }

    /**
     *
     * @return
     */
    public String sepaCol() {
        int j = 0;
        String _sep_colums = " ----------";
        while (j <= get_columns() + 1) {
            if (j == 0) {
                System.out.print(stringDeco);
            } else if (((j % 2) == 1) && (j == get_columns()+ 1)) {
                System.out.print("  " + stringDeco);
            } else if (j != get_columns() + 1) {
                System.out.print(_sep_colums);
            }
            j++;
        }
        return null;
    }

    /**
     *
     * @param taille
     * @return
     */
    public String pourtour(int taille) {
        int i = 0;
        int j = 0;
        while (i < 4) {
            j = 0;
            while (j < taille) {
                System.out.print(stringDeco);
                j++;
            }
            i++;
            System.out.println();
        }
        return null;
    }

    /**
     *
     */
    public Arene() {
        this.stringDeco =  "%%%%%%%%%%";
    }

    /**
     *
     */
    public void redimentionner() {
        int j = 0;
        int i = 0;
        while (i < get_columns()) {
            j = 0;
            while (j < get_rows()) {
                if (null == getMatrice().getMatriceSession()[i][j]) {
                   getMatrice().setMatriceSession("  Vide   ", i, j);

                }
                j++;
            }
            i++;
        }
    }

    /**
     *
     * @param myDB
     * @param matrice
     */
    @Override
    public void combat(MyDB myDB, Matrice matrice) {

    }

    /**
     *
     */
    public void retireCombat() {

    }


}
