package Domaine.ExperienceCombattant;

import Domaine.Combattant.Combattant;
import Domaine.RessourcesCombattants.HP;

public interface LevelState {

    Combattant combattant = null;

    public void upadteLevel();
    public int getLevel();
}
