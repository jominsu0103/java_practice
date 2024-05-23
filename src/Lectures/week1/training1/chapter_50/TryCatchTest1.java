package Lectures.week1.training1.chapter_50;

public class TryCatchTest1 {
    public static void main(String[] args) {
        System.out.println("main method run");

        try {
            int i = 10;
            int data = 50 / i;
            System.out.println("data : " + data);
        } catch (ArithmeticException e) {
            System.out.println("0으로는 나눌 수 가 없습니다.");
            System.out.println("data : " + 0);
            e.printStackTrace();
        }


        System.out.println("main method stop");
    }
}
