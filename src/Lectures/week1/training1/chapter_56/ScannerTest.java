package Lectures.week1.training1.chapter_56;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("이름 입력");
        String name = sc.nextLine();

        System.out.println("직업 입력");
        String job = sc.nextLine();

        System.out.println("나이 입력");
        int age = sc.nextInt();

        System.out.printf("이름 : %s, 직업 %s, 나이 %d\n", name, job, age);
    }
}
