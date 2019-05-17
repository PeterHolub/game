package bonusgame;

import bonusgame.impl.BonusGameImpl;
import bonusgame.pojo.Game;
import probability.BoxPicker;
import probability.ProbabilityPerformer;
import probability.RandomNumberPicker;
import probability.impl.BoxPickerImpl;
import probability.impl.ProbabilityPerformerImp;
import probability.impl.RandomNumberPickerImpl;

public class BonusGameRunner {
    public static void main(String[] args) {
        Game game = new Game();
        BonusGame bonusGame = new BonusGameImpl();
        RandomNumberPicker randomNumberPicker = new RandomNumberPickerImpl();
        BoxPicker boxPicker = new BoxPickerImpl();
        ProbabilityPerformer performer = new ProbabilityPerformerImp(randomNumberPicker,boxPicker);


        boolean gameContinue = true;
        while (gameContinue) {

         gameContinue=((BonusGameImpl) bonusGame).playBasicRound(game,performer);

        }

    }
}
