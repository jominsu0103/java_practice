package Lectures.week1.training1.chapter_30;

public class StaticTest {
    public static void main(String[] args) {
        int num = Student.getSerialNum();
        String city = Student.getCity();

        System.out.println(num);
        System.out.println(city);

//        Student.serialNum = 10;

        Student student1 = new Student("park", "female");
        Student student2 = new Student("kim", "male");
        Student student3 = new Student("lee", "female");
        Student student4 = new Student("hwang", "male");

        student1.printMyInfo();
        student2.printMyInfo();
        student3.printMyInfo();
        student4.printMyInfo();
    }
}
