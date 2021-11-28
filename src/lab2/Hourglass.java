package lab2;

public class Hourglass {

    private int[] indexOfMaximumHourGlass;
    private int[][] matrix;

    public Hourglass(int[][] matrix) {
        this.matrix = matrix;
        this.indexOfMaximumHourGlass = new int[2];
    }

    //callback the hourglass algorithm and output the results.
    public void getAndPrintResults() {
        int maximumHourGlass = calculateMaximumHourGlass(matrix);
        int rowOfHourGlass = indexOfMaximumHourGlass[0];
        int columnOfHourGlass = indexOfMaximumHourGlass[1];

        Application.printMatrix(matrix);

        System.out.println("Maximum hourglass has a sum of: " + maximumHourGlass +
                "\nCentre of hourglass at: row " + rowOfHourGlass + " column: " + columnOfHourGlass);

    }

    /**
     * iteratively evaluates the matrix, moving the hourglass sideways moving along row by row.
     * @param matrix    an nxn matrix that be evaluated for the maximum hourglass sum.
     * @return          hourglass with the highest sum
     */
    public int calculateMaximumHourGlass(int[][] matrix) {
        int maximumHourGlassSum = getHourGlassSum(matrix, 1, 1);

        for (int rowIterator = 1; rowIterator < matrix.length - 1; rowIterator++)  //loop from 2nd row to 2nd to last row.
            for (int columnIterator = 1; columnIterator < matrix[rowIterator].length - 1; columnIterator++) { //from 2nd column to 2nd to last column.
                //create a temporary sum to compare with current maximumHourGlassSum
                int tmpSum = getHourGlassSum(matrix, rowIterator, columnIterator);

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
     * @param matrix    nxn matrix to be evaluated
     * @param row         the row number of the matrix
     * @param column         the column number of the matrix
     * @return          sum of the values in the hourglass.
     */
    public int getHourGlassSum(int[][] matrix, int row, int column) {
        int tmpSum = 0;

        tmpSum += matrix[row - 1][column - 1];
        tmpSum += matrix[row - 1][column];
        tmpSum += matrix[row - 1][column + 1]; //top of hour glass

        tmpSum += matrix[row][column]; //centre

        tmpSum += matrix[row + 1][column - 1];
        tmpSum += matrix[row + 1][column];
        tmpSum += matrix[row + 1][column + 1]; //bottom of hour glass

        return tmpSum;
    }

    public int[] getIndexOfMaximumHourGlass() {
        return indexOfMaximumHourGlass;
    }

    public int[][] getMatrix() {
        return matrix;
    }
}
