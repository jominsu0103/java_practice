package Lectures.week1.training1.chapter_26;


public class InstanceTest {
    public static void main(String[] args) {
        Student student1 = new Student("School", 1, 3, 20, "Bob", "Male");
        System.out.println(student1.name);
        System.out.println(student1.gender);
        System.out.println(student1.studentNumber);

//        student1.name = "Bob";
//        student1.gender = "Male";
//        student1.schoolName = "School";
//        student1.classYear = 1;
//        student1.classroomNumber = 3;
//        student1.studentNumber = 20;

        Student student2 = new Student("School", 1, 3, 15, "Alice", "Female");
//        student2.name = "Alice";
//        student2.gender = "Female";
//        student2.schoolName = "School";
//        student2.classYear = 1;
//        student2.classroomNumber = 3;
//        student2.studentNumber = 15;

        System.out.println(student2.name);
        System.out.println(student2.gender);
        System.out.println(student2.studentNumber);

        Teacher teacher = new Teacher("Tom", "Female", "korean", "AB001");
//        teacher.name = "Tom";
//        teacher.gender = "Female";
//        teacher.schoolName = "School";

//        Subject koreanSubject = new Subject();
//        koreanSubject.subjectName = "korean";
//        koreanSubject.subjectCode = "AB001";

//        teacher.subject = koreanSubject;
        System.out.println(teacher.name);
        System.out.println(teacher.gender);
//        System.out.println(teacher.schoolName);
        System.out.println(teacher.subject.subjectCode);
        System.out.println(teacher.subject.subjectName);

    }
}
