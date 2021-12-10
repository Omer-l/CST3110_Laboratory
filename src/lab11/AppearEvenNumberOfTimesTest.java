package lab11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppearEvenNumberOfTimesTest {

    @Test
    public void getHighestNumber() {
        int[] arr = {1,2,3,3,2,1,4,5,4};

        AppearEvenNumberOfTimesExercise app = new AppearEvenNumberOfTimesExercise(arr);

        System.out.println(app.getHighestNumber());
    }

    @Test
    public void getNumberAppearingOddTimes() {
        int[] arr = {1,2,3,3,2,1,4,5,4};

        AppearEvenNumberOfTimesExercise app = new AppearEvenNumberOfTimesExercise(arr);

        System.out.println(app.getNumberAppearingOddTimes());
    }
}