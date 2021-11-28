package lab2;

public class Hourglass {

    protected int[] indexOfMaximumHourGlass;
    protected final int[][] MATRIX;

    public Hourglass(int[][] matrix) {
        this.MATRIX = matrix;
        this.indexOfMaximumHourGlass = new int[2];
    }

    /**
     * iteratively evaluates the matrix, moving the hourglass sideways moving along row by row.
     * @return          hourglass with the highest sum
     */
    public int calculateMaximumHourGlass() {
        //a start to the evaluation
        int maximumHourGlassSum = getHourGlassSum(1, 1);
        indexOfMaximumHourGlass[0] = 1;
        indexOfMaximumHourGlass[1] = 1;

        for (int rowIterator = 1; rowIterator < MATRIX.length - 1; rowIterator++)  //loop from 2nd row to 2nd to last row.
            for (int columnIterator = 1; columnIterator < MATRIX[rowIterator].length - 1; columnIterator++) { //from 2nd column to 2nd to last column.
                //create a temporary sum to compare with current maximumHourGlassSum
                int tmpSum = getHourGlassSum(rowIterator, columnIterator);

                if (tmpSum > maximumHourGlassSum) {
                    indexOfMaximumHourGlass[0] = rowIterator;
                    indexOfMaximumHourGlass[1] = columnIterator;
                    maximumHourGlassSum = tmpSum; //change current maximumHourGlassSum.
                }
            }

        return maximumHourGlassSum;
    }

    /**
     * calculates the sum of the hourglass, given the centre point of the hour glass.
     * @param row         the row number of the matrix
     * @param column         the column number of the matrix
     * @return          sum of the values in the hourglass.
     */
    public int getHourGlassSum(int row, int column) {
        int tmpSum = 0;

        tmpSum += MATRIX[row - 1][column - 1];
        tmpSum += MATRIX[row - 1][column];
        tmpSum += MATRIX[row - 1][column + 1]; //top of hour glass

        tmpSum += MATRIX[row][column]; //centre

        tmpSum += MATRIX[row + 1][column - 1];
        tmpSum += MATRIX[row + 1][column];
        tmpSum += MATRIX[row + 1][column + 1]; //bottom of hour glass

        return tmpSum;
    }

    public int[] getIndexOfMaximumHourGlass() {
        return indexOfMaximumHourGlass;
    }

    public int[][] getMATRIX() {
        return MATRIX;
    }
}
