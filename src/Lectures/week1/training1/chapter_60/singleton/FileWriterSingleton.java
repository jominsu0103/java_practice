package Lectures.week1.training1.chapter_60.singleton;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterSingleton {
    private static FileWriterSingleton instance = null;
    private FileWriter fileWriter;

    public FileWriterSingleton() {
        try {
            this.fileWriter = new FileWriter("src/Lectures/week1/training1/chapter_60/singleton/test.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public synchronized static FileWriterSingleton getInstance() {
        if (instance == null) {
            instance = new FileWriterSingleton();
        }
        return instance;
    }

    public synchronized void writeToFile(String message) {
        try {
            fileWriter.write(message + "\n");
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public synchronized void closeFile() {
        try {
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
