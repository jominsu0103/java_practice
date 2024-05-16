package Lectures.week1.training1.chapter_27;

public class Student {
    //
    private String schoolName;
    private int classYear;
    private int classroomNumber;
    private int studentNumber;

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

    void study(Teacher teacher, String subjectName) {
        String teacherName = teacher.getName();
        System.out.printf("학생: 저는 %s 선생님에게 %s 과목을 배우고 있습니다.\n", teacherName, subjectName);
    }

    Student() {

    }

    Student(String pSchoolName, int pClassYear, int pClassroomNum, int pStudentNum, String pName, String pGender) {
        schoolName = pSchoolName;
        classYear = pClassYear;
        classroomNumber = pClassroomNum;
        studentNumber = pStudentNum;
        name = pName;
        gender = pGender;
    }
}
