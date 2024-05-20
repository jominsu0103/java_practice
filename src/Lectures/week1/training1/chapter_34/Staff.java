package Lectures.week1.training1.chapter_34;

public class Staff {

    private int salesAmount;

    public void setSalesAmount(int salesAmount) {
        this.salesAmount = salesAmount;
    }

    public int helpPayment(Customer customer, int price) {
        return customer.calculatePrice(price);
    }

//    public int helpPayment(VIPCustomer vipCustomer, int price) {
//        return vipCustomer.calculatePrice(price);
//    }


    public void addSalesAmount(int cash) {
        salesAmount += cash;
    }

    public void printMySalesAmount() {
        System.out.println("오늘의 최종 매상은 " + salesAmount + "원입니다.");
    }
}
