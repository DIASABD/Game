package Domaine.Joueur;

import BD.MyDB;
import Domaine.CalculAleatoire.InputReader;
import Domaine.Combattant.Combattant;
import Domaine.Combattant.GestionJoueurManuel;
import Domaine.Combattant.Matrice;
import Domaine.Controleur.Arene;
import Domaine.Controleur.ModeCombat;
import Domaine.Controleur.VS;
import Domaine.IntelligenceArtificielle.CreerCombattantsAuto;

public  class Player {

    final int _columns = 8;
    final int _rows = 8;

    InputReader inputReader;
    Combattant joueur;
    ModeCombat modeCombat ;
    MyDB myDB;
    Matrice matrice;
    GestionJoueurManuel gestionJoueurManuel;
    CreerCombattantsAuto creerCombattantsAuto;

    int joueurID;
    int nbTotalCombattant;
    int nombCombatsVS;

    /**
     *
     * @return
     */
    public int getnbTotalCombattant() {
        return nbTotalCombattant;
    }

    /**
     *
     * @return
     */
    public int get_columns() {
        return _columns;
    }

    /**
     *
     * @return
     */
    public int get_rows() {
        return _rows;
    }

    /**
     *
     * @return
     */
    public InputReader getInputReader() {

        return inputReader;
    }

    /**
     *
     * @return
     */
    public ModeCombat getModeCombat() {

        return modeCombat;
    }

    /**
     *
     * @param matrice
     */
    public void setMatrice(Matrice matrice) {
        this.matrice = matrice;
    }

    /**
     *
     * @return
     */
    public Matrice getMatrice() {

        return matrice;
    }

    /**
     *
     * @return
     */
    public MyDB getMyDB() {

        return myDB;
    }

    /**
     *
     * @param myDB
     */
    public void setMyDB(MyDB myDB) {

        this.myDB = myDB;
    }

    /**
     *
     * @param modeCombat
     */
    public void setModeCombat(ModeCombat modeCombat) {
        this.modeCombat = modeCombat;

    }

    /**
     *
     * @param nombCombatsVS
     */
    public void setNombCombatsVS(int nombCombatsVS) {
        this.nombCombatsVS = nombCombatsVS;
    }

    /**
     *
     * @return
     */
    public int getNombCombatsVS() {

        return nombCombatsVS;
    }

    /**
     *
     */
    public Player() {
        this.inputReader = new InputReader();
        this.joueurID = 0;
        this.myDB = new  MyDB();
        this.inputReader =new InputReader();
        this.nbTotalCombattant= 15;
        this.creerCombattantsAuto = new CreerCombattantsAuto(nbTotalCombattant);
        creerCombattantsAuto.initialiser(nbTotalCombattant,myDB);
        this.matrice = new Matrice(_columns,_rows);
        this.nombCombatsVS =15;

    }

    /**
     *
     * @return
     */
    public int getJoueurID() {
        return joueurID;
    }

    /**
     *
     * @param joueur
     */
    public void setJoueur(Combattant joueur) {
        this.joueur = joueur;
    }

    /**
     *
     * @return
     */
    public Combattant getJoueur() {
        return joueur;
    }

    /**
     *
     */
    void sauvegarder(){

    }




}
