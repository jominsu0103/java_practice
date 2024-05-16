package Lectures.week1.training1.chapter_21;

import java.util.Arrays;

public class ToDimensionArrayCopy {
    public static void main(String[] args) {

        //2D Array 얕은 복사
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
        };

        int[][] arr1 = arr.clone();

        arr[0][0] = 100;
        System.out.println(Arrays.deepToString(arr));
        System.out.println(Arrays.deepToString(arr1));
        //2D Array 깊은 복사
        int[][] arr3 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        int[][] arr4 = new int[3][];
        for (int i = 0; i < 3; i++) {
            arr4[i] = arr3[i].clone();
        }
        arr3[0][0] = 120;
        System.out.println(Arrays.deepToString(arr3));
        System.out.println(Arrays.deepToString(arr4));
    }
}
