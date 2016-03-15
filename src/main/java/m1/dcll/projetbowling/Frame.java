package m1.dcll.projetbowling;

/**
 * Created by bah on 09/03/16.
 */
public class Frame extends Jeu {
<<<<<<< HEAD
    int score;

    public Frame(int score){
        this.score = score;
=======
    private int scorePremier;
    private int scoreDeuxieme;
    public Frame(int score1, int score2){
        this.scorePremier = score1;
        this.scoreDeuxieme = score2;
>>>>>>> 5d72d40a48896b1b12ec482b680cc457a2e382ed
    }

    @Override
    public int getScore() {
        return (this.scorePremier+this.scoreDeuxieme);
    }

    @Override
    public int getQuille() {
        return score;
    }


}
