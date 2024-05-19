package assignments.week1.assignment1.leaderProject;

public class OrderSneakersSituation {
    public static void main(String[] args) {
        boolean isCustomerOfDelivery = true;
        String sneakersFeature = "편안함";
        long sneakersPrice = 90_000;
        boolean availabilityOfSneakersInStore = false;

        int daysForDeliver = 3;
        long costForDeliver = 15_000;
        long totalPrice = sneakersPrice + costForDeliver;

        SneakersInfo sneakersInfo = new SneakersInfo(sneakersFeature, sneakersPrice);
        SneakersPackageInfo sneakersPackageInfo = new SneakersPackageInfo(daysForDeliver, costForDeliver);


        Customer customer = new Customer();
        customer.setCache(100_000);
        customer.setDelivery(isCustomerOfDelivery);

        Staff staff = new Staff();
        staff.setTotalAmount(100_000);
        staff.setSneakersInfo(sneakersInfo);
        staff.setAvailabilityOfSneakersInStore(availabilityOfSneakersInStore);

        DeliveryManager deliveryManager = new DeliveryManager();
        deliveryManager.setTotalAmount(100_000);
        deliveryManager.setSneakersInfo(sneakersInfo);
        deliveryManager.setSneakersPackageInfo(sneakersPackageInfo);

        customer.askThingInfoToStaff();
        staff.answerSneakersInfoAndPrice();
        long pricePrice = customer.askGetPriceFromStaff(staff);

        if (customer.paymentAvailability(pricePrice)) {
            if (staff.checkHavingNikeSneakersInStore()) {
                customer.sayOrderProgress();
                staff.sayPayment(pricePrice);
                long cache = customer.makePayment(pricePrice);
                staff.addTotalAmount(cache);

                Sneakers sneakers = staff.offerSneakers();
                customer.tryOnSneakers(sneakers);
            } else {
                if (customer.isDelivery()) {
                    customer.sayOrderProgress();
                    staff.sayPayment(pricePrice);

                    SneakersPackageInfo pickSneakersPackageInfo = staff.orderSneakersToDeliverManager(deliveryManager);
                    staff.sayPackageInfo(pickSneakersPackageInfo);

                    if (totalPrice > customer.getCache()) {
                        long cache = customer.makePayment(pricePrice);
                        staff.addTotalAmount(cache);
                        customer.refundRequests();
                        long refundCache = staff.returnRefund(cache);
                        customer.getRefund(refundCache);
                        customer.sayNextTime();
                    } else {
                        customer.sayOrderProgress();
                        long cache = customer.makePayment(pricePrice);
                        staff.addTotalAmount(cache);
                        SneakersPackage sneakersPackage = deliveryManager.makePakage();
                        long deliveryCost = customer.askGetPriceFromDelivery(deliveryManager);
                        deliveryManager.sayPayment(deliveryCost);
                        long cachePackage = customer.makePayment(deliveryCost);
                        deliveryManager.addTotalAmount(cachePackage);
                        customer.tryOnSneakers(sneakersPackage.beUnBoxing());
                    }
                } else {
                    customer.sayNextTime();
                }
            }
        } else {
            customer.sayNextTime();
        }
    }
}
