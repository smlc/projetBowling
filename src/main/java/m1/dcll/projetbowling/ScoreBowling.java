package m1.dcll.projetbowling;

import java.util.ArrayList;

/**
 * Created by bah on 09/03/16.
 */
public class ScoreBowling {
    private ArrayList<Jeu> tabJeu;
    public ScoreBowling(ArrayList<Jeu> jeux){
        tabJeu = new ArrayList<Jeu>(jeux);
    }

    public boolean valideSequence(){
        if(tabJeu.size()<10)

        if( (tabJeu.get(9) instanceof Strike) && (tabJeu.size()!=12)) return false;

        if( (tabJeu.get(9) instanceof Spare) && (tabJeu.size()!=11)) return false;

        if ( (tabJeu.get(9) instanceof Frame) && (tabJeu.size()!=10)) return false;

        for(int i=0; i< tabJeu.size(); i++){
            if(!valideScore(tabJeu.get(i))) return  false;
        }

        return true;
    }
    private boolean valideScore(Jeu jeu){
        if( (jeu instanceof Spare) && ((Spare)jeu).getScore() !=10) return false;
        if( (jeu instanceof Frame) && (((Frame)jeu).getScore()>=10)) return false;
        return true;
    }
}
