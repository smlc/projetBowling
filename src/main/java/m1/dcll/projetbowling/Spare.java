package m1.dcll.projetbowling;

/**
 * Created by bah on 09/03/16.
 */
public class Spare extends Jeu{

    private int score;
    public int quille;
    private Jeu jeu;
    public Spare(Jeu jeu,int quille){
        this.jeu = jeu;
        this.quille = quille;
        this.score = quille + jeu.getQuille();

    }
    public Spare( int quille){

        this.quille = quille;
        this.score = quille;

    }
    @Override
    public int getScore() {
        return score;
    }


    public int getQuille() {
        return quille;
    }


}
