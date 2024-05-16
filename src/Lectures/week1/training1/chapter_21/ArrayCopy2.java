package Lectures.week1.training1.chapter_21;

import java.util.Arrays;

public class ArrayCopy2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = Arrays.copyOf(arr, arr.length);

        //제일 많이 사용
        int[] arr3 = arr.clone();

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
    }
}
