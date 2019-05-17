package probability.impl;

import probability.BoxPicker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Class implementation of BoxPicker interface based on java Random class.
 */
public class BoxPickerImpl implements BoxPicker {
    private static final int FIRST_NUMBER_AFTER_SHUFFLE = 0;
    private List<Integer> fiveBox = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

    /**
     * Method for picking random box
     *
     * @return number of picked box
     */
    @Override
    public int boxPick() {
        Collections.shuffle(fiveBox);
        Integer pickedBox= fiveBox.get(FIRST_NUMBER_AFTER_SHUFFLE);
        fiveBox.remove(pickedBox);
        return pickedBox;
    }
}
