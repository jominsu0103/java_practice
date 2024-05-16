package Lectures.week1.training1.chapter_20;

import java.util.Arrays;

public class ArrayDeclaration {
    public static void main(String[] args) {
        int[] intArr = new int[10];
        int[] intArr2 = new int[]{1, 2, 3, 4, 5};
        int[] intArr3 = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(intArr));
        System.out.println(Arrays.toString(intArr2));
        System.out.println(Arrays.toString(intArr3));

        System.out.println();

        float[] floatArr = new float[10];
        float[] floatArr2 = {1.5f, 2.5f, 4.5f};
        System.out.println(Arrays.toString(floatArr));
        System.out.println(Arrays.toString(floatArr2));

        System.out.println();
        boolean[] booleans = new boolean[5];
        boolean[] booleans1 = {true, false, true};
        System.out.println(Arrays.toString(booleans));
        System.out.println(Arrays.toString(booleans1));

        System.out.println();
        char[] charArr = new char[10];
        char[] charArr2 = {'A', 'B', 'C'};
        System.out.println(Arrays.toString(charArr));
        System.out.println(Arrays.toString(charArr2));

        System.out.println();
        String[] stringArr = new String[10];
        String[] stringArr2 = {"ABC", "Hello", "World"};
        System.out.println(Arrays.toString(stringArr));
        System.out.println(Arrays.toString(stringArr2));
    }
}
