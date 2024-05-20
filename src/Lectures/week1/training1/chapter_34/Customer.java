package Lectures.week1.training1.chapter_34;

public class Customer {
    // 속성
    static int serialNum = 1;

    protected String customerID;
    protected String name;
    protected String customerGrade;
    protected int bonusPoint;
    protected double bonusPointRatio;

    public int calculatePrice(int price) {
        this.bonusPoint += price * bonusPointRatio;
        return price;
    }

    Customer(String name) {
        this.customerID = "Customer" + serialNum++;
        this.name = name;
        this.customerGrade = "SILVER";
        this.bonusPointRatio = 0.01;
        this.bonusPoint = 0;
    }

    public void printMyInfo() {
        System.out.printf("Customer: customerID=%s , name=%s , grade=%s , bonusPoint=%d\n",
                this.customerID, this.name, this.customerGrade, this.bonusPoint);
    }

    Customer() {

    }
}
