package Lectures.week1.training1.chapter_20;

public class ArrayFor {
    public static void main(String[] args) {
        int[] scores = {90, 87, 88, 75, 99, 65};
        //for loop
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("이 Array의 %d 인덱스의 값은 %d이다.\n", i, scores[i]);
        }
        //강화된 for loop
        for (int score : scores) {
            System.out.printf("scores의 값은 %d\n", score);
        }
    }
}
