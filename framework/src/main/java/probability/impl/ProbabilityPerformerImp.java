package probability.impl;

import probability.BoxPicker;
import probability.ProbabilityPerformer;
import probability.RandomNumberPicker;

/**
 * Class implementation of ProbabilityPerformer interface
 */
public class ProbabilityPerformerImp implements ProbabilityPerformer {
    private static final boolean WIN = true;
    private static final boolean LOSS = false;
    private RandomNumberPicker randomNumberPicker;
    private BoxPicker boxPicker;

    /**
     * Constructor for passing instance of RandomNumberPicker implementation
     *
     * @param randomNumberPicker instance of RandomNumberPicker interface implementation
     */
    public ProbabilityPerformerImp(RandomNumberPicker randomNumberPicker) {
        this.randomNumberPicker = randomNumberPicker;
    }

    public ProbabilityPerformerImp(RandomNumberPicker randomNumberPicker, BoxPicker boxPicker) {
        this.randomNumberPicker = randomNumberPicker;
        this.boxPicker = boxPicker;
    }


    /**
     * Method for performing percentage probability of winning.
     * Calculating by getting number by RandomNumberPicker  from events/outcomes range.
     *
     * @param events   winning events
     * @param outcomes number of outcomes
     * @return boolean value representing true as win and false as loss
     */
    @Override
    public boolean performPercentProbability(int events, int outcomes) {
        int pickedNumber = randomNumberPicker.numberPick(outcomes);

        if (pickedNumber > events) {
            return LOSS;

        } else {

            return WIN;
        }

    }

    /**
     * Method for performing probability of endgame box pick
     *
     * @param events loss events
     * @return boolean value representing true as win and false as loss
     */

    public boolean performPercentProbabilityForBox(int events) {
        int pickedNumberOfBox = boxPicker.boxPick();
        if (pickedNumberOfBox == events) {
            return LOSS;

        } else {

            return WIN;
        }

    }
}
