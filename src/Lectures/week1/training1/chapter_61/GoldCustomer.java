package Lectures.week1.training1.chapter_61;

public class GoldCustomer extends Customer {
    double discountRatio;

    public GoldCustomer(String name) {
        this.customerID = "Customer" + Customer.serialNum++;
        this.name = name;
        this.customerGrade = "Gold";
        this.bonusPoint = 0;
        this.bonusPointRatio = 0.03;
        this.discountRatio = 0.03;
    }

    @Override
    public int calculatePrice(int price) {
        price -= price * discountRatio;
        this.bonusPoint += price * bonusPointRatio;
        return price;
    }
}
