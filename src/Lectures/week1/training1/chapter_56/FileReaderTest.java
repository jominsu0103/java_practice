package Lectures.week1.training1.chapter_56;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
    public static void main(String[] args) {
        try (FileReader fis = new FileReader("src/Lectures/week1/training1/chapter_56/test_korean.txt")) {
            int i;
            while ((i = fis.read()) != -1) {
                System.out.print((char) i);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
