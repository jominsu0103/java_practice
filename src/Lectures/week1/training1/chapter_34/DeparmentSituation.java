package Lectures.week1.training1.chapter_34;

public class DeparmentSituation {
    public static void main(String[] args) {
        int price = 10_000;
        Staff staff = new Staff();
        staff.setSalesAmount(1_000_000);

        Customer customer = new VIPCustomer("cho");


        Customer[] customerQueue = {
                new Customer("lee"), customer, new VIPCustomer("hwang"),
                new Customer("gin"), new Customer("in"), new VIPCustomer("yu"),
                new Customer("yang"), customer, customer,
                new GoldCustomer("lim"), new GoldCustomer("son"), new GoldCustomer("jung")
        };

        for (Customer customerEach : customerQueue) {
            customerEach.printMyInfo();
            int cash = staff.helpPayment(customerEach, price);
            System.out.printf("내가 내는 금액 %d\n", cash);
            staff.addSalesAmount(cash);
        }
        staff.printMySalesAmount();
    }
}
