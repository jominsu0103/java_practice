package assignments.week1.assignment1;

public class StudentManagementSystem {
    private Student[] students;
    private int capacity;
    private int size;

    // 생성자
    public StudentManagementSystem(int capacity) {
        this.capacity = capacity;
        this.students = new Student[capacity];
        this.size = 0;
    }

    // 학생 추가 메서드
    public void addStudent(Student student) {
        if (size < capacity) {
            students[size++] = student;
            System.out.println("학생 추가: " + student.getName());
        } else {
            System.out.println("더 이상 학생을 추가할 수 없습니다.");
        }
    }

    // 학생 삭제 메서드
    public void removeStudent(Student student) {
        for (int i = 0; i < size; i++) {
            if (students[i].getStudentId() == student.getStudentId()) {
                System.arraycopy(students, i + 1, students, i, size - i - 1);
                size--;
                System.out.println("학생 삭제: " + student.getName());
                return;
            }
        }
        System.out.println("해당 학생을 찾을 수 없습니다.");
    }

    // 학생 검색 메서드
    public void searchStudent(int studentId) {
        for (int i = 0; i < size; i++) {
            if (students[i].getStudentId() == studentId) {
                Student s = students[i];
                System.out.println("학생을 찾았습니다:");
                System.out.println("이름: " + s.getName());
                System.out.println("학번: " + s.getStudentId());
                System.out.println("전공: " + s.getMajor());
                System.out.println("학년: " + s.getGrade());
                return;
            }
        }
        System.out.println("학생을 찾을 수 없습니다.");
    }
}
