package Domaine.RessourcesCombattants;

import Domaine.CalculAleatoire.NombreAleatoire;

public class Habilities {

    int STR, DEX, CON, INT, WIS, CHA;


    public Habilities() {

    }

    /**
     *
     * @return
     */
    public int getSTR() {
        return STR;
    }

    /**
     *
     * @return
     */
    public int getDEX() {
        return DEX;
    }

    /**
     *
     * @return
     */
    public int getCON() {
        return CON;
    }

    /**
     *
     * @return
     */
    public int getINT() {
        return INT;
    }

    /**
     *
     * @return
     */
    public int getWIS() {
        return WIS;
    }

    /**
     *
     * @return
     */
    public int getCHA() {
        return CHA;
    }

    /**
     *
     * @param STR
     */
    public void setSTR(int STR) {
        this.STR = new NombreAleatoire().calculScore(STR);
    }

    /**
     *
     * @param DEX
     */
    public void setDEX(int DEX) {
        this.DEX = new NombreAleatoire().calculScore(DEX
        );
    }

    /**
     *
     * @param CON
     */
    public void setCON(int CON) {
        this.CON = new NombreAleatoire().calculScore(CON);
    }

    /**
     *
     * @param INT
     */
    public void setINT(int INT) {
        this.INT = new NombreAleatoire().calculScore(INT);
    }

    /**
     *
     * @param WIS
     */
    public void setWIS(int WIS) {
        this.WIS = new NombreAleatoire().calculScore(WIS);
    }

    /**
     *
     * @param CHA
     */
    public void setCHA(int CHA) {
        this.CHA = new NombreAleatoire().calculScore(CHA);
    }
}
