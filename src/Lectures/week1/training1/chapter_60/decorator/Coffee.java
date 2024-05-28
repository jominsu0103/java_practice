package Lectures.week1.training1.chapter_60.decorator;

public class Coffee implements Beverage {
    @Override
    public String getDescription() {
        return "Coffee";
    }

    @Override
    public double cost() {
        return 4.0;
    }
}
