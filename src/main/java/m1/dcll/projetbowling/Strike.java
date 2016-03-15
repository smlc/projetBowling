package m1.dcll.projetbowling;

/**
 * Created by bah on 09/03/16.
 */
public class Strike extends Jeu{

    private int score;
    private int quille;
    private Jeu premierJeu;
    private Jeu deuxiemeJeu;

    public Strike(Jeu premier, Jeu deuxieme){
        quille = 10;
        premierJeu = premier;
        deuxiemeJeu = deuxieme;
        score = quille + premierJeu.getQuille() + deuxiemeJeu.getQuille();
    }
    public Strike(){
        score = 10;
        quille = 10;
    }

    @Override
    public int getScore() {
        return this.score ;
    }

    @Override
    public int getQuille() {
        return quille;
    }


}
