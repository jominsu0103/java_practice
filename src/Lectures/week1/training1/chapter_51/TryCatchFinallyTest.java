package Lectures.week1.training1.chapter_51;

public class TryCatchFinallyTest {
    public static void main(String[] args) {
        System.out.println("main method run");

        try {
            Integer myInt = 14;
            Integer data = 100 / myInt;

            if (myInt == 14) return;

            System.out.println("data : " + data);
        } catch (ArithmeticException e) {
            System.out.println("MyInt는 0이 될 수 없다.");
            e.printStackTrace();
        } finally {
            System.out.println("무조건 실행되는 finally 영역");
        }

        System.out.println("main method stop");
    }
}
