package Lectures.week1.training1.chapter_34;

public class GoldCustomer extends Customer {
    private double discountRatio;

    public int calculatePrice(int price) {
        this.bonusPoint += price * bonusPoint;
        price -= price * discountRatio;
        return price;
    }

    public GoldCustomer(String name) {
        super();
        this.customerID = "Customer" + Customer.serialNum++;
        this.name = name;
        this.customerGrade = "GOLD";
        this.bonusPoint = 0;
        this.discountRatio = 0.03;
        this.bonusPointRatio = 0.03;
    }

    @Override
    public String toString() {
        return "GoldCustomer{" +
                "discountRatio=" + discountRatio +
                ", customerID='" + customerID + '\'' +
                ", name='" + name + '\'' +
                ", customerGrade='" + customerGrade + '\'' +
                ", bonusPoint=" + bonusPoint +
                ", bonusPointRatio=" + bonusPointRatio +
                '}';
    }
}
