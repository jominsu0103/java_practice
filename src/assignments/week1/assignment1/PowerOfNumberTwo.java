package assignments.week1.assignment1;

import java.util.Arrays;

public class PowerOfNumberTwo {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] result1 = addZerosToPowerOfNumberTwo(arr1);
        System.out.println(Arrays.toString(result1));

        int[] arr2 = {58, 172, 746, 89};
        int[] result2 = addZerosToPowerOfNumberTwo(arr2);
        System.out.println(Arrays.toString(result2));

        int[] arr3 = {9, 8, 7};
        int[] result3 = addZerosToPowerOfNumberTwo(arr3);
        System.out.println(Arrays.toString(result3));

        int[] arr4 = {11, 22, 33, 44, 55, 66, 77, 88, 99, 1111, 2222, 333, 4444, 2222, 333, 4444, 2222, 333, 4444, 2222, 333, 4444, 2222, 333, 4444};
        int[] result4 = addZerosToPowerOfNumberTwo(arr4);
        System.out.println(Arrays.toString(result4));
    }

    public static int[] addZerosToPowerOfNumberTwo(int[] arr) {
        int length = arr.length;


        if ((length & (length - 1)) == 0) {
            return arr;
        }

        int len;
        for (len = 1; len < length; len *= 2) {
        }

        int[] result = new int[len];
        for (int i = 0; i < length; i++) {
            result[i] = arr[i];
        }

        return result;
    }
}
