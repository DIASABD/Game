package Domaine.RessourcesCombattants;

public enum ArmureTypes {

    Aucune_armure("aucune armure"),
    Armure_leger("armure legere"),
    Armure_moyenne("armure moyenne"),
    Armure_lourde("armure lourde");


    private String _type;

    /**
     *
     * @param type
     */
    ArmureTypes(String type) {
        this._type = type;
    }

}
