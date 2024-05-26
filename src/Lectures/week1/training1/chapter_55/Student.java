package Lectures.week1.training1.chapter_55;

public class Student {
    private int classRoomNumber;

    private int studentNumber;

    private String name;
    private String gender;

    private int score;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public String getGender() {
        return gender;
    }

    Student() {
        this("unknown", "unknown", 0);
    }

    public Student(String name, String gender, int score) {
        this.name = name;
        this.gender = gender;
        this.score = score;
    }
}
