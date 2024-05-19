package assignments.week1.assignment1.leaderProject;

public class Staff {
    private long totalAmount;
    private SneakersInfo sneakersInfo;
    private boolean availabilityOfSneakersInStore;

    public long getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(long totalAmount) {
        this.totalAmount = totalAmount;
    }

    public SneakersInfo getSneakersInfo() {
        return sneakersInfo;
    }

    public void setSneakersInfo(SneakersInfo sneakersInfo) {
        this.sneakersInfo = sneakersInfo;
    }

    public boolean isAvailabilityOfSneakersInStore() {
        return availabilityOfSneakersInStore;
    }

    public void setAvailabilityOfSneakersInStore(boolean availabilityOfSneakersInStore) {
        this.availabilityOfSneakersInStore = availabilityOfSneakersInStore;
    }

    public long returnRefund(long cost) {
        this.totalAmount -= cost;
        return cost;
    }

    public void answerSneakersInfoAndPrice() {
        System.out.printf("직원 : 이 운동화는 %s 특징과 %d 가격을 가지고 있습니다.\n", sneakersInfo.getFeature(), sneakersInfo.getPrice());
    }

    public boolean checkHavingNikeSneakersInStore() {
        if (this.availabilityOfSneakersInStore) {
            System.out.println("직원 : 현재 매장에 재고가 존재 하네요. 바로 주문 진행가능합니다.");
            boolean result = true;
            return result;
        } else {
            System.out.println("직원 : 현재 매장에 재고가 존재 하지않네요, 배송 주문 가능합니다.");
            boolean result = false;
            return result;
        }
    }

    public void sayPayment(long cost) {
        System.out.printf("직원 : 고객님 신발 주문 도와드리겠습니다. %d 입니다.\n", cost);
    }

    public void addTotalAmount(long cost) {
        this.totalAmount += cost;
    }

    public Sneakers offerSneakers() {
        return new Sneakers(this.sneakersInfo);
    }

    public SneakersPackageInfo orderSneakersToDeliverManager(DeliveryManager deliveryManager) {
        return deliveryManager.getSneakersPackageInfo();
    }

    public void sayPackageInfo(SneakersPackageInfo sneakerPackageInfo) {
        System.out.printf("직원 : 고객님 배송은 %d일 걸릴 예정이고, 배송 금액은 %d 소요되십니다.\n", sneakerPackageInfo.getDaysForDeliver(), sneakerPackageInfo.getCost());
    }


    public Staff() {

    }
}
