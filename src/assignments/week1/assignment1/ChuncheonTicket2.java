package assignments.week1.assignment1;

import java.util.logging.Logger;

public class ChuncheonTicket2 {
    private static final Logger logger = Logger.getLogger(ChuncheonTicket2.class.getName());
    public static void main(String[] args){

        int freeTickets = 1111;
        int freeCharacter = freeTickets / 4;
        int spareTicket = freeTickets % 4;

        logger.info("티켓을 가져 갈수 있는 근무자들 수");
        logger.info(Integer.toString(freeCharacter));
        logger.info("티켓을 다 나눠주고, 남는 티켓 수");
        logger.info(Integer.toString(spareTicket));
    }

}
