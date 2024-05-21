package Lectures.week1.training1.chapter_36;

public class InterfaceTest {
    public static void main(String[] args) {
        System.out.println(Flyable.atmosphereLimit);

        //Flyable
        Flyable bird = new Bird();
        Flyable airplane = new Airplane("ab0101");

        bird.fiy();
        airplane.fiy();

        //Walkable
        Walkable person = new Person();
        Person person1 = new Person();
        person1.setName("cho");
        Walkable robot = new Robot("ab78441");

        person.walk();
        robot.walk();

        if (robot instanceof Robot) {
            Robot robot2 = (Robot) robot;
            robot2.helpPerson(person1, robot2);
        }
    }
}
