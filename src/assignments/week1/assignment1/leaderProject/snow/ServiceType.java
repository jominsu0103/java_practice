package assignments.week1.assignment1.leaderProject.snow;

public enum ServiceType {
    SALE("판매"),
    DELIVERY("배송"),
    REFUND("환불"),
    DELIVERY_DONE("배송완료");

    private String serviceName;

    ServiceType(String serviceName) {
        this.serviceName = serviceName;
    }

    
}
