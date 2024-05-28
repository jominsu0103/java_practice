package Lectures.week1.training1.chapter_61;

public class CustomerTest {
    public static void main(String[] args) {
        GoldCustomer customer = new GoldCustomer("lee");

        long price = customer.calculatePrice(100);
        System.out.println("price : " + price);
    }


}
