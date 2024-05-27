package assignments.week1.assignment1.leaderProject.snow;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DeliveryInfo {
    private ServiceType serviceType;
    private String sneakModelName;
    private Long sneakerPrice;
    private CustomerRank customerRank;
    private String customerName;
    private LocalDateTime localDateTime;

    public DeliveryInfo(ServiceType serviceType, Customer customer, Long cache) {
        this.serviceType = serviceType;
        this.sneakModelName = customer.getSneakerModel();
        this.customerName = customer.getCustomerName();
        this.customerRank = customer.getCustomerRank();
        this.sneakerPrice = cache;

        this.localDateTime = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "DeliveryInfo{" +
                "serviceType=" + serviceType +
                ", sneakModelName='" + sneakModelName + '\'' +
                ", sneakerPrice=" + sneakerPrice +
                ", customerRank=" + customerRank +
                ", customerName='" + customerName + '\'' +
                ", localDateTime=" + localDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")) +
                '}';
    }
}
