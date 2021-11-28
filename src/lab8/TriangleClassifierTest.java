package lab8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;


public class TriangleClassifierTest {

    // two inputs are in the same EC if they result in the same classification
    // or they both raise an exception

    // EC1 -- input is not a triangle
    // EC2 -- result is Equilateral
    // EC3 -- result is Isosceles
    // EC4 -- result is Scalene

    final TriangleClassifier.Classification equilateral = TriangleClassifier.Classification.Equilateral;

//    @Test(expected= IllegalArgumentException.class)
    public void testEC1() {
        TriangleClassifier.classify(0., 0., 0.);
    }

//    @Test(expected= IllegalArgumentException.class)
    public void testEC1a() {
        TriangleClassifier.classify(10., 1., 1.);
    }

    @Test
    public void testEC1anotherWayToCatchExceptions() {
        try {
            TriangleClassifier.classify(0., 0., 0.);
            fail();
        }
        catch (IllegalArgumentException e) {

        }
        catch (Exception e) {
            fail();
        }
    }

    @Test
    public void testEC2() {
        assertEquals(TriangleClassifier.classify(3., 3., 3.), equilateral);
    }

    @Test
    public void testEC3() {
        assertEquals(TriangleClassifier.classify(2., 3., 3.), TriangleClassifier.Classification.Isosceles);
    }

    @Test
    public void testEC4() {
        assertEquals(TriangleClassifier.classify(2., 3., 4.), TriangleClassifier.Classification.Scalene);
    }

}