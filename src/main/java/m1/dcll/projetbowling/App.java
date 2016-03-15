package m1.dcll.projetbowling;

import java.util.ArrayList;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {
        ArrayList<Jeu> tabJeu = new ArrayList<Jeu>();

        Strike strike11 = new Strike();
        Strike strike12 = new Strike();
        Strike strike10 = new Strike(strike11, strike12);
        Strike strike9 = new Strike(strike10, strike10);
        Strike strike8 = new Strike(strike9, strike10);
        Strike strike7 = new Strike(strike8, strike9);
        Strike strike6 = new Strike(strike7, strike8);
        Strike strike5 = new Strike(strike6, strike7);
        Strike strike4 = new Strike(strike5, strike6);
        Strike strike3 = new Strike(strike4, strike5);
        Strike strike2 = new Strike(strike3, strike4);
        Strike strike1 = new Strike(strike2, strike3);

        tabJeu.add(strike1);
        tabJeu.add(strike2);
        tabJeu.add(strike3);
        tabJeu.add(strike4);
        tabJeu.add(strike5);
        tabJeu.add(strike6);
        tabJeu.add(strike7);
        tabJeu.add(strike8);
        tabJeu.add(strike9);
        tabJeu.add(strike10);
        tabJeu.add(strike11);
        tabJeu.add(strike12);
        ScoreBowling scoreBowling = new ScoreBowling(tabJeu);
        System.out.println(" Valide : " + scoreBowling.valideSequence());
    }
}
