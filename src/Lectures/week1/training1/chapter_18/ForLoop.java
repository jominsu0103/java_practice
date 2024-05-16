package Lectures.week1.training1.chapter_18;

import java.util.logging.Logger;

public class ForLoop {
    private static final Logger logger = Logger.getLogger(ForLoop.class.getName());

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        logger.info(String.valueOf(sum));
    }
}
