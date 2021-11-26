package lab8;

public class TriangleClassifier {

    public enum Classification {
        Equilateral, Isosceles, Scalene;
    }

    public static Classification classify(double x, double y, double z) {

        if(x<=0.0 || y<=0.0 || z<=0.0 || x+y<=z || y+z<=x || x+z<=y)
            throw new IllegalArgumentException("Not a triangle");
        if(x==y && y==z)
            return Classification.Equilateral;
        if(x==y || x==z || y==z)
            return Classification.Isosceles;
        return Classification.Scalene;
    }
}