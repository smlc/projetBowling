package m1.dcll.projetbowling;

/**
 * Created by bah on 09/03/16.
 */
public class Strike extends Jeu{

    private int score;
    private Jeu premierJeu;
    private Jeu deuxiemeJeu;

    public Strike(Jeu premier, Jeu deuxieme){
        score = 10;
        premierJeu = premier;
        deuxiemeJeu = deuxieme;
    }
    public Strike(){
        score =10;
    }
    @Override
    public int getScore() {
        return score;
    }
}
