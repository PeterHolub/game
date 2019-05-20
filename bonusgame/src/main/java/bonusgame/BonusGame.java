package bonusgame;

import bonusgame.pojo.Game;
import probability.ProbabilityPerformer;

/**
 * Interface that defines methods for playing bonus game
 */
public interface BonusGame {
    /**
     * Method for playing basic round
     *
     * @param game      instance of Game object
     * @param performer instance of ProbabilityPerformer to generate probability in game process
     */
    void playBasicRound(Game game, ProbabilityPerformer performer);

    /**
     * Method for playing bonus round
     *
     * @param game      instance of Game object
     * @param performer instance of ProbabilityPerformer to generate probability in game process
     */
    boolean playBonusRound(Game game, ProbabilityPerformer performer);

}
