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

        if(tabJeu.get(9) instanceof Strike) return !(tabJeu.size()==12);

        if(tabJeu.get(9) instanceof Spare) return !(tabJeu.size()==11);

        if (tabJeu.get(9) instanceof Frame) return !(tabJeu.size()==10);

        for(int i=0; i< tabJeu.size(); i++){
            return vilideScore(tabJeu.get(i));
        }

        return true;
    }
    private boolean vilideScore(Jeu jeu){
        if(jeu instanceof Strike) return  !(((Strike)jeu).getScore()==10);
        if(jeu instanceof Spare) return  !(((Spare)jeu).getScore() ==10);
        if(jeu instanceof Frame) return !(((Frame)jeu).getScore()<10);
        return true;
    }
}
