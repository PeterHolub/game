import probability.RandomNumberPicker;
import probability.impl.ProbabilityPerformerImp;
import probability.impl.RandomNumberPickerImpl;

public class Game {
    public static void main(String[] args) {
        int looses = 0;
        int wins = 0;
        int looses2 = 0;
        int wins2 = 0;
        int looses3 = 0;
        int wins3 = 0;
        RandomNumberPicker randomNumberPicker = new RandomNumberPickerImpl();
        ProbabilityPerformerImp performer = new ProbabilityPerformerImp(randomNumberPicker);

        for (int i = 0; i < 65; i++) {
            boolean result = performer.perform30PercentProbability();
            boolean result2 = performer.perform20PercentProbability();
            boolean result3 = performer.perform10PercentProbability();
            if (!result) {
                looses++;
            } else {
                wins++;
            }
            if (!result2) {
                looses2++;
            } else {
                wins2++;
            }
            if (!result3) {
                looses3++;
            } else {
                wins3++;
            }
        }

        System.out.println("Looses: " + looses);
        System.out.println("Wins: " + wins);
        System.out.println("Looses: " + looses2);
        System.out.println("Wins: " + wins2);
        System.out.println("Looses: " + looses3);
        System.out.println("Wins: " + wins3);
    }
}
