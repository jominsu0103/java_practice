package Lectures.week1.training1.chapter_60.decorator;

public class OrderCoffee {
    public static void main(String[] args) {
        Beverage coffee = new Coffee();
        System.out.println(coffee.getDescription() + ": $" + coffee.cost());

        Beverage coffeeWithMilk = new Milk(coffee);
        System.out.println(coffeeWithMilk.getDescription() + ": $" + coffeeWithMilk.cost());

        Beverage coffeeWithMilkWithSugar = new Sugar(coffeeWithMilk);
        System.out.println(coffeeWithMilkWithSugar.getDescription() + ": $" + coffeeWithMilkWithSugar.cost());

        Beverage coffeeWithCreamWithMilk = new Milk(new Cream(new Coffee()));
        System.out.println(coffeeWithCreamWithMilk.getDescription() + ": $" + coffeeWithCreamWithMilk.cost());
    }


}
