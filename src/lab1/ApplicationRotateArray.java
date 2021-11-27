package lab1;

import java.util.Arrays;
import java.util.Scanner;

public class Application {
    /*
    *

    Given an array of n integers and a number d, write a Java method that
    performs d left rotations on the array. Then print the updated array as a
    single line of space-separated integers.

     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer[] arrayToRotate = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(arrayToRotate));
        System.out.print("\nEnter number of left rotations: ");
        int numberOfRotations = input.nextInt();

        leftRotate(arrayToRotate, numberOfRotations);
        System.out.println(Arrays.toString(arrayToRotate));
    }

    /**
     * Shifts elements to the left until given number of rotations.
     * @param arrayToRotate       array to shift
     * @param numberOfRotations         index to shift elements to the left by
     * @param <E>       type of array (Integer, String etc)
     */
    public static<E> void leftRotate(E[] arrayToRotate, int numberOfRotations) {
        E[] temp = arrayToRotate.clone();

        for(int i = numberOfRotations; i < arrayToRotate.length; i++)
            arrayToRotate[i - numberOfRotations] = arrayToRotate[i];

        for(int i = 0; i < numberOfRotations; i++)
            arrayToRotate[i + arrayToRotate.length - numberOfRotations] = temp[i];
    }
}
