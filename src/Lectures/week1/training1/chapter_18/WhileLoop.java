package Lectures.week1.training1.chapter_18;

import java.util.logging.Logger;

public class WhileLoop {
    private static final Logger logger = Logger.getLogger(WhileLoop.class.getName());

    public static void main(String[] args) {
        int sum = 0;
        int num = 0;

        while (num < 10) {
            num++;
            sum += num;
        }
        String result = String.format("모든 수를 더한 값은 %d입니다.", sum);
        logger.info(result);
    }
}
