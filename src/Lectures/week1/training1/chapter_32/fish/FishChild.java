package Lectures.week1.training1.chapter_32.fish;

public class FishChild extends Fish {
    private boolean eatable;

    protected String leavingSeaChild;

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

    public String getLeavingSeaChild() {
        return leavingSeaChild;
    }

    public void setLeavingSeaChild(String leavingSeaChild) {
        this.leavingSeaChild = leavingSeaChild;
    }

    @Override
    void eat(String food) {
        System.out.printf(myInfo() + "는 물고기는 %s를 아주 열심히 먹고 있습니다.\n", food);
    }

    void printSea() {
        System.out.println(myInfo() + "는 " + this.leavingSeaChild + "바다 출신이고 , " +
                "부모 물고기는 " + super.leavingSea + "바다 출신이야");
    }

    FishChild() {
        super();
    }

    FishChild(String gender, boolean eatable, String leavingSea) {
        super(gender, false, "2020", "2023", leavingSea);
        this.eatable = eatable;
    }

    public FishChild(boolean eatable, String leavingSea) {
        this.eatable = eatable;
        super.leavingSea = leavingSea;
    }

//    @Override
//    String myInfo() {
//        return super.myInfo() + "는 부모 물고기, " + String.format("자식 물고기(eatble=%b , leavingSea=%s)", this.eatable, this.leavingSeaChild);
//    }
}
