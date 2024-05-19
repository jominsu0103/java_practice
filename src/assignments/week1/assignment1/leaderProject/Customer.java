package assignments.week1.assignment1.leaderProject;

public class Customer {
    private String myFeeling;
    private long cache;
    private boolean delivery;

    public String getMyFeeling() {
        return myFeeling;
    }

    public void setMyFeeling(String myFeeling) {
        this.myFeeling = myFeeling;
    }

    public long getCache() {
        return cache;
    }

    public void setCache(long cache) {
        this.cache = cache;
    }

    public boolean isDelivery() {
        return delivery;
    }

    public void setDelivery(boolean delivery) {
        this.delivery = delivery;
    }

    //나이키 운동화에 대해 묻기
    public void askThingInfoToStaff() {
        System.out.println("손님 : 이 운동화에 대해서 알려주세요");
    }

    //스태프에게 가격정보 받기
    public long askGetPriceFromStaff(Staff staff) {
        return staff.getSneakersInfo().getPrice();
    }

    //다음에 온다고 말하기
    public void sayNextTime() {
        System.out.printf("손님 : 다음에 올게요.. 지금 기분은 %s이고, 잔액은 %d 남았어요.\n", this.myFeeling, this.cache);
    }

    //주문 계속 진행하기
    public void sayOrderProgress() {
        System.out.println("손님 : 그럼 주문 진행할게요~");
    }

    //결제가능 여부 확인하기
    public boolean paymentAvailability(long requiredCache) {
        return this.cache >= requiredCache;
    }

    //운동화 결제하기
    public long makePayment(long sneakersPrice) {
        this.cache -= sneakersPrice;
        return sneakersPrice;
    }

    public long askGetPriceFromDelivery(DeliveryManager deliveryManager) {
        return deliveryManager.answerDeliveryCost();
    }

    //운동화 신어보기
    public void tryOnSneakers(Sneakers sneakers) {
        this.myFeeling = "째짐";
        System.out.printf("손님 : 이 신발은 %s이 특징이 느껴지네요, 기분이 %s 이고, 잔액 %d 남았습니다.\n",
                sneakers.getSneakersInfo().getFeature(), this.myFeeling, this.cache);
    }

    //환불요청하기
    public void refundRequests() {
        System.out.println("손님 : 배송비가 너무 비싸네요, 환불해주세요");
    }

    //환불받기
    public void getRefund(long refundCost) {
        this.cache += refundCost;
    }

    public Customer() {
        this.myFeeling = "평범";
    }
}
