package assignments.week1.assignment1.leaderProject.day4;

public class Customer {
    private String name;
    private int age;
    private Gender gender;

    public String getName() {
        return name;
    }

    public Customer(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
