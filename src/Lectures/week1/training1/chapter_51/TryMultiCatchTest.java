package Lectures.week1.training1.chapter_51;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryMultiCatchTest {
    public static void main(String[] args) {
        try {
            System.out.println("main method run");
            FileInputStream fs = new FileInputStream("src/Lectures/week1/training1/chapter_51/test.txt");

            int i = 0;
            int data = 100 / i;

            String str = "abc";
            System.out.println(str.toUpperCase());

            int index = 10;
            int[] intArr = new int[10];
            System.out.println(intArr[index]);
        } catch (FileNotFoundException e) {
            System.out.println("File을 찾을 수 없습니다.");
            e.printStackTrace();
        } catch (ArithmeticException | NullPointerException e) {
            System.out.println("ArithemticException 또는 NullPointerException이 발생함");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("최종 Exception 필터에 걸림");
            e.printStackTrace();
        }
//        catch (NullPointerException e) {
//            System.out.println("NullPointerException이 발생함");
//        }
        System.out.println("main method stop");
    }
}
