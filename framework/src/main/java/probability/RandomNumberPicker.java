package probability;
/**
 * Defines method for generating random numbers
 */
public interface RandomNumberPicker {
    /**
     * Method for generating random numbers
     * @param bound range of numbers
     * @return returns random number from numbers bound
     */
    int numberPick(int bound);
}
