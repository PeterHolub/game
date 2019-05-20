package slotgame;

import probability.ProbabilityPerformer;
import slotgame.impl.SlotGameImpl;
import slotgame.pojo.Game;
import probability.RandomNumberPicker;
import probability.impl.ProbabilityPerformerImp;
import probability.impl.RandomNumberPickerImpl;

import java.util.Scanner;

public class SlotGameRunner {
    public static void main(String[] args) {
        Game game = new Game();
        SlotGame slotGameImpl = new SlotGameImpl();
        RandomNumberPicker randomNumberPicker = new RandomNumberPickerImpl();
        ProbabilityPerformer performer = new ProbabilityPerformerImp(randomNumberPicker);

        System.out.println("Please enter a number of bets:");
        Scanner scanner = new Scanner(System.in);
        int numberOfRounds = scanner.nextInt();

        while (game.getBet() < numberOfRounds) {
            slotGameImpl.playNormalRound(game, performer);
        }

        System.out.println("Bets: " + game.getBet());
        System.out.println("Wins: " + game.getWins());
        System.out.println("FreeRound: " + game.getWonFreeRounds());
        System.out.println("Amount of won coins: " + game.getWonCoins());
        System.out.println("Amount of spent coins: " + game.getSpentCoins());
        System.out.println("Wins in free round: " + game.getWinsInFreeRound());
        System.out.println("RTP :" + (float) game.getWonCoins() / game.getSpentCoins());
    }
}
