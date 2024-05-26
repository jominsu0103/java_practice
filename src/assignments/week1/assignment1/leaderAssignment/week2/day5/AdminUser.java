package assignments.week1.assignment1.leaderAssignment.week2.day5;

public class AdminUser extends User {
    public AdminUser(String userName) {
        super(userName);
    }

    @Override
    public String toString() {
        return "AdminUser{" +
                "AdminUserName='" + getUserName() + '\'' +
                '}';
    }
}
