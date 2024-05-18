package Lectures.week1.training1.chapter_31;

public class FishChild extends Fish {
    private boolean eatable;

    public boolean isEatable() {
        return eatable;
    }

    public void setEatable(boolean eatable) {
        this.eatable = eatable;
    }

    public void digging() {
        System.out.println(myInfo() + "가 모래를 파고 있습니다.");
    }

    public void becomeDanger() {
        this.havingPoison = true;
    }

    @Override
    void eat(String food) {
        System.out.printf(myInfo() + "는 물고기는 %s를 아주 열심히 먹고 있습니다.\n", food);
    }
}
