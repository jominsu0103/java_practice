package Lectures.week1.training1.chapter_60.strategy;

public class DiscountCalculator {
    private DiscountStrategy discountStrategy;

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double calculateDiscount(double amount) {
        if (discountStrategy != null) {
            return discountStrategy.calculateDiscount(amount);
        } else {
            return 0;
        }
    }
}
