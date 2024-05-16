package Lectures.week1.training1.chapter_21;

import java.util.Arrays;

public class TwoDimensionAdd {
    public static void main(String[] args) {

        int[][] arr3 = {
                {12, 100, 25, 33},
                {70, 23, 401, 110},
                {40, 65, 340, 81},

        };

        int[][] arr4 = {
                {15, 20, 25, 30},
                {20, 30, 40, 50},
                {60, 65, 70, 80}
        };

        int[][] resultArr = new int[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                resultArr[i][j] = arr3[i][j] + arr4[i][j];
            }
        }
        System.out.println(Arrays.deepToString(resultArr));
    }
}
