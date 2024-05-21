package Lectures.week1.training1.chapter_37;

public interface DaddyRole {
    void educateBaby(Baby baby);

    default void sayLoveEveryDay() {
        System.out.println("우리아기 사랑합니다.");
    }

    ;
}
