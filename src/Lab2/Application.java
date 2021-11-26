package lab2;

public class Application {

    public static void main(String[] args) {
        int[][] hourGlass = {
                {-9, -9, -9, 1, 1, 1},
                {0, -9, 0, 4, 3, 2},
                {-9, -9, -9, 1, 2, 3},
                {0, 0, 8, 6, 6, 0},
                {0, 0, 0, -2, 0, 0},
                {0, 0, 1, 2, 4, 0}
        };

        System.out.println(hourGlass(hourGlass));
    }

    /**
     * @param arr 6x6 array
     * @return maximum hourglass sum
     */
    public static int hourGlass(int[][] arr) {
        int maximumHourGlassSum = getHourGlassSum(arr, 1, 1);

        for (int y = 1; y < arr.length - 1; y++)  //loop from 2nd row to 2nd to last row.
            for (int x = 1; x < arr[y].length - 1; x++) { //from 2nd column to 2nd to last column.
                //create a temporary sum to compare with current maximumHourGlassSum
                int tmpSum = getHourGlassSum(arr, y, x);

                if (tmpSum > maximumHourGlassSum) {
                    System.out.println("A new max from index: " + y + ", " + x); //print new current maximumHourGlassSum index
                    maximumHourGlassSum = tmpSum; //change current maximumHourGlassSum.
                }
            }

        return maximumHourGlassSum;
    }

    public static int getHourGlassSum(int[][] arr, int y, int x) {
        int tmpSum = 0;

        tmpSum += arr[y - 1][x - 1];
        tmpSum += arr[y - 1][x];
        tmpSum += arr[y - 1][x + 1]; //top of hour glass

        tmpSum += arr[y][x]; //centre

        tmpSum += arr[y + 1][x - 1];
        tmpSum += arr[y + 1][x];
        tmpSum += arr[y + 1][x + 1]; //bottom of hour glass

        return tmpSum;
    }
}
