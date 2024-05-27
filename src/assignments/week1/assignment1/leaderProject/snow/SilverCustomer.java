package assignments.week1.assignment1.leaderProject.snow;

public class SilverCustomer extends Customer {
    public SilverCustomer(String customerName, Long cache, String sneakerModel, Boolean likeDelivery) {
        super(customerName, cache, sneakerModel, likeDelivery);
        this.customerRank = CustomerRank.SILVER;
    }
}
