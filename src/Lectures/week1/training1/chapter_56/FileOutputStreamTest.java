package Lectures.week1.training1.chapter_56;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {
    public static void main(String[] args) {
        String content = "This is content of File";

        try (FileOutputStream fos = new FileOutputStream("src/Lectures/week1/training1/chapter_56/output.txt", true)) {
            byte[] bytes = content.getBytes();
            fos.write(bytes);
            System.out.println("txt file generated");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
