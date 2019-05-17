package bonusgame;

import bonusgame.BonusGame;
import bonusgame.impl.BonusGameImpl;
import bonusgame.pojo.Game;
import probability.BoxPicker;
import probability.ProbabilityPerformer;
import probability.RandomNumberPicker;
import probability.impl.BoxPickerImpl;
import probability.impl.ProbabilityPerformerImp;
import probability.impl.RandomNumberPickerImpl;

import java.util.Scanner;

public class BonusGameRunner {
    public static void main(String[] args) {
        Game game = new Game();
        BonusGame bonusGame = new BonusGameImpl();
        RandomNumberPicker randomNumberPicker = new RandomNumberPickerImpl();
        BoxPicker boxPicker = new BoxPickerImpl();
        ProbabilityPerformer performer = new ProbabilityPerformerImp(randomNumberPicker, boxPicker);

        System.out.println("Please enter a number of bets:");
        Scanner scanner = new Scanner(System.in);
        int betsAmount = scanner.nextInt();

        while ((game.getBet() < betsAmount)) {
            bonusGame.playBasicRound(game, performer);
        }

        System.out.println("Bets: " + game.getBet());
        System.out.println("Wins: " + game.getWins());
        System.out.println("Amount of won coins: " + game.getWonCoins());
        System.out.println("Amount of spent coins: " + game.getSpentCoins());
        System.out.println("Amount of bonus Rounds: " + game.getBonusRounds());
        System.out.println("RTP :" + (float)game.getWonCoins()/game.getSpentCoins());
    }
}

