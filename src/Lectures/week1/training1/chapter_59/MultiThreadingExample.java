package Lectures.week1.training1.chapter_59;

public class MultiThreadingExample {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new PrintNumberRunnable(1, 50));
        Thread thread2 = new Thread(new PrintNumberRunnable(51, 100));

        thread1.start();
        thread2.start();
    }
}
