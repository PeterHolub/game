package probability;

public interface ProbabilityPerformer {
    /**
     * Method for performing 10% probability of winning.
     * Number 1 represented as winning, other number range (from 2 to 10) as a loss.
     */
    boolean perform10PercentProbability();

    /**
     * Method for performing 20% probability of winning.
     * Number range from 1 to 2 represented as winning, other number range (from 3 to 10) as a loss.
     */
    boolean perform20PercentProbability();

    /**
     * Method for performing 30% probability of winning.
     * Number range from 1 to 3 represented as winning, other number range (from 4 to 10) as a loss.
     */
    boolean perform30PercentProbability();
}
