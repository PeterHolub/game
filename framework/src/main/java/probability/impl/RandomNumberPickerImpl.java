package probability.impl;

import probability.RandomNumberPicker;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RandomNumberPickerImpl implements RandomNumberPicker {

    private static final int FIRST_NUMBER_AFTER_SHUFFLE = 0;

    public Integer numberPick(List<Integer> numbers) {

        Collections.shuffle(numbers);

        Integer pickedNumber = numbers.get(FIRST_NUMBER_AFTER_SHUFFLE);

        numbers.remove(pickedNumber);

        if (numbers.size() == 0) {

            numbers.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        } else {
            Collections.shuffle(numbers);
        }
        return pickedNumber;
    }

}