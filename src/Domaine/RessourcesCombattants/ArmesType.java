package Domaine.RessourcesCombattants;

public enum ArmesType {

    DAGUE_MELLE("Dague"),
    EPEE_DISTANCE("DAGUE_DISTANCE"),
    EPEE_1_MAIN("EPEE_1_MAIN"),
    EPEE_2_MAINS("EPEE_2_MAIN"),
    ARC("Arc"),
    HACHE("Hache"),
    ARBALETE("Arbalete"),
    Massue("Massue");
    private String _name;

    /**
     *
     * @param name
     */
    ArmesType(String name) {
        this._name = name;
    }

}
