package assignments.week1.assignment1;

public class ThisStudentTest {
    public static void main(String[] args) {
        StudentManagementSystem system = new StudentManagementSystem(2);

        // 학생 추가
        Student student1 = new Student("홍길동", 12345, "컴퓨터공학", 3);
        system.addStudent(student1);

        // 학생 추가
        Student student2 = new Student("이순신", 67890, "수학", 2);
        system.addStudent(student2);

        System.out.println("학생 검색 시작하겠습니다.");
        // 학생 검색
        system.searchStudent(12345);

        System.out.println("학생 검색 삭제하겠습니다.");
        // 학생 삭제
        system.removeStudent(student1);

        System.out.println("학생 검색 시작하겠습니다.");
        // 학생 검색 (삭제된 학생)
        system.searchStudent(12345);
    }

}
