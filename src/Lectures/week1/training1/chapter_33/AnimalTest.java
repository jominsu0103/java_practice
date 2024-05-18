package Lectures.week1.training1.chapter_33;

public class AnimalTest {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal animal2 = new Bird();
        Animal animal3 = new Fish();
        Animal animal4 = new Person();

        feed(animal, "빼빼로");
        feed(animal2, "벌레");
        feed(animal3, "모이");
        feed(animal4, "밥");
    }

    public static void feed(Animal animal, String food) {
        animal.eat(food);
    }
}
