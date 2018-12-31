package Domaine.Controleur;

import BD.MyDB;
import Domaine.Combattant.Combattant;
import Domaine.Combattant.Matrice;

public interface ModeCombat {

    void modeCombat(MyDB myDB, Matrice matrice);
    void initMatrice(MyDB myDB, Matrice matrice);
    void combat(MyDB myDB, Matrice matrice);



}
