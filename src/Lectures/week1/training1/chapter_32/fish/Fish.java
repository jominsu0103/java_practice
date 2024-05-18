package Lectures.week1.training1.chapter_32.fish;

public class Fish {
    //속성
    private String gender;
    protected boolean havingPoison;
    private String startSpawningDate;
    private String endSpawningDate;
    protected String leavingSea;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isHavingPoison() {
        return havingPoison;
    }

    public void setHavingPoison(boolean havingPoison) {
        this.havingPoison = havingPoison;
    }

    public String getStartSpawningDate() {
        return startSpawningDate;
    }

    public void setStartSpawningDate(String startSpawningDate) {
        this.startSpawningDate = startSpawningDate;
    }

    public String getEndSpawningDate() {
        return endSpawningDate;
    }

    public void setEndSpawningDate(String endSpawningDate) {
        this.endSpawningDate = endSpawningDate;
    }

    public String getLeavingSea() {
        return leavingSea;
    }

    public void setLeavingSea(String leavingSea) {
        this.leavingSea = leavingSea;
    }

    String myInfo() {
        return String.format("물고기(gender=%s, havingPosing=%b, leavingSea=%s)",
                this.gender, this.havingPoison, this.leavingSea);
    }

    void printMyInfo() {
        System.out.println(myInfo());
    }

    void eat(String food) {
        System.out.printf(myInfo() + "는 물고기는 %s를 먹고 있습니다.\n", food);
    }

    void swin(int meter) {
        System.out.println("나는 헤엄칩니다 미터: " + meter);
    }

    void makeCrowd(Fish otherfish) {
        System.out.println("나는 다른 물고기와 무리짓습니다.");
    }

    void sleep() {
    }

    Fish() {
    }

    public Fish(String gender, boolean havingPoison, String startSpawningDate, String endSpawningDate, String leavingSea) {
        this.gender = gender;
        this.havingPoison = havingPoison;
        this.startSpawningDate = startSpawningDate;
        this.endSpawningDate = endSpawningDate;
        this.leavingSea = leavingSea;
    }
}
