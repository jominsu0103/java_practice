package Lectures.week1.training1.chapter_60.builder;

public class BuilderTest {
    public static void main(String[] args) {
        User user = new User("cho", "minsu", 28, "example@gmail.com");

        System.out.println("적용 전 : " + user);

//        User user1 = new User.UserBuilder().firstName("cho").lastName("minsu").age(28).email("example@example.com");

        User user1 = new User.UserBuilder()
                .firstName("cho")
                .lastName("misu")
                .age(28)
                .email("example@example.com")
                .build();

        System.out.println("적용 후 : " + user1);
    }
}
