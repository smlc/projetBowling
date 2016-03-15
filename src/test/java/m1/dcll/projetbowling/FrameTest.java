package m1.dcll.projetbowling;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mars on 13/03/16.
 */
public class FrameTest {

    @Test
    public void testgetScore() throws Exception {

        //Given
        Jeu leJeu = new Frame(8);

        //Then
        assertEquals(8,leJeu.getScore());

    }

}