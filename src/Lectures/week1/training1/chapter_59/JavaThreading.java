package Lectures.week1.training1.chapter_59;

public class JavaThreading {
    public static void main(String[] args) {
        // Thread
        Thread thread = new Thread(new MyRunnable());
        Thread thread2 = new Thread(new MyRunnable());

        System.out.println(Thread.currentThread().getName());

        thread.start();
        thread2.start();

        System.out.println(Thread.currentThread().getName());


    }

    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
