package Lectures.week1.training1.chapter_56;

import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {
    public static void main(String[] args) {
        int i;
        StringBuilder sb = new StringBuilder();
        try {
            while ((i = System.in.read()) != '\n') {
                sb.append((char) i);
            }
            System.out.println(sb.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }

        int j;
        StringBuilder sb1 = new StringBuilder();
        try (InputStreamReader isr = new InputStreamReader(System.in)) {
            while ((j = isr.read()) != '\n') {
                sb1.append((char) j);
            }
            System.out.println(sb1.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
