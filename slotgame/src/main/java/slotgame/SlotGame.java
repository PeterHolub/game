package slotgame;

import slotgame.pojo.Game;
import probability.ProbabilityPerformer;

/**
 * Interface that defines methods for playing slot game
 */
public interface SlotGame {
    /**
     * Method for playing normal round
     *
     * @param game      instance of Game object
     * @param performer instance of ProbabilityPerformer to generate probability in game process
     */
    void playNormalRound(Game game, ProbabilityPerformer performer);

    /**
     * Method for playing free round
     *
     * @param game      instance of Game object
     * @param performer instance of ProbabilityPerformer to generate probability in game process
     */
    void playFreeRound(Game game, ProbabilityPerformer performer);
}
