package assignments.week1.assignment1.leaderProject.snow;

public class GoldCustomer extends Customer {
    private double sneakerDisCountRatio = 0.1;
    private double deliveryDisCountRatio = 0.5;


    public GoldCustomer(String customerName, Long cache, String sneakerModel, Boolean likeDelivery) {
        super(customerName, cache, sneakerModel, likeDelivery);
        this.customerRank = CustomerRank.GOLD;
    }

    @Override
    public long calculateNikePrice(long nikePrice) {
        System.out.printf("손님: 저 %s 등급이어서 운동화 할인 %.2f 되는 걸로 알고 있습니다.\\n", this.customerRank, this.sneakerDisCountRatio);
        return Math.round(nikePrice * (1 - sneakerDisCountRatio));
    }

    public long calculateDeliveryCost(long cost) {
        System.out.printf("손님: 저 %s 등급이어서 배송 할인 %.2f 되는 걸로 알고 있습니다.\\n", this.customerRank, this.deliveryDisCountRatio);
        return Math.round(cost * (1 - deliveryDisCountRatio)); // 50% 할 인
    }
}
