package m1.dcll.projetbowling;

/**
 * Created by bah on 09/03/16.
 */
public class Spare extends Jeu{
    private int scorePremier;
    private int scoreDeuxieme;
    private Jeu jeu;
    public Spare(int score1, int score2, Jeu jeu){
        this.jeu = jeu;
        this.scorePremier =score1;
        this.scoreDeuxieme = score2;
    }
    public Spare(int score1, int score2){

        this.scorePremier = score1;
        this.scoreDeuxieme = score2;
    }
    @Override
    public int getScore() {
        return (scorePremier+scoreDeuxieme);
    }
}
