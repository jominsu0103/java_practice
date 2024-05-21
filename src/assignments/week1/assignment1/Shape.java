package assignments.week1.assignment1;

public abstract class Shape {
    protected String color = "기본색";
    protected int dimension = 2;

    public String getColor() {
        return color;
    }

    public int getDimension() {
        return dimension;
    }

    abstract double calculateArea();

    abstract double calculateCircumference();
}
