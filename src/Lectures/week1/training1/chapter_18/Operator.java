package Lectures.week1.training1.chapter_18;

import java.util.logging.Logger;

public class Operator {
    private static final Logger logger = Logger.getLogger(Operator.class.getName());

    public static void main(String[] args) {
        int myInt = 5;
        myInt *= 10;
        logger.info(String.valueOf(myInt));

        int myInt2 = 10;
        ++myInt2;
        logger.info(String.valueOf(myInt2));
    }
}
