package Lectures.week1.training1.chapter_60.strategy;

public class SeasonDiscountStrategy implements DiscountStrategy {
    @Override
    public double calculateDiscount(double amount) {
        return amount * 0.1;
    }
}
