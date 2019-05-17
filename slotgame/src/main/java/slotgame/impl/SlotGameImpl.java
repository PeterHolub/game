package slotgame.impl;

import slotgame.SlotGame;
import slotgame.pojo.Game;
import probability.ProbabilityPerformer;


/**
 * Class implementation of SlotGame interface
 */
public class SlotGameImpl implements SlotGame {
    private static final int NORMAL_ROUND_EVENTS = 3;
    private static final int FREE_ROUND_EVENTS = 1;
    private static final int OUTCOMES = 10;

    /**
     * Method for playing normal round
     *
     * @param game      instance of Game object
     * @param performer instance of ProbabilityPerformer to generate probability in game process
     */
    public void playNormalRound(Game game, ProbabilityPerformer performer) {
        boolean winCoins = performer.performPercentProbability(NORMAL_ROUND_EVENTS, OUTCOMES);
        boolean winFreeRound = performer.performPercentProbability(FREE_ROUND_EVENTS, OUTCOMES);

        game.setBet();
        game.setSpentCoins();

        if (winCoins) {
            game.setWinsAndWinCoins();
        }
        if (winFreeRound) {
            game.setWonFreeRounds();
            this.playFreeRound(game, performer);
        }
    }

    /**
     * Method for playing free round
     *
     * @param game      instance of Game object
     * @param performer instance of ProbabilityPerformer to generate probability in game process
     */
    public void playFreeRound(Game game, ProbabilityPerformer performer) {

        boolean winCoins = performer.performPercentProbability(NORMAL_ROUND_EVENTS, OUTCOMES);
        boolean winFreeRound = performer.performPercentProbability(FREE_ROUND_EVENTS, OUTCOMES);

        game.setBet();
        if (winCoins) {
            game.setWinsAndWinCoins();
            game.setWinsInFreeRound();
        }
        if (winFreeRound) {
            game.setWonFreeRounds();
            this.playFreeRound(game, performer);
        }

    }
}

