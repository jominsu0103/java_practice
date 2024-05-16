package Lectures.week1.training1.chapter_21;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        int a = 5;
        int b = a;

        b += 5;
        System.out.println(a);
        System.out.println(b);

        // 얕은 복사
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = arr1;

        arr1[0] = 10;

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        // 깊은 복사
        int[] arr3 = {1, 2, 3, 4};
        int[] arr4 = new int[arr3.length];
        for (int i = 0; i < arr3.length; i++) {
            arr4[i] = arr3[i];
        }
        arr3[0] = 100;
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));
    }
}
