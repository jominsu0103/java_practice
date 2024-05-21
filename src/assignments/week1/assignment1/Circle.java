package assignments.week1.assignment1;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double calculateDiameter(Circle circle) {
        double inputRadius = circle.getRadius();
        double diameter = inputRadius * 2;
        return diameter;
    }

    @Override
    double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
