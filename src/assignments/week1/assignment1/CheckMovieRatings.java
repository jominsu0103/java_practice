package assignments.week1.assignment1;

import java.util.logging.Logger;

public class CheckMovieRatings {
    private static final Logger logger = Logger.getLogger(CheckMovieRatings.class.getName());

    public static void main(String[] args) {
        int age = 25;

        if (19 <= age) {
            logger.info("청소년 관람불가");
        }
        if (15 <= age && age < 19) {
            logger.info("15세 이상 관람가");
        }
        if (12 <= age && age < 15) {
            logger.info("12세 이상 관람가");
        }
        if (0 <= age && age < 12) {
            logger.info("전체 관람가");
        }
        if (0 > age) {
            logger.info("유아 관람불가");
        }
    }
}
