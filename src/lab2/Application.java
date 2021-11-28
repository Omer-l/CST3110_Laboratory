package lab2;

public class Application {

    private static int[] indexOfMaximumHourGlass = new int[2];

    public static void main(String[] args) {
        int[][] matrix = {
                {-9, -9, -9, 1, 1, 1},
                {0, -9, 0, 4, 3, 2},
                {-9, -9, -9, 1, 2, 3},
                {0, 0, 8, 6, 6, 0},
                {0, 0, 0, -2, 0, 0},
                {0, 0, 1, 2, 4, 0}
        };

        printMatrix(matrix);

        int maximumHourGlass = hourGlass(matrix);
        int rowOfHourGlass = indexOfMaximumHourGlass[0];
        int columnOfHourGlass = indexOfMaximumHourGlass[1];

        System.out.println("Maximum hourglass has a sum of: " + maximumHourGlass +
                "\nCentre of hourglass at: row " + rowOfHourGlass + " column: " + columnOfHourGlass);
    }

    /**
     * iteratively evaluates the matrix, moving the hourglass sideways moving along row by row.
     * @param matrix    an nxn matrix that be evaluated for the maximum hourglass sum.
     * @return          hourglass with the highest sum
     */
    public static int hourGlass(int[][] matrix) {
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
    public static int getHourGlassSum(int[][] matrix, int row, int column) {
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

    //Prints the 2D array representing a matrix.
    private static void printMatrix(int[][] matrix) {
        for (int rowIterator = 0; rowIterator < matrix.length; rowIterator++) {  //loop row
            for (int columnIterator = 0; columnIterator < matrix[rowIterator].length; columnIterator++) //loop column
                System.out.print(matrix[rowIterator][columnIterator] + "\t");

            System.out.println();
        }
    }
}
