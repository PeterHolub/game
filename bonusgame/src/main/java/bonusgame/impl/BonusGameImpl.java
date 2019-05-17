package bonusgame.impl;

import bonusgame.BonusGame;
import bonusgame.pojo.Game;
import probability.ProbabilityPerformer;

public class BonusGameImpl implements BonusGame {
    private static final boolean WIN = true;
    private static final boolean LOSS = false;
    private static final int BONUS_ROUND_EVENTS = 1;
    private static final int BONUS_ROUND_OUTCOMES = 10;
    private static final int FINISH_GAME_EVENTS = 1;

    public boolean playBasicRound(Game game, ProbabilityPerformer performer) {
        boolean gameContinue = true;
        game.setBet();
        game.setSpentCoins();
        boolean bonusRound = performer.performPercentProbability(BONUS_ROUND_EVENTS, BONUS_ROUND_OUTCOMES);


        if (bonusRound) {
            game.setBonusRounds();
            gameContinue = this.playBonusRound(game, performer);
        }
        return gameContinue;

    }

    public boolean playBonusRound(Game game, ProbabilityPerformer performer) {
        boolean pickedBox = performer.performPercentProbabilityForBox(FINISH_GAME_EVENTS);
        if (pickedBox) {
            game.setWins();
            game.setWonCoins();
            return WIN;

        } else return LOSS;

    }
}
