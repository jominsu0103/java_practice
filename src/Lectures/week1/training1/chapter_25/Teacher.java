package Lectures.week1.training1.chapter_25;

public class Teacher {

    // 학교 정보
    String schoolName;
    //담당 과목
    Subject subject;
    //기본 정보
    String name;
    String gender;

    void teach(Student student, String subjectName) {
        String studentName = student.name;
        System.out.printf("선생 : %s 학생에게 %s 과목을 가르치고 있습니다.", studentName, subjectName);
    }
}
