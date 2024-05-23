package Lectures.week1.training1.chapter_51;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryCatchFinallyCloseTest {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.out.println("main method run");
        try (FileInputStream fs = new FileInputStream("src/Lectures/week1/training1/chapter_51/test.txt");) {

            int i;
            while ((i = fs.read()) != -1) {
                System.out.write(i);
            }

            int myInt = 0;
            int data = 100 / myInt;
        } catch (FileNotFoundException e) {
            System.out.println("File을 찾을 수 없습니다.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("입출력 과정에서 문제가 생겼습니다.");
            e.printStackTrace();
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
            e.printStackTrace();
        }

        System.out.println("main method stop");

        while (true) {
            Thread.sleep(1000);
        }
    }
}
