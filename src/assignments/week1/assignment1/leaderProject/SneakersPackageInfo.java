package assignments.week1.assignment1.leaderProject;

public class SneakersPackageInfo {

    private int daysForDeliver;
    private long cost;

    public int getDaysForDeliver() {
        return daysForDeliver;
    }

    public void setDaysForDeliver(int daysForDeliver) {
        this.daysForDeliver = daysForDeliver;
    }

    public long getCost() {
        return cost;
    }

    public void setCost(long cost) {
        this.cost = cost;
    }

    public SneakersPackageInfo(int daysForDeliver, long cost) {
        this.daysForDeliver = daysForDeliver;
        this.cost = cost;
    }
}
