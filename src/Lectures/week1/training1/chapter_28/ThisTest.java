package Lectures.week1.training1.chapter_28;

public class ThisTest {
    public static void main(String[] args) {
        Person person1 = new Person("강철중");
        Person person2 = new Person("이민호", "Male");
        Person person3 = new Person("아이유", "Female", 30);

        person1.showMyself();
        person2.showMyself();
        person3.showMyself();

        Person person11 = person1.returnMyself();
        Person person22 = person2.returnMyself();
        Person person33 = person3.returnMyself();

        System.out.println(person11);
        System.out.println(person22);
        System.out.println(person33);
        
    }
}
