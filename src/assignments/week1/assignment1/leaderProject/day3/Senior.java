package assignments.week1.assignment1.leaderProject.day3;

public class Senior extends ElderGroupCollegeStudent {
    public Senior(String studentNumber, String name, double gpa) {
        super(studentNumber, name, gpa);
    }

    @Override
    public String toString() {
        return "Senior{" + "studentNumber=" + "'" + studentNumber + "'," + "name=" + "'" + name + "'," + "gpa=" + gpa + "}";
    }
}
