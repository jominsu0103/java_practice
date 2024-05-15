package Lectures.week1.training1.chapter_13;

import java.util.logging.Logger;

public class ExplictCasting {
    private static final Logger logger = Logger.getLogger(ExplictCasting.class.getName());
    public static void main(String[] args) {
        float myFloat = 5.55f;
        int myInt = (int) myFloat;
        logger.info(String.valueOf(myInt));

        int myInt2 = 600;
        byte myByte = (byte)myInt2;
        logger.info(String.valueOf(myByte));

        double myDouble = 5.5;
        double myDouble2 = 3.7;
        int result =(int) (myDouble+myDouble2);
        logger.info(String.valueOf(result));
    }
}
