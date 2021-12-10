package lab11;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * - Given a bi-dimensional nxn (square) array, write a function to rotate its elements. Example:
 * [1 2 3
 * 4 5 6
 * 7 8 9]
 * After rotation:
 *[4 1 2
 * 7 5 3
 * 8 9 6]
 */

class Rotate2DArrayTest {

    @Test
    public void testRotate() {
        int[][] twoDArray = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        Rotate2DArrayExercise app = new Rotate2DArrayExercise(twoDArray);
        int rotateBy = 1;

    }
    @Test
    public void turnTo1DArray() {
        int[][] twoDArray = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        Rotate2DArrayExercise app = new Rotate2DArrayExercise(twoDArray);

        System.out.println(Arrays.toString(app.get1DArray()));
    }

}