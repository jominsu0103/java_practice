package assignments.week1.assignment1.leaderAssignment;

public class SuperUser extends User implements ReviewerRole, AdminRole {
    public SuperUser(String username) {
        super(username);
    }


    @Override
    public void manageUsers() {
        System.out.println("슈퍼유저(" + username + ")는(은) 유저를 매니징할 수 있습니다.");
    }

    @Override
    public void changeSettings() {
        System.out.println("슈퍼유저(" + username + ")는(은) 세팅을 변경할 수 있습니다.");
    }
}
