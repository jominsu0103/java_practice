package Lectures.week1.training1.chapter_60.singleton;

public class FileWriterSingletonTest {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            FileWriterSingleton writerSingleton = FileWriterSingleton.getInstance();
            writerSingleton.writeToFile("Thread 1: Message 1");
            writerSingleton.writeToFile("Thread 1: Message 2");
        });

        Thread thread1 = new Thread(() -> {
            FileWriterSingleton writerSingleton = FileWriterSingleton.getInstance();
            writerSingleton.writeToFile("Thread 1: Message 3");
            writerSingleton.writeToFile("Thread 1: Message 4");
        });


        thread.start();
        thread1.start();

//        join
//        FileWriterSingleton.getInstance().closeFile();
    }
}
