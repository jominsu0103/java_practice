package Lectures.week1.training1.chapter_19;

import java.util.logging.Logger;

public class Gugudan {
    private static final Logger logger = Logger.getLogger(Gugudan.class.getName());

    public static void main(String[] args) {
        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                String result = String.format("%d X %d = %d", i, j, i * j);
                logger.info(result);
            }
        }
    }
}
