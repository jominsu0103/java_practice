package Lectures.week1.training1.chapter_20;

import java.util.Arrays;

public class ArrayIndex {
    public static void main(String[] args) {
        int[] scores = {90, 87, 88, 75, 99, 65};
        int score1 = scores[0];
        System.out.println(score1);

        scores[2] = 93;
        System.out.println(Arrays.toString(scores));

        //Error (out of bounds for length)
        //int score6 = scores[6];
        //System.out.println(score6);
    }
}
