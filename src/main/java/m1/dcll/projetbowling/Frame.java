package m1.dcll.projetbowling;

/**
 *  @author mars
 */

public class Frame extends Jeu {

    int score;

    /**
     *
     *   @param score
     */
    public Frame(int score) {
        this.score = score;

    }

    /**
     *
     * @return Le score réalisée lors du frame
     */
    @Override
    public int getScore() {
        return score;
    }

    @Override
    public int getQuille() {
        return score;
    }


}
