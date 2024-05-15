package Lectures.week1.training1.chapter_17;

import java.util.logging.Logger;

public class Starbucks {
    private static final Logger logger = Logger.getLogger(Starbucks.class.getName());

    public static void main(String[] args) {
        boolean period = true;
        boolean follow = true;
        boolean regram = true;
        boolean coment = true;

//        if (period) {
//            if (follow) {
//                if (regram) {
//                    if (coment) {
//                        String result = "이벤트 신청조건 충족되었습니다";
//                        logger.info(result);
//                    } else {
//                        String fail = "4번째 이벤트 신청조건 불충족입니다";
//                        logger.info(fail);
//                    }
//                } else {
//                    String result = "3번째 이벤트 신청조건 불충족입니다";
//                    logger.info(result);
//                }
//            } else {
//                String result = "2번째 이벤트 신청조건 불충족입니다";
//                logger.info(result);
//            }
//        } else {
//            String result = "1번째 이벤트 신청조건 불충족입니다";
//            logger.info(result);
//        }

        if (period && follow && regram && coment) {
            String result = "이벤트 신청조건 충족되었습니다";
            logger.info(result);
        } else {
            String result = "이벤트 신청조건 불충족되었습니다.";
            logger.info(result);
        }
    }
}
