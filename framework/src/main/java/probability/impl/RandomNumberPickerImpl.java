package probability.impl;

import probability.RandomNumberPicker;

import java.util.Random;

/**
 * Class implementation of RandomNumberPicker interface based on java Random class.
 */
public class RandomNumberPickerImpl implements RandomNumberPicker {
    private Random random = new Random();

    /**
     * Method for generating random numbers
     *
     * @param bound range of numbers
     * @return returns random number from numbers bound
     */
    public int numberPick(int bound) {
        return random.nextInt(bound) + 1;
    }

}