package Lectures.week1.training1.chapter_60.strategy;

public class ReferenceFriendDiscountStrategy implements DiscountStrategy {
    @Override
    public double calculateDiscount(double amount) {
        return amount * 0.15;
    }
}
