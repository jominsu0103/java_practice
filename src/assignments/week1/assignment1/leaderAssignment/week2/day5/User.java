package assignments.week1.assignment1.leaderAssignment.week2.day5;

public class User {
    private String userName;

    public String getUserName() {
        return userName;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                '}';
    }

    public User(String userName) {
        this.userName = userName;
    }
}
