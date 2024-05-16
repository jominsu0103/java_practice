package Lectures.week1.training1.chapter_24;

public class Scores {
    public static void main(String[] args) {
        int AClass1 = 50;
        int AClass2 = 35;
        int AClass3 = 45;

        int BClass1 = 60;
        int BClass2 = 65;
        int BClass3 = 66;

//        int sumAClass = AClass1 + AClass2 + AClass3;
//        double averageAClass = sumAClass / (double) 3;
//
//        int sumBClass = BClass1 + BClass2 + BClass3;
//        double averageBClass = sumBClass / (double) 3;

        double averageAClass = calculateAverage(AClass1, AClass2, AClass3);
        double averageBClass = calculateAverage(BClass1, BClass2, BClass3);
        System.out.printf("A 학급의 평균점수는 %.2f , B 학급의 평균점수는 %.2f", averageAClass, averageBClass);

    }

    static double calculateAverage(int score1, int score2, int score3) {
        int totalScore = score1 + score2 + score3;
        return totalScore / (double) 3;
    }
}
