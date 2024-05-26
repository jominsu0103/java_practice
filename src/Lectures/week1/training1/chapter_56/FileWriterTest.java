package Lectures.week1.training1.chapter_56;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    public static void main(String[] args) {
        String content = "이것은 파일 컨텐츠";

        try (FileWriter fos = new FileWriter("src/Lectures/week1/training1/chapter_56/output_korean.txt")) {
            fos.write(content);
            System.out.println("txt file generated");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
