package m1.dcll.projetbowling;

/**
 * Created by bah on 09/03/16.
 */
public class Spare extends Jeu{
    private int score;
    public int quille;
    private Jeu jeu;
    public Spare(int score, Jeu jeu){
        this.jeu = jeu;
        this.score =score;
    }
    public Spare(int score, int quille){
        this.score =score;
        this.quille = quille;
    }
    @Override
    public int getScore() {
        return score;
    }

    @Override
    public int getQuille() {
        return quille;
    }


}
