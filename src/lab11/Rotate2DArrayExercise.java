package lab11;
/**
 * - Given a bi-dimensional nxn (square) array, write a function to rotate its elements. Example:
 * [1 2 3
 *  4 5 6
 *  7 8 9]
 * After rotation:
 * [ 4 1 2
 *   7 5 3
 *   8 9 6]
 */

public class Rotate2DArrayExercise {
    private final int[][] twoDArray;

    public  Rotate2DArrayExercise(int[][] twoDArray) {
        this.twoDArray = twoDArray;
    }
    //rotates array to the right by the given number
    public void rotate(int rotateBy) {
        int[][] newArray = new int[twoDArray.length][twoDArray[0].length];
        int[] oneDArray = new int[twoDArray.length * twoDArray[0].length];

        for(int row = 0; row < twoDArray.length; row++) {
            //lay out in a two D field.
            for(int column = 0; column < twoDArray[0].length; column++) {
                int element = twoDArray[row][column];

            }
        }
    }

    public int[] get1DArray() {
        int[] oneDArray = new int[twoDArray.length * twoDArray[0].length];

        for(int row = 0; row < twoDArray.length; row++) {
            //lay out in a two D field.
            for(int column = 0; column < twoDArray[0].length; column++) {
                int element = twoDArray[row][column];
                if(row == 0)
                    oneDArray[row*column] = element;
                else
                    oneDArray[column] = element;
            }
        }

        return oneDArray;
    }

    public int[][] getTwoDArray() {
        return twoDArray;
    }
}
