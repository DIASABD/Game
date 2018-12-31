package Domaine.Combattant;

import Domaine.Combattant.Combattant;

public class Matrice {


    int _columns, _rows, positionX, positionY;

    Combattant combattant;

    public static String[][] matriceSession;

    /**
     *
     * @param positionX
     */
    public void setPositionX(int positionX) {

        this.positionX = positionX;
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
    public Combattant getCombattant() {
        return combattant;
    }

    /**
     *
     * @return
     */
    public static String[][] getMatriceSession() {
        return matriceSession;
    }

    /**
     *
     * @param _columns
     */
    public void set_columns(int _columns) {

        this._columns = _columns;
    }

    /**
     *
     * @param _rows
     */
    public void set_rows(int _rows) {
        this._rows = _rows;
    }

    /**
     *
     * @param positionY
     */
    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    /**
     *
     * @param combattant
     */
    public void setCombattant(Combattant combattant) {
        this.combattant = combattant;
    }

    /**
     *
     * @param valeur
     * @param y
     * @param x
     */
    public static void setMatriceSession(String valeur,int y,int x) {
       matriceSession[y][x] = valeur;
    }

    /**
     *
     * @param columns
     * @param rows
     */
    public Matrice(int columns, int rows) {

        this._columns = columns;
        this._rows = rows;
        this.matriceSession = new String[_columns][_rows];

    }

    /**
     *
     * @return
     */
    public int getPositionX() {
        return positionX;
    }

    /**
     *
     * @return
     */
    public int getPositionY() {
        return positionY;
    }


}


