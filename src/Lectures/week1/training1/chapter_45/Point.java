package Lectures.week1.training1.chapter_45;

public class Point<T extends Number, V extends Number> {
    private T x;
    private V y;

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

    public V getY() {
        return y;
    }

    public void setY(V y) {
        this.y = y;
    }

    public Point(T x, V y) {
        this.x = x;
        this.y = y;
    }

    public Double calculateDistance() {
        //(x**2 + y**2) ^ 1/2
        Double number = this.x.doubleValue();
        Double number1 = this.y.doubleValue();

        return Math.sqrt(Math.pow(number, 2) + Math.pow(number1, 2));
    }
}
