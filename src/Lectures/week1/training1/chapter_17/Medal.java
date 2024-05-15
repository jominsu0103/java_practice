package Lectures.week1.training1.chapter_17;

import java.util.logging.Logger;

public class Medal {
    private static final Logger logger = Logger.getLogger(Medal.class.getName());
    public static void main(String[] args) {
        int rank = 9;
        String medal;

        switch (rank){
            case 1:
                medal = "금메달";
                break;
            case 2:
            medal = "은메달";
                break;
            case 3:
            medal = "동메달";
                break;
            default:
                medal = "메달 없음";
        }
        String result = String.format("선수님은 %s 입니다", medal);
        logger.info(result);
    }
}
