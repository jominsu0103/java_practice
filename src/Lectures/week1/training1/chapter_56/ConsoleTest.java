package Lectures.week1.training1.chapter_56;

import java.io.IOException;

public class ConsoleTest {
    public static void main(String[] args) {
        int i = 0;
        System.out.println("입력값");
        try {
            StringBuilder sb = new StringBuilder();
            while ((i = System.in.read()) != '\n') {
                sb.append((char) i);
            }
            System.out.println("String 출력 " + sb);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
