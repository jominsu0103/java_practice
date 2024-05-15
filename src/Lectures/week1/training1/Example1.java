package Lectures.week1.training1;

import java.util.logging.Logger;

public class Example1 {
    private static final Logger logger = Logger.getLogger(Example1.class.getName());
    public static void main(String[] args) {
        int myFavoriteNumber =5;
        double pi = 3.141592;
        boolean likeMint = false;
        char mySurnameFirstAlphabet = 'J';
        String myName = "jominsu";
        logger.info("Hello World");
        logger.info(String.valueOf(myFavoriteNumber));
        logger.info(String.valueOf(pi));
        logger.info(String.valueOf(likeMint));
        logger.info(String.valueOf(mySurnameFirstAlphabet));
        logger.info(myName);
    }
}
