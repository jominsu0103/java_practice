package Lectures.week1.training1;

import java.util.logging.Logger;


public class Operator1 {
    private static final Logger logger = Logger.getLogger(Operator1.class.getName());
    public static void main(String[] args) {
        int a = 10;
        int b = a;
        int c = b;
        logger.info(String.valueOf(c));

        int positive3 =3;
        int negative = -3;
        logger.info(String.valueOf(positive3));
        logger.info(String.valueOf(negative));

        int num1 = 36;
        int num2 = 5;
        int result = num1+num2;
        logger.info(String.valueOf(result));
    }
}
