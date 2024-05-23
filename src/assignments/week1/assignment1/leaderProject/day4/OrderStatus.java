package assignments.week1.assignment1.leaderProject.day4;

public enum OrderStatus {
    PAID("주문완료"),
    SHIPPED("배송완료"),
    DELIVERED("배송완료"),
    NOT_PAID("결제 전"),
    ON_ORDER("주문 중");

    private final String desc;

    public String getDesc() {
        return desc;
    }

    OrderStatus(String desc) {
        this.desc = desc;
    }
}
