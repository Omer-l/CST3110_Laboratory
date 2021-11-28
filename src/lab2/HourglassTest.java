package lab2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HourglassTest {

    @Test
    void calculateMaximumHourGlass() {
        int[][] matrix = {
                {-9, -9, -9, 1, 1, 1},
                {0, -9, 0, 4, 3, 2},
                {-9, -9, -9, 1, 2, 3},
                {0, 0, 8, 6, 6, 0},
                {0, 0, 0, -2, 0, 0},
                {0, 0, 1, 2, 4, 0}
        };
        Hourglass hourglass = new Hourglass(matrix);

        int actual = hourglass.calculateMaximumHourGlass();
        int expected = 28;

        assertEquals(expected, actual);
    }

    @Test
    void getHourGlassSum() {
        int[][] matrix = {
                {-63,   -34,    -9,     12},
                {-10,   0,      28,     23},
                {-27,   -11,    -2,     10},
                {9,     17,     25,     18}
        };

        Hourglass hourglass = new Hourglass(matrix);
        int row = 2;
        int column = 2;

        int expected = 109;
        int actual = hourglass.getHourGlassSum(row, column);

        assertEquals(expected, actual);
    }

    @Test
    void getIndexOfMaximumHourGlass() {
        int[][] matrix = {
                {1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0}
        };

        Hourglass hourglass = new Hourglass(matrix);
        hourglass.calculateMaximumHourGlass();

        int[] expecteds = {1, 1};
        int[] actuals = hourglass.getIndexOfMaximumHourGlass();

        assertArrayEquals(expecteds, actuals);

    }
}