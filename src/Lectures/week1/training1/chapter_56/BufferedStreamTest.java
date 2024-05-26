package Lectures.week1.training1.chapter_56;

import java.io.*;

public class BufferedStreamTest {
    public static void main(String[] args) {
        try (FileReader fis = new FileReader("src/Lectures/week1/training1/chapter_56/test_long.txt");
             FileWriter fws = new FileWriter("src/Lectures/week1/training1/chapter_56/output_long.txt")) {
            long start = System.currentTimeMillis();

            int data;
            while ((data = fis.read()) != -1) {
                fws.write((char) data);
            }
            long end = System.currentTimeMillis();

            System.out.println("적용 전 " + (end - start) + "ms");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        ////
        try (BufferedReader bfr = new BufferedReader(new FileReader("src/Lectures/week1/training1/chapter_56/test_long.txt"));
             BufferedWriter bfw = new BufferedWriter(new FileWriter("src/Lectures/week1/training1/chapter_56/output_long.txt"))) {
            long start = System.currentTimeMillis();

            int data;
            while ((data = bfr.read()) != -1) {
                bfw.write((char) data);
            }
            long end = System.currentTimeMillis();

            System.out.println("적용 전 " + (end - start) + "ms");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
