package Lectures.week1.training1.chapter_33;

public class AnimalDownCasting {
    public static void main(String[] args) {
        Animal animal = new Bird();
        checkBirdAndFly(animal);

        Animal animal1 = new Animal();
        checkBirdAndFly(animal1);

        Animal animal2 = new Person();
        checkBirdAndFly(animal2);
    }

    static void checkBirdAndFly(Animal animal) {
        if (animal instanceof Bird) {
            Bird bird = (Bird) animal;
            bird.fly();
        } else {
            System.out.println("너는 bird가 아니야");
        }
    }
}
