package Lectures.week1.training1.chapter_19;

public class ThreeSixNineGame {
    public static void main(String[] args) {
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0) {
                System.out.printf("짝,");
                continue;
            }
            System.out.printf("%d,", i);
        }
    }
}
