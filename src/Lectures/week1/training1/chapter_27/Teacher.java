package Lectures.week1.training1.chapter_27;

public class Teacher {

    // 학교 정보
    private String schoolName;
    //담당 과목
    private Subject subject;
    //기본 정보
    private String name;

    private String gender;

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
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


    void teach(Student student, String subjectName) {
        String studentName = student.getName();
        System.out.printf("선생 : %s 학생에게 %s 과목을 가르치고 있습니다.\n", studentName, subjectName);
    }

    Teacher() {

    }

    Teacher(String pName, String pGender, String pSubjectName, String pSubjectCode) {
        name = pName;
        gender = pGender;

        Subject newSubject = new Subject();
        newSubject.setSubjectName(pSubjectName);
        newSubject.setSubjectCode(pSubjectCode);

        subject = newSubject;
    }
}
