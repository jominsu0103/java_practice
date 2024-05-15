package Lectures.week1.training1.chapter_16;

//public class AvocardoSituation {
//    public static void main(String[] args) {
//        int mliks = 0;
//        int avocardo = 0;
//        boolean existedAvocardo = true;
//
//        mliks = mliks + 1;
//        if (existedAvocardo){
//            avocardo = avocardo + 6;
//        }
//        String comment = String.format("장보고 돌아왔어 %d 개 아보카도, %d개 우유 사왔어" , avocardo ,mliks);
//        System.out.println(comment);
//    }
//}

    public class AvocardoSituation {
        public static void main(String[] args) {
            int mliksCount = 0;
            int avocardoCount = 0;
            boolean existedAvocardo = true;

//            if (existedAvocardo){
//                mliksCount = mliksCount + 6;
//            }else{
//                mliksCount = mliksCount + 1;
//            }
            //삼항 연산자
            mliksCount = (existedAvocardo) ? 6 : 0;
            String comment = String.format("장보고 돌아왔어 %d개 아보카도 , %d개 우유 사왔어", avocardoCount, mliksCount);
            System.out.println(comment);
        }
}