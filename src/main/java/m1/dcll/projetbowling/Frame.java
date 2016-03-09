package m1.dcll.projetbowling;

/**
 * Created by bah on 09/03/16.
 */
public class Frame extends Jeu {
    private int scorePremier;
    private int scoreDeuxieme;
    public Frame(int score1, int score2){
        this.scorePremier = score1;
        this.scoreDeuxieme = score2;
    }
    @Override
    public int getScore() {
        return (this.scorePremier+this.scoreDeuxieme);
    }
}
