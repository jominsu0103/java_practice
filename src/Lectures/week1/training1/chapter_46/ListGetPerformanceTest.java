package Lectures.week1.training1.chapter_46;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListGetPerformanceTest {
    static final int SIZE = 100_000;

    public static void main(String[] args) {

        // List ArrayList 구현

        List<Integer> integerList = new ArrayList<>();

        for (int i = 0; i < SIZE; i++) {

            integerList.add(i);

        }

        List<Integer> integerList1 = new LinkedList<>();

        for (int i = 0; i < SIZE; i++) {
            integerList1.add(i);
        }

//        System.out.println(integerList);
//        System.out.println(integerList1);

        long startTime;
        long endTime;

        startTime = System.currentTimeMillis();

        for (int i = 0; i < SIZE; i++) {
            integerList.get(i);
        }

        endTime = System.currentTimeMillis();

        System.out.println("ArrayList 걸린시간" + (endTime - startTime) + "ms");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < SIZE; i++) {
            integerList1.get(i);
        }

        endTime = System.currentTimeMillis();

        System.out.println("LinkedList 걸린시간" + (endTime - startTime) + "ms");


    }
}
