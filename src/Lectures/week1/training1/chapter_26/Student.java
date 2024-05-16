package Lectures.week1.training1.chapter_26;

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
