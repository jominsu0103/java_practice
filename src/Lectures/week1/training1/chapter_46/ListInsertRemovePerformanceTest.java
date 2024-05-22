package Lectures.week1.training1.chapter_46;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListInsertRemovePerformanceTest {
    static final int SIZE = 100;

    public static void main(String[] args) {

        long startTime;
        long endTime;

        startTime = System.currentTimeMillis();
        // List ArrayList 구현
        List<Integer> integerList = new ArrayList<>();

        for (int i = 0; i < SIZE; i++) {

            integerList.add(i);
            if (i % 5 == 0) integerList.remove(0);

        }
        endTime = System.currentTimeMillis();

        System.out.println("ArrayList 삽입/삭제 요청 걸린시간" + (endTime - startTime) + "ms");

        // List LinkedList 구현
        startTime = System.currentTimeMillis();
        List<Integer> integerList1 = new LinkedList<>();

        for (int i = 0; i < SIZE; i++) {
            integerList1.add(i);
            if (i % 5 == 0) integerList1.remove(0);
        }

        endTime = System.currentTimeMillis();

//        System.out.println("ArrayList" + integerList);
//        System.out.println("LinkedList" + integerList1);

        System.out.println("LinkedList 삽입/삭제 요청 걸린시간" + (endTime - startTime) + "ms");
    }
}
