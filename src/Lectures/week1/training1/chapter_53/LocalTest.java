package Lectures.week1.training1.chapter_53;

public class LocalTest {
    public static void main(String[] args) {
        class LocalWalk implements Walkable {
            @Override
            public void walk() {
                System.out.println("localWalk : Walking");
            }
        }
        LocalWalk localWalk = new LocalWalk();
        localWalk.walk();

        int i = 100;

        // 익명 클래스

        Walkable anonymousWalk = new Walkable() {
            @Override
            public void walk() {
                // i = 200; (X) 접근해 읽는것만 가능
                System.out.println("i : " + i);
                System.out.println("anonymousWalk : Walking");
            }
        };
        anonymousWalk.walk();
    }
}
