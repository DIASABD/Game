package Domaine.CalculAleatoire;

import java.util.Scanner;

public class InputReader {


    Scanner in;

    /**
     *
     */
    public InputReader() {
        this.in = new Scanner(System.in);
    }

    /**
     *
     * @param excludedMax
     * @return
     */
    public int askIntLoop(int excludedMax) {

        int select = -1;

        while (true) {
            String strInput = this.in.nextLine();

            try {
                select = Integer.parseInt(strInput);
            } catch (Exception e) {
            }

            if (select >= 0 && select < excludedMax) {
                return select;
            }

            System.out.println("Erreur");
            System.out.println("Veuillez entrer un nombre compris entre 0 et " + (excludedMax - 1));
        }
    }

    /**
     *
     * @return
     */
    public String askStringtLoop() {

        String select = null;

        while (true) {

            try {
                select = this.in.nextLine();

            } catch (Exception e) {

                }

            if (select != null) {
                return select;
            }

        }
    }

}
