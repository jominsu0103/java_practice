package Lectures.week1.training1;

import java.util.logging.Logger;

public class Mission1 {
    private static final Logger logger = Logger.getLogger(Mission1.class.getName());
    public static void main(String[] args) {
        int priceKim = 3000;
        int pricePark = 5000;
        int priceLee = 2000;
        int priceHong = 2000;

        int finalTicketPrice = (priceKim+pricePark+priceLee+priceHong) /4;

        logger.info(String.valueOf(finalTicketPrice));
    }
}
