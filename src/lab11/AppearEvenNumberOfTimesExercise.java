package lab11;

import java.util.Arrays;

/**
 * You are given an array of numbers with the following property: all numbers
 * appear an even number of times, with the exception of one.
 * For instance: [1,2,3,3,2,1,4,5,4] -> In this case the number 5 appears an
 * odd number of times. Write a function to find the number that appears an
 * odd number of times.
 */
public class AppearEvenNumberOfTimesExercise {
    private final int[] array;

    public AppearEvenNumberOfTimesExercise(int[] array) {
        this.array = array;
    }

    /**
     * Iterates through array and sees if a number has appeared an even number of times.
     * @return
     */
    public int getNumberAppearingOddTimes() {
        int foundNumber = Integer.MAX_VALUE;
        int[] elementCount = new int[getHighestNumber()];

        for(int element : array)
            elementCount[element-1]++;

        for(int elementIterator = 0; elementIterator < elementCount.length; elementIterator++)
            if(elementCount[elementIterator] % 2 != 0)
                foundNumber = elementIterator+1;

        return foundNumber;
    }

    public int getHighestNumber() {
        int highest = Integer.MIN_VALUE;

        for(int element : array)
            if(element > highest)
                highest = element;
        return highest;
    }
}
