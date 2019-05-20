package probability;

/**
 * Defines method for performing percentage probability of winning
 */
public interface ProbabilityPerformer {
    /**
     * Method for performing percentage probability of winning.
     * Calculating by getting number by RandomNumberPicker  from events/outcomes range.
     *
     * @param events   winning events
     * @param outcomes number of outcomes
     * @return boolean value representing true as win and false as loss
     */
    boolean performPercentProbability(int events, int outcomes);

    /**
     * Method for performing probability of endgame box pick
     *
     * @param events loss events
     * @return boolean value representing true as win and false as loss
     */
    boolean performPercentProbabilityForBox(int events);
}
