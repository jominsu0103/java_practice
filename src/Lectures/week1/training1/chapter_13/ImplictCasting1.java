package Lectures.week1.training1.chapter_13;

import java.util.logging.Logger;

public class ImplictCasting1 {
    private static final Logger logger = Logger.getLogger(ImplictCasting1.class.getName());
    public static void main(String[] args) {
        int myInt = 5;
        float myfloat = myInt;

        logger.info(String.valueOf(myfloat));

    }
}
