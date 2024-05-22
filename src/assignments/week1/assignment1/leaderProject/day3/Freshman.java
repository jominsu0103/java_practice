package assignments.week1.assignment1.leaderProject.day3;

public class Freshman extends YoungGroupCollegeStudent {
    public Freshman(String studentNumber, String name, double gpa) {
        super(studentNumber, name, gpa);
    }

    @Override
    public String toString() {
        return "Freshman{" + "studentNumber=" + "'" + studentNumber + "'," + "name=" + "'" + name + "'," + "gpa=" + gpa + "}";
    }
}
