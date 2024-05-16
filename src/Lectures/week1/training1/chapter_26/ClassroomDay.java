package Lectures.week1.training1.chapter_26;

public class ClassroomDay {
    public static void main(String[] args) {
        //
        Student student1 = new Student("school", 1, 3, 20, "park", "male");
        Student student2 = new Student("school", 1, 3, 21, "kim", "female");
        Student student3 = new Student("school", 1, 3, 22, "jung", "female");
        Student student4 = new Student("school", 1, 3, 23, "lee", "female");

        Teacher teacher = new Teacher("Tom", "female", "korean", "AB001");

        String subjectName = "국어";

        // 본격적인 로직 흐름 시작
        teacher.teach(student1, subjectName);
        student1.study(teacher, subjectName);

        teacher.teach(student2, subjectName);
        student2.study(teacher, subjectName);

        teacher.teach(student3, subjectName);
        student3.study(teacher, subjectName);

        teacher.teach(student4, subjectName);
        student4.study(teacher, subjectName);
    }
}
