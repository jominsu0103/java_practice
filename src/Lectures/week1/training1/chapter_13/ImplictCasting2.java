package Lectures.week1.training1.chapter_13;

import java.util.logging.Logger;

public class ImplictCasting2 {
    private static final Logger logger = Logger.getLogger(ImplictCasting2.class.getName());
    public static void main(String[] args) {
        int myInt = 10;
        double myDouble = 55.1;
        double result = myInt + myDouble;

        int myInt2 = 10;
        long myLong = 20L;
        long result2 = myInt2+myLong;

        int number1 = 10;
        float number2 = 3.0f;
        float result3 = number1/number2;

        logger.info(String.valueOf(result));
        logger.info(String.valueOf(result2));
        logger.info(String.valueOf(result3));
    }
}
