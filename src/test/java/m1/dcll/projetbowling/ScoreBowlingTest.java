package m1.dcll.projetbowling;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by mars on 13/03/16.
 */
public class ScoreBowlingTest {

    @Test
    public void testCalculeScore() throws Exception {

        //Given
        Jeu strike11 = new Strike();
        assertEquals(10,strike11.getScore());
        Jeu strike12 = new Strike();
        assertEquals(10,strike12.getScore());
        Jeu strike10 = new Strike(strike11, strike12);
        assertEquals(30,strike10.getScore());
        Jeu strike9 = new Strike(strike10, strike11);
        assertEquals(30,strike9.getScore());
        Jeu strike8 = new Strike(strike9, strike10);
        assertEquals(30,strike8.getScore());
        Jeu strike7 = new Strike(strike8, strike9);
        assertEquals(30,strike7.getScore());
        Jeu strike6 = new Strike(strike7, strike8);
        assertEquals(30,strike6.getScore());
        Jeu strike5 = new Strike(strike6, strike7);
        assertEquals(30,strike5.getScore());
        Jeu strike4 = new Strike(strike5, strike6);
        assertEquals(30,strike4.getScore());
        Jeu strike3 = new Strike(strike4, strike5);
        assertEquals(30,strike3.getScore());
        Jeu strike2 = new Strike(strike3, strike4);
        assertEquals(30,strike2.getScore());
        Jeu strike1 = new Strike(strike2, strike3);
        assertEquals(30,strike1.getScore());

        List<Jeu> tabJeu = new ArrayList<Jeu>();
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
       /* tabJeu.add(strike11);
        tabJeu.add(strike12);*/
        //When
        ScoreBowling scoreBowling = new ScoreBowling(tabJeu);

        //Then

        //assertEquals(300,scoreBowling.calculeScore());
    }
}