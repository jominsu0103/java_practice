package Lectures.week1.training1.chapter_14;

import java.util.logging.Logger;

public class Encoding {
    private static final Logger logger = Logger.getLogger(Encoding.class.getName());
    public static void main(String[] args) {
        char ch1 = 'Z';
        logger.info(String.valueOf(ch1));
        logger.info(String.valueOf((int)ch1));

        int num = 66;
        logger.info(String.valueOf(num));
        logger.info(String.valueOf((char)num));

        char smallA = 'a';
        char largeA = 'A';

        boolean result = smallA > largeA;
        logger.info(String.valueOf(result));

        char hangul = '\uAC00';
        logger.info(String.valueOf(hangul));

        char special1 = '\t';
        char special2 = '\n';
        char special3 = '\'';
        logger.info(String.valueOf(special1));
        logger.info(String.valueOf(special2));
        logger.info(String.valueOf(special3));
    }
}
