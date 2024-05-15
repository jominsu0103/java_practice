package Lectures.week1.training1.chapter_17;

import java.util.logging.Logger;

public class Taxi {
    private static final Logger logger = Logger.getLogger(Taxi.class.getName());
    public static void main(String[] args) {
        String location = "kimpo";
        int time =3;
        int amount = 10000;

        if (0 < time && time < 4){
            amount = amount + (int) (amount * 0.2);
        }
        if(location != "seoul"){
            amount = amount + (int) (amount * 0.2);
        }
        String result = String.format("고객님이 내셔야할 돈은 %d입니다.", amount);
        logger.info(result);
    }
}
