package m1.dcll.projetbowling;

/**
 * Created by bah on 09/03/16.
 */
public class Frame extends Jeu {
    int score;

    public Frame(int score){
        this.score = score;
    }

    @Override
    public int getScore() {
        return this.score;
    }

    @Override
    public int getQuille() {
        return score;
    }


}
