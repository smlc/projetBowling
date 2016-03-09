package m1.dcll.projetbowling;

/**
 * Created by bah on 09/03/16.
 */
public class Spare extends Jeu{
    private int score;
    private Jeu jeu;
    public Spare(int score, Jeu jeu){
        this.jeu = jeu;
        this.score =score;
    }
    public Spare(int score){
        this.score =score;
    }
    @Override
    public int getScore() {
        return score;
    }
}
