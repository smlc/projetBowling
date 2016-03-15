package m1.dcll.projetbowling;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mars on 13/03/16.
 */
public class StrikeTest {

    @Test
    public void testGetScore() throws Exception {

        //Given
        Jeu leJeu = new Strike();
        Jeu leJeu1 = new Strike(new Frame(5),new Frame(10));
        Jeu leJeu2 = new Strike(new Strike(),new Strike());
        //Then
        assertEquals(10,leJeu.getScore());
        assertEquals(25,leJeu1.getScore());
        assertEquals(30,leJeu2.getScore());
    }
}