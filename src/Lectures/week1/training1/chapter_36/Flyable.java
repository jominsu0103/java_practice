package Lectures.week1.training1.chapter_36;

public interface Flyable {
    long atmosphereLimit = 476;

    default void fiy() {
        System.out.println("<정보> 현재 이 사물은 날고 있습니다.");
    }

    ;

    static void printLanding() {
        System.out.println("<경보> 현 이 사물은 공중에 있습니다.");
    }
}
