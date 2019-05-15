package probability.impl;

import probability.ProbabilityPerformer;
import probability.RandomNumberPicker;

import java.util.*;

public class ProbabilityPerformerImp implements ProbabilityPerformer {

    private static final boolean WIN = true;
    private static final boolean LOSS = false;
    private static final int TEN_PERCENT_WINNING_RANGE = 1;
    private static final int TWENTY_PERCENT_WINNING_RANGE = 2;
    private static final int THIRTY_PERCENT_WINNING_RANGE = 3;
    private static List<Integer> numbersFor10PercentProbability = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    private static List<Integer> numbersFor20PercentProbability = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    private static List<Integer> numbersFor30PercentProbability = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    private RandomNumberPicker randomNumberPicker;

    public ProbabilityPerformerImp(RandomNumberPicker randomNumberPicker) {
        this.randomNumberPicker = randomNumberPicker;
    }

    /**
     * Method for performing 10% probability of winning.
     * Number 1 represented as winning, other number range (from 2 to 10) as a loss.
     */
    public boolean perform10PercentProbability() {
        Integer pickedNumber = randomNumberPicker.numberPick(numbersFor10PercentProbability);

        if (pickedNumber > TEN_PERCENT_WINNING_RANGE) {
            return LOSS;

        } else {

            return WIN;
        }

    }

    /**
     * Method for performing 20% probability of winning.
     * Number range from 1 to 2 represented as winning, other number range (from 3 to 10) as a loss.
     */
    public boolean perform20PercentProbability() {
        Integer pickedNumber = randomNumberPicker.numberPick(numbersFor20PercentProbability);

        if (pickedNumber > TWENTY_PERCENT_WINNING_RANGE) {
            return LOSS;

        } else {

            return WIN;
        }

    }

    /**
     * Method for performing 30% probability of winning.
     * Number range from 1 to 3 represented as winning, other number range (from 4 to 10) as a loss.
     */
    public boolean perform30PercentProbability() {
        Integer pickedNumber = randomNumberPicker.numberPick(numbersFor30PercentProbability);

        if (pickedNumber > THIRTY_PERCENT_WINNING_RANGE) {
            return LOSS;

        } else {

            return WIN;
        }
    }


}
