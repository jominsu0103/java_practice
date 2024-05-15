package Lectures.week1.training1.chapter_13;

import java.util.logging.Logger;

public class FloatRange {
    private static final Logger logger = Logger.getLogger(FloatRange.class.getName());
    public static void main(String[] args) {
        double myFloat = 12341.1231F;

        logger.info(String.valueOf(myFloat));
    }
}
