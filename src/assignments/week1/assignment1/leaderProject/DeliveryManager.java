package assignments.week1.assignment1.leaderProject;

public class DeliveryManager {
    private long totalAmount;
    private SneakersInfo sneakersInfo;

    private SneakersPackageInfo sneakersPackageInfo;

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

    public SneakersPackageInfo getSneakersPackageInfo() {
        return sneakersPackageInfo;
    }

    public void setSneakersPackageInfo(SneakersPackageInfo sneakersPackageInfo) {
        this.sneakersPackageInfo = sneakersPackageInfo;
    }

    public void addTotalAmount(long cost) {
        this.totalAmount += cost;
    }

    public SneakersPackage makePakage() {
        Sneakers sneakers = new Sneakers(sneakersInfo);
        SneakersPackage sneakersPackage = new SneakersPackage(sneakers);
        System.out.println("배송 담당자 : 주문하신 신발 배송 완료되었습니다.");
        return sneakersPackage;
    }

    public void sayPayment(long cost) {
        System.out.printf("배송 담당자 : 고객님 배송 결제 도와드리겠습니다. %d 입니다.\n", cost);
    }

    public long answerDeliveryCost() {
        return sneakersPackageInfo.getCost();
    }
}
