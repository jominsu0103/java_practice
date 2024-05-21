package Lectures.week1.training1.chapter_35;

public class AnimalTest {
    public static void main(String[] args) {
        Animal animal2 = new Bird();
        Animal animal3 = new Fish();
        Animal animal4 = new Person();
        Animal animal5 = new Dog();

        feed(animal2, "벌레");
        feed(animal3, "모이");
        feed(animal4, "김밥");
        feed(animal5, "개껌");


    }

    public static void feed(Animal animal, String food) {
        animal.eat(food);
    }
}
