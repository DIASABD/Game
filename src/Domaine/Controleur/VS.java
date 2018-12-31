package Domaine.Controleur;

import BD.MyDB;
import Domaine.Combattant.Combattant;
import Domaine.IntelligenceArtificielle.CreerCombattant;
import Domaine.Combattant.Matrice;
import Domaine.Joueur.Player;

import java.util.Random;

public class VS extends Player implements ModeCombat {




    Combattant combattant;
    String stringDeco = "%%%%%%%%%%";
    int combattantId;
    int nombreCombattant;


    public VS() {
        this.combattantId = 0;

    }


    /**
     *
     * @param myDB
     * @param matrice
     */
    @Override
    public void modeCombat(MyDB myDB, Matrice matrice) {
        initMatrice(myDB,matrice);
        int x = nombreCombattant - 1;
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
        pourtour(get_rows() + 3);

        ;

    }

    /**
     *
     * @param myDB
     * @param matrice
     */
    @Override
    public void initMatrice(MyDB myDB, Matrice matrice) {
        int x = new Random().nextInt(get_rows());
        int y = new Random().nextInt(get_columns());
        String comName = " COMB  ";
        combattant=myDB.getMyList().get(0);
        combattant.set_combattantId(1);
        myDB.addCombattant(combattant);
        matrice.setMatriceSession( comName + combattant.get_combattantId(), y, x);
        redimentionner();
    }

    /**
     *
     * @return
     */
    public String sepaCol() {
        int j = 0;
        String _sepColumns = " ----------";
        while (j <= get_columns() + 1) {
            if (j == 0) {
                System.out.print(stringDeco);
            } else if (((j % 2) == 1) && (j == get_rows() + 1)) {
                System.out.print("  " + stringDeco);
            } else if (j != get_columns() + 1) {
                System.out.print(_sepColumns);
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
        int index =1;
        int v= getNombCombatsVS();
        while (this.getNombCombatsVS() > 0) {
            int x = new Random().nextInt(get_rows());
            int y = new Random().nextInt(get_columns());
            String comName = " COMB  ";
            combattant = myDB.getMyList().get(index);
            combattant.set_combattantId(index);
            myDB.addCombattant(combattant);
            matrice.setMatriceSession(comName + combattant.get_combattantId(), y, x);
         index++;
         System.out.println(" VOULEZ VOUS FAIRE UNE ATTACK ? ");
            System.out.println(" 0 : OUI ");
            System.out.println(" 1: NON  ");
            int p = getInputReader().askIntLoop(2);
            if (p==0) setNombCombatsVS(v--);

            modeCombat(myDB,matrice);
        }

    }

    /**
     *
     * @param matrice
     */
    public void videMatrice(Matrice matrice) {
        int j = 0;
        int i = 0;
        while (i < get_columns()) {
            j = 0;
            while (j < get_rows()) {
                    matrice.setMatriceSession("  Vide   ", i, j);                }
                j++;
            }
            i++;
    }

    /**
     *
     */
    public void retirereCombat() {

    }


}
