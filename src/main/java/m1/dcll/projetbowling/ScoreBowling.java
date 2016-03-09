package m1.dcll.projetbowling;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by bah on 09/03/16.
 */
public class ScoreBowling {
    private List<Jeu> tabJeu;

    public ScoreBowling(List<Jeu> jeux){
        tabJeu = new ArrayList<Jeu>(jeux);
    }

    public boolean valideSequence(){

        if( (tabJeu.get(9) instanceof Strike) && (tabJeu.size()!=12)) return false;

        if( (tabJeu.get(9) instanceof Spare) && (tabJeu.size()!=11)) return false;

        if ( (tabJeu.get(9) instanceof Frame) && (tabJeu.size()==10)) return false;

        for(int i=0; i< tabJeu.size(); i++){
            return valideScore(tabJeu.get(i));
        }

        return true;
    }
    private boolean valideScore(Jeu jeu){

        if(jeu instanceof Spare) return  !(((Spare)jeu).getScore() ==10);
        if(jeu instanceof Frame) return !(((Frame)jeu).getScore()<10);
        return true;
    }

    public int calculeScore(){
        int scoreJeu = 0;
        Iterator<Jeu> it = tabJeu.iterator();

        while (it.hasNext()){
             scoreJeu += it.next().getScore();
        }

        return scoreJeu;
    }

}
