package lab2;

public class Application {

    public static void main(String[] args) {
        int[][] matrix = {
                {-9, -9, -9, 1, 1, 1},
                {0, -9, 0, 4, 3, 2},
                {-9, -9, -9, 1, 2, 3},
                {0, 0, 8, 6, 6, 0},
                {0, 0, 0, -2, 0, 0},
                {0, 0, 1, 2, 4, 0}
        };

        Hourglass hourglass = new Hourglass(matrix);
        getAndPrintResults(hourglass);

    }

    //Prints the 2D array representing a matrix.
    public static void printMatrix(int[][] matrix) {
        for (int rowIterator = 0; rowIterator < matrix.length; rowIterator++) {  //loop row
            for (int columnIterator = 0; columnIterator < matrix[rowIterator].length; columnIterator++) //loop column
                System.out.print(matrix[rowIterator][columnIterator] + "\t");

            System.out.println();
        }
    }

    //callback the hourglass algorithm and output the results.
    public static void getAndPrintResults(Hourglass hourglass) {
        int maximumHourGlass = hourglass.calculateMaximumHourGlass();
        int rowOfHourGlass = hourglass.getIndexOfMaximumHourGlass()[0]+1;
        int columnOfHourGlass = hourglass.getIndexOfMaximumHourGlass()[1]+1;

        Application.printMatrix(hourglass.getMATRIX());

        System.out.println("Maximum hourglass has a sum of: " + maximumHourGlass +
                "\nCentre of hourglass at: row " + rowOfHourGlass + " column: " + columnOfHourGlass);

    }
}
