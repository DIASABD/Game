package Domaine.Combattant;

import Domaine.CalculAleatoire.InputReader;
import Domaine.ExperienceCombattant.LevelState;
import Domaine.CalculAleatoire.NombreAleatoire;
import Domaine.RessourcesCombattants.ArmesType;
import Domaine.RessourcesCombattants.ArmureTypes;
import Domaine.RessourcesCombattants.HP;
import Domaine.RessourcesCombattants.Habilities;

public class Combattant {



    int _combattantId, positionX, positionY;
    CombattantsType combattantsType;
    Boolean _modeIA;
    LevelState _levelState;
    Habilities _hability;
    ArmesType _arme;
    ArmureTypes _armure;
    HP _pointDeVie;
    InputReader inputReader;
    String _nom;
    int AC;
    int exp_Point ;

    /**
     *
     * @param exp_Point
     */
    public void setExp_Point(int exp_Point) {
        this.exp_Point = exp_Point;
    }

    /**
     *
     * @return
     */
    public int getExp_Point() {
        return exp_Point;
    }

    /**
     *
     * @return
     */
    public NombreAleatoire getNombreAleatoire() {
        return nombreAleatoire;
    }

    NombreAleatoire nombreAleatoire;
    int dommage;

    /**
     *
     * @return
     */
    public int getDommage() {
        return dommage;
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
     * @param dommage
     */
    public void setDommage(int dommage) {

        this.dommage = dommage;
    }

    boolean bouclier;

    /**
     *
     * @return
     */
    public boolean isBouclier() {
        return bouclier;
    }

    /**
     *
     * @param bouclier
     */
    public void setBouclier(boolean bouclier) {
        this.bouclier = true;
    }

    /**
     *
     * @return
     */
    public int getAC() {
        return AC;
    }

    /**
     *
     * @param AC
     */
    public void setAC(int AC) {

        this.AC = AC;
    }

    /**
     *
     * @return
     */
    public String get_nom() {
        return _nom;
    }

    /**
     *
     * @param _nom
     */
    public void set_nom(String _nom) {
        this._nom = _nom;
    }

    /**
     *
     * @param combattantsType
     */
    public void setCombattantsType(CombattantsType combattantsType) {
        this.combattantsType = combattantsType;
    }

    /**
     *
     * @return
     */
    public CombattantsType getCombattantsType() {
        return combattantsType;
    }

    /**
     *
     * @return
     */
    public int get_combattantId() {
        return _combattantId;
    }

    /**
     *
     * @return
     */
    public Boolean get_modeIA() {
        return _modeIA;
    }

    /**
     *
     * @return
     */
    public LevelState get_levelState() {
        return _levelState;
    }

    /**
     *
     * @return
     */
    public Habilities get_hability() {
        return _hability;
    }

    /**
     *
     * @return
     */
    public ArmesType get_arme() {
        return _arme;
    }

    /**
     *
     * @return
     */
    public ArmureTypes get_armure() {
        return _armure;
    }

    /**
     *
     * @return
     */
    public HP get_pointDeVie() {
        return _pointDeVie;
    }

    /**
     *
     * @param _combattantId
     */
    public void set_combattantId(int _combattantId) {
        this._combattantId = _combattantId;
    }

    /**
     *
     * @param _modeIA
     */
    public void set_modeIA(Boolean _modeIA) {
        this._modeIA = _modeIA;
    }

    /**
     *
     * @param _levelState
     */
    public void set_levelState(LevelState _levelState) {
        this._levelState = _levelState;
    }

    /**
     *
     * @param _hability
     */
    public void set_hability(Habilities _hability) {
        this._hability = _hability;
    }

    /**
     *
     * @param _arme
     */
    public void set_arme(ArmesType _arme) {
        this._arme = _arme;
    }

    /**
     *
     * @param _armure
     */
    public void set_armure(ArmureTypes _armure) {
        this._armure = _armure;
    }

    /**
     *
     * @param _pointDeVie
     */
    public void set_pointDeVie(HP _pointDeVie) {
        this._pointDeVie = _pointDeVie;
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

    /**
     *
     * @param positionX
     */
    public void setPositionX(int positionX) {

        this.positionX = positionX;
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
     * @param combattantId
     */
    public Combattant(int combattantId) {
        this._combattantId = 0;
        this._hability = new Habilities();
        this.inputReader = new InputReader();
        nombreAleatoire = new NombreAleatoire();
    }


}
