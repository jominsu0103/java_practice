package Lectures.week1.training1.chapter_53;

public class OuterClassTest {
    public static void main(String[] args) {

        //일반 중첩 클래스
        OuterClass outerClass = new OuterClass(20);

        OuterClass.InnerClass innerClass = outerClass.new InnerClass(30);

        innerClass.display();

        //정적 중첩 클래스
        OuterStaticClass outerStaticClass = new OuterStaticClass(10);

        OuterStaticClass.InnerClass innerClass1 = new OuterStaticClass.InnerClass(20);

        innerClass1.display();

    }
}
