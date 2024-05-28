package assignments.week1.assignment1.directSuperior.day1;

import java.util.ArrayList;
import java.util.List;

public class ThreeThreadsListFiller {
    public static void main(String[] args) {
        // 작업할 List 생성
        int listSize = 1000;
        List<Integer> list = new ArrayList<>(listSize);

        // 결과 확인
        System.out.println("List의 길이: " + list.size());
        System.out.println("List의 내용: " + list);

        // 3개의 쓰레드 생성, 업무 분담 실행
        Thread thread1 = new Thread(new ListFillerTask(list, 0));
        Thread thread2 = new Thread(new ListFillerTask(list, 1));
        Thread thread3 = new Thread(new ListFillerTask(list, 2));

        // 3개 Thread 작업 진행
        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 결과 확인
        System.out.println("List의 길이: " + list.size());
        System.out.println("List의 내용: " + list);
    }

    // 자신이 맡은 리스트 인덱스의 값을 각각 0, 1, 2로 채우는 Task 구현
    static class ListFillerTask implements Runnable {
        private List<Integer> list;
        private int startIndex;

        public ListFillerTask(List<Integer> list, int startIndex) {
            this.list = list;
            this.startIndex = startIndex;
        }

        @Override
        public void run() {
            for (int i = startIndex; i < list.size(); i += 3) {
                list.set(i, i % 3);
            }
        }
    }
}
