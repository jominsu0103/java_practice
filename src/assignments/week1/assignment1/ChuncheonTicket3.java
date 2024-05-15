package assignments.week1.assignment1;

import java.util.logging.Logger;

public class ChuncheonTicket3 {
    private static final Logger logger = Logger.getLogger(ChuncheonTicket3.class.getName());
    public static void main(String[] args){

        final int SENIOR_AGE_STANDARD = 65;
        final String STANDARD_COUNTRY = "Korea";

        int ageOfAlice = 70;
        String countryOfAlice = "USA";

        int ageOfKim = 65;
        String countryOfKim = "Korea";

        int ageOfYoo = 42;
        String countryOfYoo = "Korea";

        boolean isHalfPriceForAlice = (ageOfAlice >= SENIOR_AGE_STANDARD) && (countryOfAlice == STANDARD_COUNTRY);
        boolean isHalfPriceForKim = (ageOfKim >= SENIOR_AGE_STANDARD) && (countryOfKim == STANDARD_COUNTRY);
        boolean isHalfPriceForYoo = (ageOfYoo >= SENIOR_AGE_STANDARD) && (countryOfYoo == STANDARD_COUNTRY);

        logger.info("Alice는 적용 대상자인가?");
        logger.info(Boolean.toString(isHalfPriceForAlice));
        logger.info("Kim는 적용 대상자인가?");
        logger.info(Boolean.toString(isHalfPriceForKim));
        logger.info("Yoo는 적용 대상자인가?");
        logger.info(Boolean.toString(isHalfPriceForYoo));
    }

}
