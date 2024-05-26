package assignments.week1.assignment1.leaderAssignment.week2.day5;

import java.io.Serializable;

public class UserDTO implements Serializable {
    private String userName;

    private String role;

    public String getUserName() {
        return userName;
    }

    public String getRole() {
        return role;
    }

    public UserDTO(String userName, String role) {
        this.userName = userName;
        this.role = role;
    }


}
