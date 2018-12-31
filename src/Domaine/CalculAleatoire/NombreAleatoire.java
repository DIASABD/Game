package Domaine.CalculAleatoire;

import java.util.Random;

public class NombreAleatoire {

    public NombreAleatoire() {
    }

    final int min = 1;
    final int max = 8;

    /**
     *
     * @param min
     * @param max
     * @return
     */
    public int calcul(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    /**
     *
     * @param tab
     */
    public void initTab(int[] tab) {
        int i = 0;
        while (i < tab.length) {
            tab[i] = this.calcul(min, max);
            i++;
        }
    }

    /**
     *
     * @param tab
     * @return
     */
    public int minimum(int[] tab) {
        int min = tab[0];
        int i = 0;
        while (i < tab.length - 1) {
            if (min > tab[i + 1]) {
                min = tab[i + 1];
            }
            i++;
        }
        return min;
    }

    /**
     *
     * @param nombScore
     * @return
     */
    public int calculScore(int nombScore) {
        int[] tab = new int[nombScore];
        initTab(tab);
        int x = this.minimum(tab);
        int i = 0;
        int resul = 0;
        while (i < tab.length) {
            resul += tab[i];
            i++;
        }

        return resul - x;
    }


}
