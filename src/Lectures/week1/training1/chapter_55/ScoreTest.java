package Lectures.week1.training1.chapter_55;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ScoreTest {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("아이유", "여자", 95));
        students.add(new Student("박보검", "남자", 92));
        students.add(new Student("송중기", "남자", 90));
        students.add(new Student("김태리", "여자", 85));
        students.add(new Student("전정국", "남자", 88));
        students.add(new Student("방탄소년단", "남자", 70));
        students.add(new Student("이지은", "여자", 63));
        students.add(new Student("윤아", "여자", 70));
        students.add(new Student("하정우", "남자", 75));
        students.add(new Student("공유", "남자", 80));

        // 1. 90점 넘는 학생들 이름 구하기
        students.stream().filter((student -> student.getScore() >= 90)).map((student -> student.getName())).forEach((name -> System.out.println(name)));

        // 2. 중위값 구하기
        long size = students.stream().count();

        int medium = students.stream().map((student -> student.getScore())).sorted().skip(size / 2).findFirst().orElseGet(() -> 0);
        System.out.println(medium);

        // 3.남학생들 중 가장 낮은 성적을 가진 학생의 이름 출력하기
        String lowerMailStudent = students.stream()
                .filter(student -> student.getGender().equals("남자"))
                .min(Comparator.comparingInt(Student::getScore))
                .map(Student::getName)
                .orElse("no male student found");
        System.out.println("제일 낮은 성적을 가진 남학생 : " + lowerMailStudent);

        // 4.여학생들 중 성적 상위 3명의 평균 성적 구하기
        double bestFemaleAverage = students.stream()
                .filter(student -> student.getGender().equals("여자"))
                .sorted(Comparator.comparingInt(Student::getScore).reversed())
                .limit(3)
                .mapToInt(Student::getScore)
                .average()
                .orElse(0.0);

        System.out.println("여학생들 중 성적 상위 3명의 평균 성적: " + bestFemaleAverage);
    }
}
