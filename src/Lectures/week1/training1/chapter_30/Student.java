package Lectures.week1.training1.chapter_30;

import Lectures.week1.training1.chapter_28.Teacher;

public class Student {
    private static int serialNum = 1;
    private static String city = "Seoul";
    //
    private String schoolName;
    private int classYear;
    private int classroomNumber;
    private int studentNumber;

    private int studentID;

    private String name;
    private String gender;

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public int getClassYear() {
        return classYear;
    }

    public void setClassYear(int classYear) {
        this.classYear = classYear;
    }

    public int getClassroomNumber() {
        return classroomNumber;
    }

    public void setClassroomNumber(int classroomNumber) {
        this.classroomNumber = classroomNumber;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public static int getSerialNum() {
        return serialNum;
    }

    public static void setSerialNum(int serialNum) {
        Student.serialNum = serialNum;
    }

    public static String getCity() {
        return city;
    }

    public static void setCity(String city) {
        Student.city = city;
    }

    void study(Teacher teacher, String subjectName) {
        String teacherName = teacher.getName();
        System.out.printf("학생: 저는 %s 선생님에게 %s 과목을 배우고 있습니다.\n", teacherName, subjectName);
    }

    public void printMyInfo() {
        System.out.printf("[Student] schoolName: %s , classYear: %d , classRoomNumber: %d," +
                        " studentNumber: %d , studentID: %d, name: %s , gender: %s\n",
                this.schoolName, this.classYear, this.classroomNumber, this.studentNumber, this.studentID,
                this.name, this.gender);
    }

    Student() {

    }

    Student(String name, String gender) {
        this("School", 1, 3, -1, name, gender);
    }

    Student(String schoolName, int classYear, int classroomNumber, int studentNumber, String name, String gender) {
        this.studentID = serialNum++;
        this.schoolName = schoolName;
        this.classYear = classYear;
        this.classroomNumber = classroomNumber;
        this.studentNumber = studentNumber;
        this.name = name;
        this.gender = gender;
    }
}
