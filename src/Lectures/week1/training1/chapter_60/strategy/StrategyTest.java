package Lectures.week1.training1.chapter_60.strategy;

public class StrategyTest {
    public static void main(String[] args) {
        DiscountCalculator calculator = new DiscountCalculator();

        calculator.setDiscountStrategy(new NewCustomerDiscountStrategy());
        double discount = calculator.calculateDiscount(100_000);

        System.out.println("신규 가입자 할인 금액: " + discount);

        calculator.setDiscountStrategy(new SeasonDiscountStrategy());
        double discount1 = calculator.calculateDiscount(100_000);

        System.out.println("신규 시즌 가입자 할인 금액: " + discount1);

        calculator.setDiscountStrategy(new ReferenceFriendDiscountStrategy());
        double discount2 = calculator.calculateDiscount(100_000);

        System.out.println("친구할인 가입자 할인 금액: " + discount2);
    }
}
