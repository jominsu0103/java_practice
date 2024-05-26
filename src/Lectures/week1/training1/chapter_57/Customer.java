package Lectures.week1.training1.chapter_57;

import java.io.Serializable;
import java.util.Objects;

public class Customer implements Serializable {
    private final long serialVersionUID = 1L;
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


    public void printMyInfo() {
        System.out.printf("Customer: customerID=%s , name=%s , grade=%s , bonusPoint=%d\n",
                this.customerID, this.name, this.customerGrade, this.bonusPoint);
    }

    @Override
    public String toString() {
        return String.format("Customer: customerID=%s , name=%s , grade=%s , bonusPoint=%d",
                this.customerID, this.name, this.customerGrade, this.bonusPoint);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Customer) {
            Customer customer = (Customer) obj;
            return customer.customerID == this.customerID;
        }
        return false;
    }

    public Customer(String customerID, String name) {
        this(name);
        this.customerID = customerID;
    }

    public Customer(String name) {
        this.customerID = "Customer" + serialNum++;
        this.name = name;
        this.customerGrade = "SILVER";
        this.bonusPointRatio = 0.01;
        this.bonusPoint = 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.customerID);
    }

    Customer() {

    }
}
