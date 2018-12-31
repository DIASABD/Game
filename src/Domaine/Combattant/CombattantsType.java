package Domaine.Combattant;


public enum CombattantsType {

    Fighter(" Fighter  "),
    Wizard(" Wizard  "),
    Rogue(" Rogue   ");
    private String _type;

    /**
     *
     * @param type
     */
    CombattantsType(String type) {
        this._type = type;
    }
}
