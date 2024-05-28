package Lectures.week1.training1.chapter_60.singleton;

public class FileWriterExampleTest {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            FileWriterExample writer = new FileWriterExample("src/Lectures/week1/training1/chapter_60/singleton/test.txt");
            writer.writeToFile("Thread 1: Message 1");
            writer.writeToFile("Thread 1: Message 2");
        });

        Thread thread1 = new Thread(() -> {
            FileWriterExample writer = new FileWriterExample("src/Lectures/week1/training1/chapter_60/singleton/test.txt");
            writer.writeToFile("Thread 2: Message 3");
            writer.writeToFile("Thread 2: Message 4");
        });

        Thread thread2 = new Thread(() -> {
            FileWriterExample writer = new FileWriterExample("src/Lectures/week1/training1/chapter_60/singleton/test.txt");
            writer.writeToFile("Thread 2: Message 5");
            writer.writeToFile("Thread 2: Message 6");
        });

        thread.start();
        thread1.start();
        thread2.start();
    }
}
