package Lectures.week1.training1.chapter_45;

public class PointSituation {
    public static void main(String[] args) {
        Point<Integer, Integer> point1 = new Point<>(1, 5);
        Point<Integer, Double> point2 = new Point<>(5, 4.55);
        Point<Double, Double> point3 = new Point<>(5.0, 4.55);

        System.out.println(point1.calculateDistance());
        System.out.println(point2.calculateDistance());
        System.out.println(point3.calculateDistance());

        //Point<String, Double> point4 = new Point<>("Cat", 4.55);
        //System.out.println(point4.calculateDistance()); print null
    }
}
