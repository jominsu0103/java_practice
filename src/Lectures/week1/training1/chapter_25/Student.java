package Lectures.week1.training1.chapter_25;

public class Student {
    //
    String schoolName;
    int classYear;
    int classroomNumber;
    int studentNumber;

    String name;
    String gender;

    void study(Teacher teacher, String subjectName) {
        String teacherName = teacher.name;
        System.out.printf("학생: 저는 %s 선생님에게 %s 과목을 배우고 있습니다.", teacherName, subjectName);
    }
}
