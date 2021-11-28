package lab1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationRotateArrayTest {

    @Test
    void twoRotations() {
        Integer[] arrayToRotate = {1, 2, 3, 4, 5};
        int numberOfRotations = 2;

        ApplicationRotateArray.leftRotate(arrayToRotate, numberOfRotations);

        Integer[] actuals = arrayToRotate;
        Integer[] expecteds = {3, 4, 5, 1, 2};

        assertArrayEquals(expecteds, actuals);
    }

    @Test
    void fiveRotations() {
        Integer[] arrayToRotate = {1, 2, 3, 4, 5};
        int numberOfRotations = 5;

        ApplicationRotateArray.leftRotate(arrayToRotate, numberOfRotations);

        Integer[] actuals = arrayToRotate;
        Integer[] expecteds = {1, 2, 3, 4, 5};

        assertArrayEquals(expecteds, actuals);
    }
}