package lab1;

import java.util.Arrays;

public class ExtensionE {
    /*
    * A left rotation operation on an array of size shifts each of the array's
    elements unit to the left. For example, if 2 left rotations are performed on
    array [1,2,3,4,5], then the array would become [3,4,5,1,2].

    Given an array of n integers and a number d, write a Java method that
    performs d left rotations on the array. Then print the updated array as a
    single line of space-separated integers.

    Example input: [1,2,3,4,5],2
    Example output: [3,4,5,1,2]
     */
    public static void main(String[] args) {
//        System.out.println(Math.abs(0 - 6) % 5);
        Integer[] arr = {1, 2, 3, 4, 5};
        leftRotate(arr, 4);
        System.out.println(Arrays.toString(arr));
    }

    /**
     *
     * @param arr       array to shift
     * @param d         index to shift elements to the left by
     * @param <E>       type of array (Integer, String etc)
     */
    public static<E> void leftRotate(E[] arr, int d) {
        E[] temp = arr.clone();
        for(int i = d; i < arr.length; i++)
            arr[i - d] = arr[i];

        for(int i = 0; i < d; i++)
            arr[i + arr.length - d] = temp[i];
    }
}
