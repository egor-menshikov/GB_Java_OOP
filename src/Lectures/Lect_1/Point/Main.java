package Lectures.Lect_1.Point;

public class Main {
    public static void main(String[] args) {
        Point2D a = new Point2D(0, 2);
        System.out.println(a);
        Point2D b = new Point2D();
        System.out.println(b);
        System.out.println(Point2D.distance(a, b));
    }
}
