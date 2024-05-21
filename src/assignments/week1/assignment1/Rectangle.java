package assignments.week1.assignment1;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double calculateDiagonal() {
        return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
    }

    @Override
    double calculateArea() {
        return width * height;
    }

    @Override
    double calculateCircumference() {
        return 2 * (width + height);
    }

    public void setColor(String color) {
        this.color = color;
    }
}
