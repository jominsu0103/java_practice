package Lectures.week1.training1.chapter_33;

public class Fish extends Animal {
    private boolean havingPosion;
    private String leavingSea;

    @Override
    public void eat(String food) {
        System.out.printf("물고기가 %s를 주둥이로 먹습니다.\n", food);
    }

    @Override
    public void sleep() {
        System.out.println("물고기가 잠을 자고 있습니다.");
    }

    public void swim() {
        System.out.println("물고기가 헤엄을 치고 있습니다.");
    }
}
