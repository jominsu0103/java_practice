package assignments.week1.assignment1.leaderProject.snow;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SaleInfo {
    private ServiceType serviceType;
    private String sneakModelName;

    private Long sneakerPrice;
    private CustomerRank customerRank;
    private String customerName;
    private LocalDateTime localDateTime;

    public SaleInfo(ServiceType serviceType, Customer customer, Long price) {
        this.serviceType = serviceType;
        this.sneakModelName = customer.getSneakerModel();
        this.customerRank = customer.getCustomerRank();
        this.customerName = customer.getCustomerName();
        this.sneakerPrice = price;
        this.localDateTime = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "SaleInfo{" +
                "serviceType=" + serviceType +
                ", sneakModelName='" + sneakModelName + '\'' +
                ", sneakerPrice=" + sneakerPrice +
                ", customerRank=" + customerRank +
                ", customerName='" + customerName + '\'' +
                ", localDateTime=" + localDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")) +
                '}';
    }
}
