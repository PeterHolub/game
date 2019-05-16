import slotgame.impl.SlotGameImpl;
import slotgame.pojo.Game;
import probability.RandomNumberPicker;
import probability.impl.ProbabilityPerformerImp;
import probability.impl.RandomNumberPickerImpl;
import slotgame.SlotGame;

public class SlotGameRunner {
    public static void main(String[] args) {
        Game game = new Game();
        SlotGame slotGameImpl = new SlotGameImpl();
        RandomNumberPicker randomNumberPicker = new RandomNumberPickerImpl();
        ProbabilityPerformerImp performer = new ProbabilityPerformerImp(randomNumberPicker);

        for (int i = 0; i < 100000; i++) {

            slotGameImpl.playNormalRound(game, performer);

        }

        System.out.println("Bets: " + game.getBet());
        System.out.println("Wins: " + game.getWins());
        System.out.println("FreeRound: " + game.getWonFreeRounds());
        System.out.println("Amount of won coins: " + game.getWonCoins());
        System.out.println("Amount of spent coins: " + game.getSpentCoins());
    }
}
