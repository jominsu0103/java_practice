package Lectures.week1.training1.chapter_61.meta;

public class Myclass {
    @Repeat(value = 3)
    public void printMessage() {
        System.out.println("Hello world");
    }

    @Repeat(value = 10)
    public void foo() {
        System.out.println("This is another method");
    }
}
