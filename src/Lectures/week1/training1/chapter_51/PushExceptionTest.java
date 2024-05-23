package Lectures.week1.training1.chapter_51;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class PushExceptionTest {
    public static void main(String[] args) {
        try {
            printFile("src/Lectures/week1/training1/chapter_51/test.txt");
        } catch (FileNotFoundException e) {

        } catch (IOException e) {

        }
    }

    static void printFile(String filename) throws IOException {
        FileInputStream fs = getFileStream(filename);

        int i;
        while ((i = fs.read()) != -1) {
            System.out.write(i);
        }
    }

    static FileInputStream getFileStream(String filename) throws FileNotFoundException {
        FileInputStream fs = new FileInputStream(filename);
        return fs;
    }
}
