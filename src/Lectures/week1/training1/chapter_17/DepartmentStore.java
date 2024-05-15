package Lectures.week1.training1.chapter_17;

import java.util.logging.Logger;

public class DepartmentStore {
    private static final Logger logger = Logger.getLogger(DepartmentStore.class.getName());
    public static void main(String[] args) {
        int usageAmount = 5000;
        int parkingTime = 6;
        int parkingTimeDiscount = 0;
        int totalParkingTime = 0;

        if (usageAmount >= 200000){
            parkingTimeDiscount = 5;
        } else if (usageAmount >= 100000) {
            parkingTimeDiscount = 4;
        } else if (usageAmount >= 50000) {
            parkingTimeDiscount = 3;
        } else if (usageAmount >= 30000) {
            parkingTimeDiscount = 2;
        } else if (usageAmount >= 10000){
            parkingTimeDiscount = 1;
        }else {
            String unsatisfied = String.valueOf("할인 최소 금액이 충족되지 않아 할인이 불가능합니다.");
            logger.info(unsatisfied);
        }
        totalParkingTime = parkingTime - parkingTimeDiscount;
        String result = String.format("고객님 %d원를 사용하셔서 %d시간 결제하셔야합니다.", usageAmount, totalParkingTime);
        logger.info(result);
    }
}
