package Lectures.week1.training1.chapter_34;

import java.util.Objects;

public class VIPCustomer extends Customer {
    static int serialNum = 1;
    private String agentID;
    private double discountRatio;

    public void setAgentID(String agentID) {
        this.agentID = agentID;
    }

    @Override
    public int calculatePrice(int price) {
        this.bonusPoint += price * bonusPointRatio;
        price -= price * discountRatio;
        return price;
    }

    public void callAgent() {
        System.out.println("담당직원 " + this.agentID + "님 문의드릴게 있어요");
    }

    public VIPCustomer(String name) {
        super();
        this.customerID = "VIP" + serialNum++;
        this.name = name;
        this.customerGrade = "VIP";
        this.bonusPoint = 0;
        this.bonusPointRatio = 0.05;
        this.discountRatio = 0.1;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.customerID);
    }

    @Override
    public void printMyInfo() {
        System.out.print("VIP");
        super.printMyInfo();
    }
}
