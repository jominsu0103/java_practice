package Lectures.week1.training1;

import java.util.logging.Logger;

public class Operator2 {
    private static final Logger logger = Logger.getLogger(Operator2.class.getName());
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        boolean result = num1 > num2;

        logger.info(String.valueOf(result));

        boolean condition1 = 5 > 3;
        boolean condition2 = 4 >= 4;

        boolean result2 = !(condition1 && condition2);

        logger.info(String.valueOf(result2));
    }
}
